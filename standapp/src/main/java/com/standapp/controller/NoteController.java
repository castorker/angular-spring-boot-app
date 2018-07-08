package com.standapp.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.standapp.model.Note;
import com.standapp.repository.NoteRepository;

@RestController
@RequestMapping("api/v1/")
public class NoteController {

	@Autowired
	private NoteRepository noteRepository; 
	
	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public List<Note> list() {
		return noteRepository.findAll();
	}
	
	@RequestMapping(value = "notes", method = RequestMethod.POST)
	public Note create(@RequestBody Note note) {
		Date now = Calendar.getInstance().getTime();
		note.setCreatedOn(now);
		note.setModifiedOn(now);
		return noteRepository.saveAndFlush(note);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.GET)
	public Note get(@PathVariable Long id) {
		return noteRepository.findOne(id);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.PUT)
	public Note update(@PathVariable Long id, @RequestBody Note note) {
		Date now = Calendar.getInstance().getTime();
		note.setModifiedOn(now);
		Note existingNote = noteRepository.findOne(id);
		BeanUtils.copyProperties(note, existingNote);
		return noteRepository.saveAndFlush(existingNote);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
	public Note delete(@PathVariable Long id) {
		Note existingNote = noteRepository.findOne(id);
		noteRepository.delete(existingNote);
		return existingNote;
	}
}

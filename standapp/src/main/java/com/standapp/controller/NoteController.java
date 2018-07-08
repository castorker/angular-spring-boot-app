package com.standapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.standapp.model.Note;

@RestController
@RequestMapping("api/v1/")
public class NoteController {

	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public List<Note> list() {
		return NoteStub.list();
	}
	
	@RequestMapping(value = "notes", method = RequestMethod.POST)
	public Note create(@RequestBody Note note) {
		return NoteStub.create(note);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.GET)
	public Note get(@PathVariable Long id) {
		return NoteStub.get(id);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.PUT)
	public Note update(@PathVariable Long id, @RequestBody Note note) {
		return NoteStub.update(id, note);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
	public Note delete(@PathVariable Long id) {
		return NoteStub.delete(id);
	}
}

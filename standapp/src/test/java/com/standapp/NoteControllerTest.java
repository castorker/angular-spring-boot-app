package com.standapp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.BeanUtils;

import com.standapp.controller.NoteController;
import com.standapp.model.Note;
import com.standapp.repository.NoteRepository;

public class NoteControllerTest {

	@InjectMocks
	private NoteController nc;

	@Mock
	private NoteRepository noteRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testNoteList() {

		Note n1 = new Note();
		n1.setId(1L);
		Note n2 = new Note();
		n2.setId(2L);

		List<Note> notes = new ArrayList<Note>();
		notes.add(n1);
		notes.add(n2);

		when(noteRepository.findAll()).thenReturn(notes);

		List<Note> notesFetched = nc.list();

		verify(noteRepository).findAll();

		assertThat(notesFetched.size(), is(greaterThanOrEqualTo(2)));
	}
	
	@Test
	public void testNotecreate() {
		
		Note newNote = new Note();
		newNote.setId(1L);
		newNote.setTeamMember("Johnnie");
		newNote.setProject("Spring Boot App");
		newNote.setWorkYesterday("Worked");
		newNote.setWorkToday("Work on");
		newNote.setImpediments("None");
		Date now = Calendar.getInstance().getTime();
		newNote.setCreatedOn(now);
		newNote.setModifiedOn(now);
	
		when(noteRepository.saveAndFlush(newNote)).thenReturn(newNote);
		
		Note noteCreated = nc.create(newNote);
		
		verify(noteRepository).saveAndFlush(newNote);
		
		assertThat(noteCreated, is(newNote));
	}
		
	@Test
	public void testNoteGet() {
		
		Note note = new Note();
		note.setId(1L);
		when(noteRepository.findOne(1L)).thenReturn(note);
		
//		NoteController nc = new NoteController();
		Note noteFound = nc.get(1l);
		
		verify(noteRepository).findOne(1L);
		
//		assertEquals(1L, noteFound.getId().longValue());
		assertThat(noteFound.getId(), is(1L));
	}
	
	@Test
	public void testNoteUpdate() {

		// create
		Note newNote = new Note();
		newNote.setId(1L);
		newNote.setTeamMember("Johnnie");
		newNote.setProject("Spring Boot App");
		newNote.setWorkYesterday("Worked");
		newNote.setWorkToday("Work on");
		newNote.setImpediments("None");
		Date now = Calendar.getInstance().getTime();
		newNote.setCreatedOn(now);
		newNote.setModifiedOn(now);

		when(noteRepository.saveAndFlush(newNote)).thenReturn(newNote);

		Note noteCreated = nc.create(newNote);

		verify(noteRepository).saveAndFlush(newNote);

		assertThat(noteCreated, is(newNote));

		// update
		when(noteRepository.findOne(1L)).thenReturn(newNote);
		
		Note noteFound = nc.get(1l);
		
		verify(noteRepository).findOne(1L);
		
		assertThat(noteFound.getId(), is(1L));
		assertThat(noteFound.getTeamMember(), is("Johnnie"));
		assertThat(noteFound.getProject(), is("Spring Boot App"));
		assertThat(noteFound.getWorkYesterday(), is("Worked"));
		assertThat(noteFound.getWorkToday(), is("Work on"));
		assertThat(noteFound.getImpediments(), is("None"));
		
		Note updateNote = new Note();
		updateNote.setId(1L);
		updateNote.setTeamMember("Johnnie");
		updateNote.setProject("Spring Boot App");
		updateNote.setWorkYesterday("Updated Worked");
		updateNote.setWorkToday("Updated Work on");
		updateNote.setImpediments("Updated None");
		now = Calendar.getInstance().getTime();
		updateNote.setModifiedOn(now);
		
		BeanUtils.copyProperties(updateNote, noteFound);
		
		when(noteRepository.saveAndFlush(noteFound)).thenReturn(noteFound);

		Note noteUpdated = nc.update(1L, noteFound);
		
		assertThat(noteUpdated.getId(), is(1L));
		assertThat(noteUpdated.getTeamMember(), is("Johnnie"));
		assertThat(noteUpdated.getProject(), is("Spring Boot App"));
		assertThat(noteUpdated.getWorkYesterday(), is("Updated Worked"));
		assertThat(noteUpdated.getWorkToday(), is("Updated Work on"));
		assertThat(noteUpdated.getImpediments(), is("Updated None"));
	}
	
	@Test
	public void testNoteDelete() {
		
		Note note = new Note();
		note.setId(1L);
		
		when(noteRepository.findOne(1L)).thenReturn(note);
		
		Note noteFound = nc.get(1L);
		
		verify(noteRepository).findOne(1L);
		
		assertThat(noteFound.getId(), is(1L));
		
		noteRepository.delete(noteFound);

		noteFound = nc.delete(1L);
		
		assertThat(noteFound.getId(), is(1L));
		
		when(noteRepository.findOne(1L)).thenReturn(noteFound).thenReturn(null);
		
		// assertThat(noteFound, is(nullValue()));
	}
}

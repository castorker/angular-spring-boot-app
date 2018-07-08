package com.standapp;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.util.List;

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
	public void testNoteGet() {
		
		Note n = new Note();
		n.setId(1L);
		when(noteRepository.findOne(1L)).thenReturn(n);
		
//		NoteController nc = new NoteController();
		Note note = nc.get(1l);
		
		verify(noteRepository).findOne(1L);
		
//		assertEquals(1L, note.getId().longValue());
		 assertThat(note.getId(), is(1L));
	}
}

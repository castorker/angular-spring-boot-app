package com.standapp;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.standapp.model.Note;
import com.standapp.repository.NoteRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class NoteRepositoryIntegrationTest {

	@Autowired
	private NoteRepository noteRepository;
	
	@Test
	public void testFindAll() {
		List<Note> notes = noteRepository.findAll();
		assertThat(notes.size(), is(greaterThanOrEqualTo(0)));
	}
	
	@Test
	public void testFindOne( ) {
		Note note = noteRepository.findOne(2L);
		assertThat(note.getId(), is(2L));
	}
}

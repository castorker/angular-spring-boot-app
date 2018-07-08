package com.standapp.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.standapp.model.Note;

public class NoteStub {
	private static Map<Long, Note> notes = new HashMap<Long, Note>();
	private static Long idIndex = 33L;
	
	// populate initial notes
	static {

		LocalDateTime now = LocalDateTime.now();
				
		Integer daysAgo = 10;
		
		// Notes inserted x days ago
		Date createdOn = Date.from(now.minusDays(daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		Date modifiedOn = createdOn;
		
		Note n1 = new Note(1L, "Johnnie", "Virtual Stand-up", "Setting up environment", "Note entity", "", createdOn, modifiedOn);
		notes.put(1L, n1);
		Note n2 = new Note(2L, "Walker", "Virtual Stand-up", "Setting up environment", "Project enntity", "", createdOn, modifiedOn);
		notes.put(2L, n2);
		Note n3 = new Note(3L, "Scotch", "Virtual Stand-up", "Setting up environment", "TeamMember entity", "", createdOn, modifiedOn);
		notes.put(3L, n3);
		
		// Notes inserted x-1 days ago
		// createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		// modifiedOn = createdOn;
		
		Note n4 = new Note(4L, "Johnnie", "Virtual Stand-up", "Note entity", "Notes view", "", createdOn, modifiedOn);
		notes.put(4L, n4);
		Note n5 = new Note(5L, "Walker", "Virtual Stand-up", "Project entity", "Projects view", "", createdOn, modifiedOn);
		notes.put(5L, n5);
		Note n6 = new Note(6L, "Scotch", "Virtual Stand-up", "TeamMember entity", "TeamMembers view", "", createdOn, modifiedOn);
		notes.put(6L, n6);
		
		// Notes inserted x-2 days ago
		// createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		// modifiedOn = createdOn;
		
		Note n7 = new Note(7L, "Johnnie", "Virtual Stand-up", "Notes view", "NoteDetails view", "", createdOn, modifiedOn);
		notes.put(7L, n7);
		Note n8 = new Note(8L, "Walker", "Virtual Stand-up", "Projects view", "ProjectDetails view", "", createdOn, modifiedOn);
		notes.put(8L, n8);
		Note n9 = new Note(9L, "Scotch", "Virtual Stand-up", "TeamMembers view", "TeamMemberDetails view", "", createdOn, modifiedOn);
		notes.put(9L, n9);
		
		// Notes inserted x-3 days ago
		createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		modifiedOn = createdOn;
		
		Note n10 = new Note(10L, "Jack", "Desktop App", "Setting up environment", "Note entity", "", createdOn, modifiedOn);
		notes.put(10L, n10);
		Note n11 = new Note(11L, "Daniels", "Desktop App", "Setting up environment", "Project enntity", "", createdOn, modifiedOn);
		notes.put(11L, n11);
		Note n12 = new Note(12L, "Tennessee", "Desktop App", "Setting up environment", "TeamMember entity", "", createdOn, modifiedOn);
		notes.put(12L, n12);
		
		// Notes inserted x-4 days ago
		createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		modifiedOn = createdOn;
		
		Note n13 = new Note(13L, "Jack", "Desktop App", "Note entity", "Notes view", "", createdOn, modifiedOn);
		notes.put(13L, n13);
		Note n14 = new Note(14L, "Daniels", "Desktop App", "Project entity", "Projects view", "", createdOn, modifiedOn);
		notes.put(14L, n14);
		Note n15 = new Note(15L, "Tennessee", "Desktop App", "TeamMember entity", "TeamMembers view", "", createdOn, modifiedOn);
		notes.put(15L, n15);
		
		// Notes inserted x-5 days ago
		createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		modifiedOn = createdOn;
		
		Note n16 = new Note(16L, "Jack", "Desktop App", "Notes view", "NoteDetails view", "", createdOn, modifiedOn);
		notes.put(16L, n16);
		Note n17 = new Note(17L, "Daniels", "Desktop App", "Projects view", "ProjectDetails view", "", createdOn, modifiedOn);
		notes.put(17L, n17);
		Note n18 = new Note(18L, "Tennessee", "Desktop App", "TeamMembers view", "TeamMemberDetails view", "", createdOn, modifiedOn);
		notes.put(18L, n18);
		
		// Notes inserted x-6 days ago
		createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		modifiedOn = createdOn;
		
		Note n19 = new Note(19L, "John", "Web App", "Setting up environment", "Note entity", "", createdOn, modifiedOn);
		notes.put(19L, n19);
		Note n20 = new Note(20L, "Jameson", "Web App", "Setting up environment", "Project enntity", "", createdOn, modifiedOn);
		notes.put(20L, n20);
		Note n21 = new Note(21L, "Irish", "Web App", "Setting up environment", "TeamMember entity", "", createdOn, modifiedOn);
		notes.put(21L, n21);
		
		// Notes inserted x-7 days ago
		createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		modifiedOn = createdOn;
		
		Note n22 = new Note(22L, "John", "Web App", "Note entity", "Notes view", "", createdOn, modifiedOn);
		notes.put(22L, n22);
		Note n23 = new Note(23L, "Jameson", "Web App", "Project entity", "Projects view", "", createdOn, modifiedOn);
		notes.put(23L, n23);
		Note n24 = new Note(24L, "Irish", "Web App", "TeamMember entity", "TeamMembers view", "", createdOn, modifiedOn);
		notes.put(24L, n24);
		
		// Notes inserted x-8 days ago
		createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		modifiedOn = createdOn;
		
		Note n25 = new Note(25L, "John", "Web App", "Notes view", "NoteDetails view", "", createdOn, modifiedOn);
		notes.put(25L, n25);
		Note n26 = new Note(26L, "Jameson", "Web App", "Projects view", "ProjectDetails view", "", createdOn, modifiedOn);
		notes.put(26L, n26);
		Note n27 = new Note(27L, "Irish", "Web App", "TeamMembers view", "TeamMemberDetails view", "", createdOn, modifiedOn);
		notes.put(27L, n27);

		// Notes inserted x-9 days ago
		createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		modifiedOn = createdOn;
		
		Note n28 = new Note(28L, "Tullamore", "Mob App", "Note entity", "Notes view", "", createdOn, modifiedOn);
		notes.put(28L, n28);
		Note n29 = new Note(29L, "Dew", "Mob App", "Project entity", "Projects view", "", createdOn, modifiedOn);
		notes.put(29L, n29);
		Note n30 = new Note(30L, "Irish", "Mob App", "TeamMember entity", "TeamMembers view", "", createdOn, modifiedOn);
		notes.put(30L, n30);
		
		// Notes inserted x-10 days ago
		createdOn = Date.from(now.minusDays(--daysAgo).atZone(ZoneId.systemDefault()).toInstant());
		modifiedOn = createdOn;
		
		Note n31 = new Note(31L, "Tullamore", "Mob App", "Notes view", "NoteDetails view", "", createdOn, modifiedOn);
		notes.put(31L, n31);
		Note n32 = new Note(32L, "Dew", "Mob App", "Projects view", "ProjectDetails view", "", createdOn, modifiedOn);
		notes.put(32L, n32);
		Note n33 = new Note(33L, "Irish", "Mob App", "TeamMembers view", "TeamMemberDetails view", "", createdOn, modifiedOn);
		notes.put(33L, n33);
	}
	
	public static List<Note> list() {
		return new ArrayList<Note>(notes.values());
	}
	
	public static Note create(Note note) {
		idIndex += 1;
		note.setId(idIndex);
		Date now = Calendar.getInstance().getTime();
		note.setCreatedOn(now);
		note.setModifiedOn(now);
		notes.put(idIndex, note);
		return note;
	}
	
	public static Note get(Long id) {
		return notes.get(id);
	}
	
	public static Note update(Long id, Note note) {
		Date now = Calendar.getInstance().getTime();
		note.setModifiedOn(now);
		notes.put(id, note);
		return note;
	}
	
	public static Note delete(Long id) {
		return notes.remove(id);
	}
}

package com.huskycode.ath2013.refactor;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.huskycode.ath2013.refactor.type.Room;

public class CoreTest {
	private Core core;

	@Before
	public void before() {
		core = new Core();
	}
	
	@Test
	public void listParticipantsShouldReturnsBlankAndCreateRoomWhenRoomNotExistsBefore() {
		List<String> participants = core.listParticipants("aRoom");
	    assertEquals(0, participants.size()); 
	}
	
	@Test
	public void addParticipantShouldCreateARoomWhenRoomNotExistsBefore() {
		core.addParticipant("aRoom", "aParticipant");
	    assertEquals(1, core.listParticipants("aRoom").size()); 
	    assertEquals("aParticipant", core.listParticipants("aRoom").get(0));
	}
	
	@Test
	public void addParticipantShouldInsertInOrder() {
		core.addParticipant("aRoom", "participant1");
		core.addParticipant("aRoom", "participant2");
		
	    assertEquals(2, core.listParticipants("aRoom").size()); 
	    assertEquals("participant1", core.listParticipants("aRoom").get(0));
	    assertEquals("participant2", core.listParticipants("aRoom").get(1));
	}

	@Test
	public void listStoriesShouldReturnsBlankAndCreateRoomWhenRoomNotExistsBefore() {
		List<String> participants = core.listStories("aRoom");
	    assertEquals(0, participants.size()); 
	}
	
	@Test
	public void addStoryShouldCreateARoomWhenRoomNotExistsBefore() {
		core.addStory("aRoom", "aStory");
	    assertEquals(1, core.listStories("aRoom").size()); 
	    assertEquals("aStory", core.listStories("aRoom").get(0));
	}
	
	@Test
	public void addStoryShouldInsertInOrder() {
		core.addStory("aRoom", "story1");
		core.addStory("aRoom", "story2");
		
	    assertEquals(2, core.listStories("aRoom").size()); 
	    assertEquals("story1", core.listStories("aRoom").get(0));
	    assertEquals("story2", core.listStories("aRoom").get(1));
	}
}

package com.huskycode.ath2013.refactor;

import java.util.List;

import com.huskycode.ath2013.refactor.type.Room;

public class Core {
	private DataStore dataStore;
	
	public Core() {
		dataStore = new DataStore();
	}

	public List<String> listParticipants(String roomName) {
		if(dataStore.getRoom(roomName) == null)
			dataStore.putRoom(roomName, new Room());
		
		return dataStore.getRoom(roomName).participants;
	}
	
	public void addParticipant(String roomName, String participantName) {
		if(dataStore.getRoom(roomName) == null)
			dataStore.putRoom(roomName, new Room());
		
		dataStore.getRoom(roomName).participants.add(participantName);
	}
	
	public List<String> listStories(String roomName) {
		if(dataStore.getRoom(roomName) == null)
			dataStore.putRoom(roomName, new Room());
		
		return dataStore.getRoom(roomName).stories;
	}
	
	public void addStory(String roomName, String storyName) {
		if(dataStore.getRoom(roomName) == null)
			dataStore.putRoom(roomName, new Room());
		
		dataStore.getRoom(roomName).stories.add(storyName);
	}
}

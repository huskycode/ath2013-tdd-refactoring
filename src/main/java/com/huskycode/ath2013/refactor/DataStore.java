package com.huskycode.ath2013.refactor;

import java.util.HashMap;
import java.util.Map;

import com.huskycode.ath2013.refactor.type.Room;

public class DataStore {
    Map<String, Room> data;

    public DataStore() {
        data = new HashMap<String, Room>();
    }

    public Room getRoom(String name) {
        return data.get(name);
    }

    public Room putRoom(String name, Room room) {
        return data.put(name, room);
    }
}

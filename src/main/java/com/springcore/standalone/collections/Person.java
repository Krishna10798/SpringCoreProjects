package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	
	private Map<String,Integer> roomRent;
	
	private Properties properties;
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getRoomRent() {
		return roomRent;
	}

	public void setRoomRent(Map<String, Integer> roomRent) {
		this.roomRent = roomRent;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", roomRent=" + roomRent + "]";
	}



}

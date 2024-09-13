package com.ibm.training.io.serialization;

import java.io.Serializable;

public class GameInfo implements Serializable{
	
	String avatar = "sporty human";
	int level = 1;
	int points;
	int livesLeft = 10;
	
	
	@Override
	public String toString() {
		return "GameInfo [avatar=" + avatar + ", level=" + level + ", points=" + points + ", livesLeft=" + livesLeft
				+ "]";
	}
	
	

}

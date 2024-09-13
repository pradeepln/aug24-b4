package com.ibm.training.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Game {
	
	GameInfo info = new GameInfo();
	
	public void play() {
		//simulate playing
		
		info.points++;
		info.livesLeft--;
		
		//other stuff
	}
	
	public void restoreGame() {
		try {
			FileInputStream fos = new FileInputStream("D:\\temp\\Aug24\\b4\\game.ser");
			ObjectInputStream ois = new ObjectInputStream(fos);
			this.info = (GameInfo) ois.readObject(); //deserialization
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveGame() {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\temp\\Aug24\\b4\\game.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(info); //serialization
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.restoreGame();
		System.out.println("Game restored..Current state:\n"+game.info);
		
		game.play();
		
		System.out.println("After playing..Current state:\n"+game.info);
		System.out.println("Enter some key yo exit...");
		
		Scanner kb = new Scanner(System.in);
		kb.nextLine();
		
		game.saveGame();
	}

}

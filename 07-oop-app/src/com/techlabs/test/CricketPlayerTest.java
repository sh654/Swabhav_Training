package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.CricketPlayer;
import com.techlabs.model.Student;

public class CricketPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		CricketPlayer players[] = new CricketPlayer[11];
		for(int i=0; i< players.length; i++) {
			System.out.println("Enter Id of player: ");
			int playerId = scanner.nextInt();
			System.out.println("Enter name of player: ");
			String playerName = scanner.next();
			System.out.println("Enter name of player: ");
			int numberOfMatches = scanner.nextInt();
			System.out.println("Enter name of player: ");
			int runs = scanner.nextInt();
			System.out.println("Enter name of player: ");
			int numberOfWickets = scanner.nextInt();
			players[i] = new CricketPlayer(playerId,  playerName,  numberOfMatches, runs, numberOfWickets);
		}
		
		for(int i=0; i<players.length; i++) {
			players[i].display();
			System.out.println("Average: " +players[i].calculateAverage());
		}
		/*
		System.out.println(player1.getPlayerId());
		System.out.println(player1.getPlayerName());
		System.out.println(player1.getNumberOfMatches());
		System.out.println(player1.getRuns());
		System.out.println(player1.getNumberOfWickets());
		*/
		
//		player1.display();
		//System.out.println("Average of "+player1.getPlayerName()+" whose runs are "+player1.getRuns()+" in matches "+player1.getNumberOfMatches()+"is : "+player1.calculateAverage());
		
		
	}

}

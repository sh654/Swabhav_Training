package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;
import com.techlabs.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeGameTest {

	private char [][] board;
	private final int rows = 3;
	private final int columns = 3;
	
	@BeforeEach
	void init() {	
		board = new char[rows][columns];
		TicTacToeGame.createBoard(board, rows,columns);
	}
	
	
	@Test
	void testCreateBoard() {
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				assertEquals('-', board[i][j]);
			}
		}
	}
	
	@Test
	void testValidMove() {
		assertTrue(TicTacToeGame.validMove(board, 2, 2));
		board[2][2] = '0';
		assertFalse(TicTacToeGame.validMove(board, 2, 2));
//		assertTrue(TicTacToeGame.validMove(board, 2, 2));  Error dega veh since 0 baith gaya hai pehle
	}
	
	@Test
	void testBoardFull() {
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++) {
				board[i][j]='X';
			}
		}
		
		assertTrue(TicTacToeGame.boardFull(board, rows, columns));
		
	}

	
	
}

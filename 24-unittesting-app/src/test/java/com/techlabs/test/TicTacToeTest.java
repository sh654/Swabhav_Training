package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {

	char [][] board;
	
	@BeforeEach
	void init() {
		int rows = 3;
		int columns = 3;
		board = new char[rows][columns];
	}
	
	@Test
	void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	void testCreateBoard() {
		
		assertEquals(board[3][3], board);
	}

}

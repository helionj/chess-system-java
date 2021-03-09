package com.helion.application;

import com.helion.boardgame.Board;
import com.helion.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
	}

}

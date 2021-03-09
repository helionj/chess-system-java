package com.helion.chess.pieces;

import com.helion.boardgame.Board;
import com.helion.chess.ChessPiece;
import com.helion.chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "K";
	}

}

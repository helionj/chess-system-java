package com.helion.chess.pieces;

import com.helion.boardgame.Board;
import com.helion.chess.ChessPiece;
import com.helion.chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "R";
	}

}

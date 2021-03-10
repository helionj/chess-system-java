package com.helion.chess;

import com.helion.boardgame.Board;
import com.helion.boardgame.Piece;

public abstract class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	

	
	
	
}

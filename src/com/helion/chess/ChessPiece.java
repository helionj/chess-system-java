package com.helion.chess;

import com.helion.boardgame.Board;
import com.helion.boardgame.Piece;
import com.helion.boardgame.Position;

public abstract class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	//public ChessPosition getChessPiece() {
	//	return ChessPosition.fromPosition(position);
	//}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
		
	}
	
	

	

	
	
	
}

package com.helion.chess;

import com.helion.boardgame.BoardException;

public class ChessException extends BoardException{
	
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}

}
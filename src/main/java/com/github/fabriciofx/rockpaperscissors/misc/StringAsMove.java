/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Fabrício Barros Cabral
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 */
package com.github.fabriciofx.rockpaperscissors.misc;

import com.github.fabriciofx.rockpaperscissors.api.Move;
import com.github.fabriciofx.rockpaperscissors.api.Moves;
import com.github.fabriciofx.rockpaperscissors.api.SafeMoves;
import com.github.fabriciofx.rockpaperscissors.api.SmartMoves;

public final class StringAsMove implements Move {
	private final Moves moves;
	private final String string;

	public StringAsMove(final String string) {
		this(
			new SafeMoves(
				new SmartMoves()
			),
			string
		);
	}

	public StringAsMove(final Moves moves, final String string) {
		this.moves = moves;
		this.string = string;
	}

	@Override
	public int compareTo(final Move move) {
		return this.moves.move(this.code()).compareTo(move);
	}

	@Override
	public int code() {
		int code = 0;
		switch(this.string.charAt(0)) {
		case 'r':
		case 'R':
			code = 0;
			break;
		case 'p':
		case 'P':
			code = 1;
			break;
		case 's':
		case 'S':
			code = 2;
			break;
		}
		return code;
	}
	
	@Override
	public String toString() {
		return this.moves.move(this.code()).toString();
	}
}

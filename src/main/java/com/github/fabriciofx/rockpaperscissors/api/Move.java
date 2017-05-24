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
package com.github.fabriciofx.rockpaperscissors.api;

public final class Move implements Comparable<Move> {
	private final int code;
	private final String name;

	public Move(final int code, final String name) {
		this.code = code;
		this.name = name;
	}

	public int code() {
		return this.code;
	}

	@Override
	public String toString() {
		return this.name;
	}

	// This algorithm has been found here:
	// https://stackoverflow.com/questions/11377117/rock-paper-scissors-determine-win-loss-tie-using-math
	@Override
	public int compareTo(final Move move) {
		final int cmp;
		if (this.code() == move.code()) {
			cmp = 0;
		} else if ((this.code() - move.code() + 3) % 3 == 1) {
			cmp = -1;
		} else {
			cmp = 1;
		}
		return cmp;
	}
}

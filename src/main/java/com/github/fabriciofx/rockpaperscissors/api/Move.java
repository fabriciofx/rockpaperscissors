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
	private final String name;

	public Move(final String name) {
		this.name = name;
	}

	@Override
	public int compareTo(final Move move) {
		final int cmp;
		if (this.name.equals("Rock") && move.name.equals("Scissors")
			|| this.name.equals("Paper") && move.name.equals("Rock")
			|| this.name.equals("Scissors") && move.name.equals("Paper")) {
			cmp = -1;
		} else if (this.name.equals("Rock") && move.name.equals("Paper")
			|| this.name.equals("Paper") && move.name.equals("Scissors")
			|| this.name.equals("Scissors") && move.name.equals("Rock")) {
			cmp = 1;
		} else {
			cmp = 0;
		}
		return cmp;	
	}
	
	@Override
	public String toString() {
		return name;
	}
}

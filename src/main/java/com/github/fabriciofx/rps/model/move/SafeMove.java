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
package com.github.fabriciofx.rps.model.move;

public final class SafeMove implements Move {
	private final Move origin;
	
	public SafeMove(final Move origin) {
		this.origin = origin;
	}
	
	@Override
	public int code() {
		if (this.origin == null) {
			throw new InvalidMoveException();
		}
		return this.origin.code();
	}

	@Override
	public int compareTo(final Move move) {
		if (this.origin == null || move == null) {
			throw new InvalidMoveException();
		}
		return this.origin.compareTo(move);
	}
}

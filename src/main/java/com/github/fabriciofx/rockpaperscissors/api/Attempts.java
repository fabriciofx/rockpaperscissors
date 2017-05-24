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

public final class Attempts {
	private final PrintedMatch match;
	private final int max;
	
	public Attempts(final PrintedMatch match, final int max) {
		this.match = match;
		this.max = max;
	}
	
	public boolean matches() {
		int t = 0;
		while (t++ < this.max) {
			this.match.result();
		}
		return t <= this.max;
	}
}

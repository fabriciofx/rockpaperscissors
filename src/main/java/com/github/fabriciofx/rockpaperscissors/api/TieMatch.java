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

public final class TieMatch implements ResultMatch {
	private final Player one;
	private final Move moveOne;
	private final Player two;
	private final Move moveTwo;

	public TieMatch(final Player one, final Move moveOne,
		final Player two, final Move moveTwo) {
		this.one = one;
		this.moveOne = moveOne;
		this.two = two;
		this.moveTwo = moveTwo;
	}

	@Override
	public String toString() {
		return String.format(
			"Tie!! %s played %s and %s played %s\n",
			this.one.name(),
			this.moveOne,
			this.two.name(),
			this.moveTwo
		);
	}
}

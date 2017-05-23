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
package com.github.fabriciofx.rockpaperscissors;

import java.util.Random;

public final class Computer implements Player {
	private final Move[] moves;
	
	public Computer() {
		this(new Move("Rock"), new Move("Paper"), new Move("Scissors"));
	}
	
	public Computer(final Move... moves) {
		this.moves = moves;
	}
	
	@Override
	public String name() {
		return "The Computer";
	}
	
	@Override
	public Move move(final Ui ui) {
		return this.moves[new Random().nextInt(3)];
	}	
}

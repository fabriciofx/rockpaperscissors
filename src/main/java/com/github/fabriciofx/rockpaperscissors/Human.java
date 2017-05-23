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

import java.util.HashMap;
import java.util.Map;

public final class Human implements Player {
	private final Ui ui;
	private final Map<Character, Move> moves;
	
	public Human() {
		this(new Console());
	}
	
	public Human(final Ui ui) {
		this(ui,
			new HashMap<Character, Move>() {
			private static final long serialVersionUID = -4810641108913835343L;
			{
				put('R', new Move("Rock"));
				put('P', new Move("Paper"));
				put('S', new Move("Scissors"));
			}}
		);
	}
	
	public Human(final Ui ui, final Map<Character, Move> moves) {
		this.ui = ui;
		this.moves = moves;
	}
	
	@Override
	public String name() {
		return "You";
	}
	
	@Override
	public Move move() {
		return this.moves.get(
			Character.toUpperCase(
				this.ui.character(
					"What is your move (Rock, Paper or Scissors)? ",
					"[rpsRPS]"
				)
			)
		);
	}
}

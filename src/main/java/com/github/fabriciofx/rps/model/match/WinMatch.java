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
package com.github.fabriciofx.rps.model.match;

import com.github.fabriciofx.rps.model.Player;
import com.github.fabriciofx.rps.model.move.Move;

public final class WinMatch implements ResultMatch {
	private final Player winner;
	private final Move winnerMove;
	private final Player looser;
	private final Move looserMove;

	public WinMatch(final Player winner, final Move winnerMove, final Player looser,
		final Move looserMove) {
		this.winner = winner;
		this.winnerMove = winnerMove;
		this.looser = looser;
		this.looserMove = looserMove;
	}
	
	@Override
	public String toString() {
		return String.format(
			"%s wins!! %s played %s and %s played %s\n",
			this.winner.name(),
			this.winner.name(),
			this.winnerMove,
			this.looser.name(),
			this.looserMove
		);
	}
}

package com.github.fabriciofx.rockpaperscissors;

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

package com.github.fabriciofx.rockpaperscissors;

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

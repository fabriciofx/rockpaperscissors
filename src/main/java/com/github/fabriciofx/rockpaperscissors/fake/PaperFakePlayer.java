package com.github.fabriciofx.rockpaperscissors.fake;

import com.github.fabriciofx.rockpaperscissors.api.Move;
import com.github.fabriciofx.rockpaperscissors.api.Player;

public final class PaperFakePlayer implements Player {
	@Override
	public String name() {
		return "Paper Fake Player";
	}

	@Override
	public Move move() {
		return new Move("Paper");
	}
}

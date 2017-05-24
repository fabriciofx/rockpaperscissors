package com.github.fabriciofx.rockpaperscissors.fake;

import com.github.fabriciofx.rockpaperscissors.api.Move;
import com.github.fabriciofx.rockpaperscissors.api.Player;

public final class RockFakePlayer implements Player {
	@Override
	public String name() {
		return "Rock Fake Player";
	}

	@Override
	public Move move() {
		return new Move("Rock");
	}
}

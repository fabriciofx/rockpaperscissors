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
package com.github.fabriciofx.rps.model;

import com.github.fabriciofx.rps.model.move.SafeMoves;
import com.github.fabriciofx.rps.model.move.SmartMoves;
import com.github.fabriciofx.rps.view.SelectUi;
import com.github.fabriciofx.rps.view.Ui;

public final class Main {
	public static void main(String[] args) {
		final Ui ui = new SelectUi().select(args);
		new RockPaperScissors(
			ui,
			new Computer(
				new SafeMoves(
					new SmartMoves()
				)
			),
			new Human(ui),
			3
		).play();
	}
}

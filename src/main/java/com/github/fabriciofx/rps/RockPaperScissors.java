/**
 * The MIT License (MIT)
 * 
 * Copyright (C) 2017 Fabrício Barros Cabral
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.fabriciofx.rps;

import com.github.fabriciofx.rps.match.Match;
import com.github.fabriciofx.rps.match.PrintedMatch;
import com.github.fabriciofx.rps.view.Console;
import com.github.fabriciofx.rps.view.Ui;

public final class RockPaperScissors {
	private final Ui ui;
	private final Player one;
	private final Player two;
	private final int matches;

	public RockPaperScissors() {
		this(new Console());
	}

	public RockPaperScissors(final Ui ui) {
		this(ui, new Person());
	}

	public RockPaperScissors(final Ui ui, final Player one) {
		this(ui, one, new Computer());
	}

	public RockPaperScissors(final Ui ui, final Player one, final Player two) {
		this(ui, one, two, 3);
	}

	public RockPaperScissors(final Ui ui, final Player one, final Player two,
		final int matches) {
		this.ui = ui;
		this.one = one;
		this.two = two;
		this.matches = matches;
	}
	
	public void play() {
		new Attempts(
			new PrintedMatch(
				new Match(
					this.one,
					this.two
				),
				this.ui
			),
			this.matches
		).matches();
	}
}

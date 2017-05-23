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

public final class Match {
	private final Ui ui;
	private final Player one;
	private final Player two;

	public Match(final Ui ui, final Player one, final Player two) {
		this.ui = ui;
		this.one = one;
		this.two = two;
	}

	public void start() {
		final Move one = this.one.move(this.ui);
		final Move two = this.two.move(this.ui);
		switch(one.compareTo(two)) {
		case -1:
			ui.print(
				String.format(
					"%s wins!! %s played %s and %s played %s\n",
					this.one.name(),
					this.one.name(),
					one,
					this.two.name(),
					two
				)
			);
			break;
		case 0:
			ui.print(
				String.format(
					"Tie!! %s played %s and %s played %s\n",
					this.one.name(),
					one,
					this.two.name(),
					two
				)
			);
			break;
		case 1:
			ui.print(
				String.format(
					"%s wins!! %s played %s and %s played %s\n",
					this.two.name(),
					this.one.name(),
					one,
					this.two.name(),
					two
				)
			);
			break;
		}
	}
}

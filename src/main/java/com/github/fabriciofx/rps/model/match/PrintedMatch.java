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

import com.github.fabriciofx.rps.model.view.Ui;

public final class PrintedMatch {
	private final Ui ui;
	private final Match match;

	public PrintedMatch(final Match match, final Ui ui) {
		this.match = match;
		this.ui = ui;
	}

	public ResultMatch result() {
		final ResultMatch result = this.match.result();
		this.ui.print(result.toString());
		return result;
	}
}

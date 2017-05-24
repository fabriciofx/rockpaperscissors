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
package com.github.fabriciofx.rockpaperscissors.api;

import java.util.NoSuchElementException;

import javax.swing.JOptionPane;

public final class Gui implements Ui {

	@Override
	public void print(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public char character(final String message, final String pattern) {
		final String s = JOptionPane.showInputDialog(message);
		if (!s.matches(pattern)) {
			throw new NoSuchElementException();
		}
		return s.charAt(0);
	}
}

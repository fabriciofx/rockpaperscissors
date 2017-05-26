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
package com.github.fabriciofx.rps.view;

import java.util.Scanner;

public final class Console implements Ui {
	@Override
	public void print(final String message) {
		System.out.print(message);
	}

	@SuppressWarnings("resource")
	@Override
	public String string(final String message) {
		this.print(message);
		return new Scanner(System.in).next();
	}
}

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
package com.github.fabriciofx.rps.misc;

public final class CheckedValue implements CharSequence {
	private final CharSequence value;
	private final String regex;
	
	public CheckedValue(final CharSequence value, final String regex) {
		this.value = value;
		this.regex = regex;
	}
	
	@Override
	public int length() {
		if (!this.value.toString().matches(this.regex)) {
			throw new IllegalArgumentException("error: out of specification");
		}
		return this.value.length();
	}

	@Override
	public char charAt(final int index) {
		if (!this.value.toString().matches(this.regex)) {
			throw new IllegalArgumentException("error: out of specification");
		}
		return this.value.charAt(index);
	}

	@Override
	public CharSequence subSequence(final int start, final int end) {
		if (!this.value.toString().matches(this.regex)) {
			throw new IllegalArgumentException("error: out of specification");
		}
		return this.value.subSequence(start, end);
	}
}

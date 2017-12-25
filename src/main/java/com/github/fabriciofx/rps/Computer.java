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

import java.util.Random;

import com.github.fabriciofx.rps.move.Move;
import com.github.fabriciofx.rps.move.Moves;
import com.github.fabriciofx.rps.move.SafeMoves;
import com.github.fabriciofx.rps.move.SmartMoves;

/**
 * Computer player. 
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public final class Computer implements Player {
	/**
	 * The moves. 
	 */
	private final Moves moves;

	/**
	 * Ctor.
	 */
	public Computer() {
		this(
			new SafeMoves(
				new SmartMoves()
			)
		);
	}

    /**
     * Ctor.
     * @param moves The moves
     */
    public Computer(final Moves moves) {
        this.moves = moves;
    }

    @Override
    public String name() {
        return "The Computer";
    }

    @Override
    public Move move() {
        return this.moves.move(new Random().nextInt(3));
    }
}

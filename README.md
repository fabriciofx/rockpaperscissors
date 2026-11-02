# rockpaperscissors

[![EO principles respected
here](http://www.elegantobjects.org/badge.svg)](http://www.elegantobjects.org)
[![We recommend IntelliJ
IDEA](http://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)

[![java-build](https://github.com/fabriciofx/rockpaperscissors/actions/workflows/java-build.yml/badge.svg)](https://github.com/fabriciofx/rockpaperscissors/actions/workflows/java-build.yml)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/fabriciofx/rockpaperscissors/blob/main/LICENSE.txt)

**rockpaperscissors** is a [true
object-oriented](http://www.elegantobjects.org/) implementation of the famous
[Rock, Paper and
Scissors](https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors)
game.

## What does *true object-oriented* mean?

This application follows these fundamental principles:

- No `null` ([why?](http://www.yegor256.com/2014/05/13/why-null-is-bad.html))
- No code in constructors ([why?](http://www.yegor256.com/2015/05/07/ctors-must-be-code-free.html))
- No getters and setters ([why?](http://www.yegor256.com/2014/09/16/getters-and-setters-are-evil.html))
- No mutable objects ([why?](http://www.yegor256.com/2014/06/09/objects-should-be-immutable.html))
- No `static` methods, not even `private` ones ([why?](http://www.yegor256.com/2017/02/07/private-method-is-new-class.html))
- No `instanceof`, type casting, or reflection ([why?](http://www.yegor256.com/2015/04/02/class-casting-is-anti-pattern.html))
- No implementation inheritance ([why?](http://www.yegor256.com/2016/09/13/inheritance-is-procedural.html))
- No public methods without `@Override`
- No statements in test methods except `assertThat` ([why?](http://www.yegor256.com/2017/05/17/single-statement-unit-tests.html))

If you want to know more about true object-oriented programming, I recommend
these books:

- [Elegant Objects (Volume
1)](https://www.amazon.com/Elegant-Objects-1-Yegor-Bugayenko/dp/1519166915) by
[Yegor Bugayenko](http://www.yegor256.com)
- [Elegant Objects (Volume
2)](https://www.amazon.com/Elegant-Objects-2-Yegor-Bugayenko/dp/1534908307) by
[Yegor Bugayenko](http://www.yegor256.com)
- [Object
Thinking](https://www.amazon.com/Object-Thinking-Developer-Reference-David/dp/0735619654)
by [David West](http://davewest.us)

## How to use it?

You need Java 21 or newer and Maven 3.6.3 or newer.

First, build it:

```bash
mvn clean package
```

Then, run it:

```bash
java -jar target/rockpaperscissors-VERSION-jar-with-dependencies.jar
```

Change *VERSION* for the version found in `pom.xml` file.

You play three rounds against the computer. In each round, type `r` for Rock,
`p` for Paper or `s` for Scissors (uppercase also works).

By default, the game runs in the terminal. To pick the user interface, pass
one of these options:

| Option  | User interface                |
|---------|-------------------------------|
| `--cli` | Terminal (default)            |
| `--gui` | Graphical dialog windows      |

For example:

```bash
java -jar target/rockpaperscissors-VERSION-jar-with-dependencies.jar --gui
```

Any other option prints the valid ones and exits with status `1`.

## How to contribute?

Build the project with the [qulice](https://github.com/yegor256/qulice) static
analysis enabled and make sure it passes before sending a pull request:

```bash
mvn clean install -Pqulice
```

## License

The MIT License (MIT)

Copyright (C) 2017-2026 Fabrício Barros Cabral

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

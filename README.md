# rockpaperscissors

**rockpaperscissors** is a is a [true object-oriented](http://www.yegor256.com/2014/11/20/seven-virtues-of-good-object.html)
implementation of the famous [Rock, Paper and Scissors](https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors) game.


## What does *true object-oriented* means?

This application follows these four fundamental principles:

 1. not a single `null` ([why NULL is bad?](http://www.yegor256.com/2014/05/13/why-null-is-bad.html))
 2. not a single `public` `static` method ([why they are bad?](http://www.yegor256.com/2014/05/05/oop-alternative-to-utility-classes.html))
 3. not a single mutable class ([why they are bad?](http://www.yegor256.com/2014/06/09/objects-should-be-immutable.html))
 4. not a single `instanceof` keyword, type casting, or reflection ([why?](http://www.yegor256.com/2015/04/02/class-casting-is-anti-pattern.html))

If you want to know more about true object-oriented programming, I recommend
these books:

- [Elegant Objects (Volume 1)](https://www.amazon.com/Elegant-Objects-1-Yegor-Bugayenko/dp/1519166915) by
[Yegor Bugayenko](http://www.yegor256.com)
- [Elegant Objects (Volume 2)](https://www.amazon.com/Elegant-Objects-2-Yegor-Bugayenko/dp/1534908307) by
[Yegor Bugayenko](http://www.yegor256.com)
- [Object Thinking](https://www.amazon.com/Object-Thinking-Developer-Reference-David/dp/0735619654)
by [David West](http://davewest.us)


## How use it?

First, build it:

```
$ mvn clean package
```

Then, run:

```
$ java -jar target/rockpaperscissors-<version>-jar-with-dependencies.jar
```

Change *<version>* for the version found in `pom.xml` file.


## License

The MIT License (MIT)

Copyright (C) 2017 Fabrício Barros Cabral

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

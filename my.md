# BOOK
=============================
```
<Scala程序设计（第2版）>(201603,ISBN:9787115416810,王渊译)
```

[Programming Scala, 2nd Edition (O'Reilly)](http://shop.oreilly.com/product/0636920033073.do)

[Example Code](https://github.com/deanwampler/prog-scala-2nd-ed-code-examples)

[scala](http://www.scala-lang.org/)

[sbt](http://www.scala-sbt.org/)

[Scala IDE](http://scala-ide.org/)

[sbteclipse](https://github.com/sbt/sbteclipse)

[sbt-dependency-graph](https://github.com/jrudolph/sbt-dependency-graph)

[Akka](https://akka.io/)


# Prerequisites
=============================

## SBT
```shell
$ sbt
>
reload
about
clean
eclipse
compile
package
console
dependencyTree
dependencyBrowseGraph
```


# Examples
=============================

## ch01 introscala
```shell
$ scalac -version
Scala compiler version 2.11.12 -- Copyright 2002-2017, LAMP/EPFL
$ scala -version
Scala code runner version 2.11.12 -- Copyright 2002-2017, LAMP/EPFL
$ scala src/main/scala/progscala2/introscala/upper1.sc
$ scala
scala> val s = "Hello, World!"
scala> println("Hello, World!")
scala> 1 + 2
scala> s.contains("el")
scala> :quit
$ sbt console
scala> :load src/main/scala/progscala2/introscala/upper1.sc
#
# 1.3　使用Scala
# 将脚本文件编译为JVM 的字节码（一组.class 文件）
$ scalac -d target/ -Xscript Upper1 src/main/scala/progscala2/introscala/upper1.sc
$ scala -cp target/ Upper1
$ javap -cp target/ Upper1
$ scalap -cp target/ Upper1
# 重构代码
$ scala src/main/scala/progscala2/introscala/upper2.sc
$ scalac -d target/ src/main/scala/progscala2/introscala/upper1.scala
$ scala -cp target/ progscala2.introscala.Upper Hello World!
$ sbt
> run-main progscala2.introscala.Upper Hello World!
> run-main progscala2.introscala.Upper2 Hello World!
#
# 1.4　并发
> run-main progscala2.introscala.shapes.ShapesDrawingDriver
> run
```

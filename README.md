# A [Giter8][g8]/[SBT][sbt]/[Scala][scala] template

A Giter8 template for a fully configured Scala SBT single but multibuild ready project. It is configured in a slightly opinionated but mostly dependency free fashion.

All versions will always stay hardcoded as opposed to being chooseable or automatically updatable via Giter8 in order to guarantee the soundness of the build. In other words, assuming you don't have any global settings/plugins the build won't break unless you manually break it by changing versions by hand. Enjoy!

```bash
sbt --supershell=false new DevInsideYou/scala-seed.g8
```

\* The ["super shell"][supershell] feature introduced in SBT v1.3.0 does not play well with Giter8.

[g8]: http://www.foundweekends.org/giter8/
[sbt]: https://www.scala-sbt.org/
[scala]: https://www.scala-lang.org/
[supershell]: http://eed3si9n.com/super-shell-for-sbt

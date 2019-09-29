object Build {
  def styled(in: Any): String =
    scala.Console.CYAN + in + scala.Console.RESET
}

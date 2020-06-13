package in.everyogi.p02

object P02 {
  def penultimate[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last
}

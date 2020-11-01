// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/christianluetticke/Documents/untitled/conf/routes
// @DATE:Sun Nov 01 08:41:38 CET 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/christianluetticke/Documents/untitled/conf/routes
// @DATE:Sun Nov 01 08:41:38 CET 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseScalaEventSourceController ScalaEventSourceController = new controllers.ReverseScalaEventSourceController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseScalaCometController ScalaCometController = new controllers.ReverseScalaCometController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseScalaEventSourceController ScalaEventSourceController = new controllers.javascript.ReverseScalaEventSourceController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseScalaCometController ScalaCometController = new controllers.javascript.ReverseScalaCometController(RoutesPrefix.byNamePrefix());
  }

}

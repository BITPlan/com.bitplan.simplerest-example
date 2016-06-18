/**
 * Copyright (C) 2015-2016 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 */
package com.bitplan.simplerest.example;

import com.bitplan.rest.RestServerImpl;

/**
 * an Example Server
 * @author wf
 *
 */
public class ExampleServer extends RestServerImpl { 
  
  /**
   * construct Example Server
   * setting defaults
   * @throws Exception 
   */
  public ExampleServer() throws Exception {
    // listen to whole network
    settings.setHost("0.0.0.0");
    // listen on given port
    settings.setPort(8111);
    // add the default path
    settings.setContextPath("/example");
    // add a static handler
    settings.addClassPathHandler("/", "/static/");
    // setup resources from the given packages
    String packages="com.bitplan.simplerest.example.resources;";
    settings.setPackages(packages);
   }
  
  /**
   * start Server
   * 
   * @param args
   * @throws Exception
   */
   public static void main(String[] args) throws Exception {
     ExampleServer rs=new ExampleServer();
     rs.settings.parseArguments(args);
     rs.startWebServer();
   } // main

}

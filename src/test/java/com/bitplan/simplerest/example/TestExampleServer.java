/**
 * Copyright (C) 2016 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 * 
 */
package com.bitplan.simplerest.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bitplan.rest.RestServer;
import com.bitplan.rest.test.TestRestServer;

/**
 * test the example Server
 * @author wf
 *
 */
public class TestExampleServer extends TestRestServer {
  boolean debug=true;
  @Before
  public void initServer() throws Exception {
    startServer();
  }

  @Override
  public RestServer createServer() throws Exception {
    RestServer result = new ExampleServer();
    return result;
  }
  
  @Test
  public void testExampleServer() throws Exception {
    String userXml=getResponseString("application/xml", "/example/user");
    if (debug)
      System.out.println(userXml);
    String expected="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><user><name>Doe</name><firstname>John</firstname><email>john@doe.org</email></user>";
    assertEquals(expected,userXml);
    String userJson=getResponseString("application/json", "/example/user");
    if (debug)
      System.out.println(userJson);
    String expectedJson="{\"name\":\"Doe\",\"firstname\":\"John\",\"email\":\"john@doe.org\"}";
    assertEquals(expectedJson,userJson);
    
  }

}

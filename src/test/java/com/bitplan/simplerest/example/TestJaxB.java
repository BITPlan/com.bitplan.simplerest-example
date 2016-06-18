/**
 * Copyright (C) 2015-2016 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 * 
 */
package com.bitplan.simplerest.example;

import static org.junit.Assert.assertEquals;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import com.bitplan.jaxb.JaxbFactory;

/**
 * test JAXB Handling
 * @author wf
 *
 */
public class TestJaxB {
  boolean debug=true;
  boolean moxy=true;

  @Test
  public void testVersion() throws JAXBException {
    JaxbFactory<User> userFactory = new JaxbFactory<User>(User.class);
    // String jaxbContext = JAXBContext.newInstance(User.class)
    String jaxbContextType=userFactory.getJAXBContext().getClass().getName();
    if (debug)
      System.out.println(jaxbContextType);
    // Oracle/Sun default:
    String expected = "com.sun.xml.bind.v2.runtime.JAXBContextImpl";
    if (moxy)
      expected = "org.eclipse.persistence.jaxb.JAXBContext"; // jersey-moxy
    assertEquals("Expecting configured JaxB implementation", expected,
        jaxbContextType);
  }
  
  @Test
  public void testJaxbFactory() throws Exception {
    JaxbFactory<User> userFactory = new JaxbFactory<User>(User.class);
    User user=new User();
    user.name="Doe";
    user.firstname="John";
    String xml=userFactory.asXML(user);
    if (debug)
      System.out.println("'"+xml+"'");
  }

}

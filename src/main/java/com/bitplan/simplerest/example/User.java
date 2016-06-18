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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * example class
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
  public String name;
  public String firstname;
  public String email;

}

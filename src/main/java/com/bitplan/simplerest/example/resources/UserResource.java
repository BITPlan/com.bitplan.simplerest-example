/**
 * Copyright (C) 2016 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 * 
 */
package com.bitplan.simplerest.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.bitplan.simplerest.example.User;


@Path("/user")
public class UserResource {
  @GET
  public User getUser() {
    User user=new User();
    user.name="Doe";
    user.firstname="John";
    user.email="john@doe.org";
    return user;
  }
}

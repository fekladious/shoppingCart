package com.fekladious.shopcart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api")
public class ShoppingCart {
  @GET
  @Produces("application/xml")
  public String getItems() {
    
//    Double fahrenheit;
//    Double celsius = 36.8;
//    fahrenheit = ((celsius * 9) / 5) + 32;
//
//    String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
//    return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";

    return "<ctofservice></ctofservice>";

  }

}

package com.momarious.oriental;

public class OrientalUS extends AbstractOriental {

    private static final String PAYS = "USA";
  
    public String getCountry() {
      return PAYS;
    }
    
    public String toString() {
        return "Oriental" + " from " + PAYS + "\n ";
    }
    
}
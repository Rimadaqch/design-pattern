package com.momarious.oriental;

public class OrientalSN extends AbstractOriental {

    private static final String PAYS = "SENEGAL";
  
    public String getCountry() {
      return PAYS;
    }
    
    public String toString() {
        return "Oriental" + " from " + PAYS + "\n ";
    }

}
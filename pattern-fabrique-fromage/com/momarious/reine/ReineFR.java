package com.momarious.reine;

public class ReineFR extends AbstractReine {

    private static final String PAYS = "FRANCE";
  
    public String getCountry() {
      return PAYS;
    }
    
    public String toString() {
      return "Reine" + " from " + PAYS + "\n ";
    }
}
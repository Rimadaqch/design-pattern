package com.momarious.reine;

public class ReineUS extends AbstractReine {

    private static final String PAYS = "USA";
  
    public String getCountry() {
      return PAYS;
    }
    
    public String toString() {
      return "Reine" + " from " + PAYS + "\n ";
    }
}
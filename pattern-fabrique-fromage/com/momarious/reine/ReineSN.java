package com.momarious.reine;

public class ReineSN extends AbstractReine {

    private static final String PAYS = "SENEGAL";
  
    public String getCountry() {
      return PAYS;
    }
    
    public String toString() {
        return "Reine" + " from " + PAYS + "\n ";
    }
}
package com.momarious.troisfromage;

public class TroisFromageUS extends AbstractTroisFromage {
    
    private static final String PAYS = "USA";
  
    public String getCountry() {
      return PAYS;
    }
    
    public String toString() {
      return "TroisFromage" + " from " + PAYS + "\n ";
    }
}
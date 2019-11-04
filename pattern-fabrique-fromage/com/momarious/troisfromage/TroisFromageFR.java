package com.momarious.troisfromage;

public class TroisFromageFR extends AbstractTroisFromage {
 
    private static final String PAYS = "FRANCE";
  
    public String getCountry() {
      return PAYS;
    }
    
    public String toString() {
      return "TroisFromage" + " from " + PAYS + "\n ";
    }
}
package com.momarious.troisfromage;

public class TroisFromageSN extends AbstractTroisFromage {

    private static final String PAYS = "SENEGAL";
  
    public String getCountry() {
      return PAYS;
    }
    
    public String toString() {
      return "TroisFromage" + " from " + PAYS + "\n ";
    }
}
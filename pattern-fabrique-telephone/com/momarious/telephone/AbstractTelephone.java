package com.momarious.telephone;
/*
 * AbstractTelephone.java
 */

/**
 * Telephone asbtrait  (Abstract Product)
 */
public abstract class AbstractTelephone {
  private String numero;
  
  public String getNumero() {
    return this.numero;
  }
  
  public abstract String getCodeRegional();
  
  public void setNumero(String valeur){
    try {
      Long.parseLong(valeur);
      this.numero = valeur;
    } catch (NumberFormatException ex) {
      ex.printStackTrace();
    }
  }
  
  public String toString() {
    return getNumero();
  }
  
}

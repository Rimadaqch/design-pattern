package com.momarious.adresse;

/*
 * AbstractTelephone.java
 */

/**
 * Telephone asbtrait  (Abstract Product)
 */
public abstract class AbstractAdresse {
  
  private String rue;
  private String ville;
  private String region;
  private String codePostal;
  
  public String getRue() {
    return this.rue;
  }
  
  public String getVille() {
    return this.ville;
  }
  
  public String getRegion() {
    return this.region;
  }
  
  public String getCodePostal() {
    return this.codePostal;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public void setRegion(String region) {
    this.region = region;
  }
  
  public void setCodePostal(String codePostal) {
    this.codePostal = codePostal;
  }
  
  
}

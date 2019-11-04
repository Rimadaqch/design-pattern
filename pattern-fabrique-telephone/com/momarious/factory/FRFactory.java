package com.momarious.factory;

import com.momarious.telephone.*;
import com.momarious.adresse.*;

public class FRFactory extends AbstractFactory {
  
  public FRFactory() {}

  public AbstractTelephone createTelephone() {
    return new FRTelephone(); 
  }

  public AbstractAdresse createAdresse() {
    return new FRAdresse();
  }


}

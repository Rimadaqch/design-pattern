package com.momarious.factory;

import com.momarious.telephone.*;
import com.momarious.adresse.*;

public class USFactory extends AbstractFactory {
  
  public AbstractTelephone createTelephone() {
    return new USTelephone(); 
  }

  public AbstractAdresse createAdresse() {
    return new USAdresse();
  }

}

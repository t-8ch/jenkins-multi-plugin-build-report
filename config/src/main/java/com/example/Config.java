package com.example;

import hudson.Extension;
import hudson.ExtensionList;

@Extension
public class Config {
  public int value = 5;

  public static Config get() {
    return ExtensionList.lookup(Config.class).get(0);
  }

}

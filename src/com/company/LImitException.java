package com.company;

public class LImitException extends Exception {
  LImitException(String massage,double remainingAmount){
      super(massage);
  }

  public static void getRemainingAmount() {
    }
}

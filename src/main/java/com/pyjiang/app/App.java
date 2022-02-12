package com.pyjiang.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
  static int[] numbers = new int[Constants.NUMBER_COUNT];
  static Set<Operator> operatorSet = new HashSet<>();

  public static void receiveInputs() {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < Constants.NUMBER_COUNT; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = scanner.nextInt();
      if (numbers[i] < Constants.MIN_NUMBER || numbers[i] > Constants.MAX_NUMBER) {
        throw new IllegalArgumentException("Input number has to be between 1 and 10");
      }
    }
  }

  public static void main(String[] args) {
    receiveInputs();
    // TODO: Implement solver
  }
}

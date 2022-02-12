package com.pyjiang.app;

import java.util.HashSet;
import java.util.Set;

public class Constants {
  // Basic parameters
  public static final int OPERAND_COUNT = 4; // Currently, you can't change that
  public static final int MIN_NUMBER = 1;
  public static final int MAX_NUMBER = 10;

  /** The most classic version of 24, only basic arithmetic operators are supported. */
  public static final Set<Operator> CLASSIC = new HashSet<>() {{
    add(Operator.ARITHMETIC_PLUS);
    add(Operator.ARITHMETIC_MINUS);
    add(Operator.ARITHMETIC_TIMES);
    add(Operator.ARITHMETIC_DIVIDE);
  }};

  /** 24 for programmers! A cool tweak of the classical version. */
  public static final Set<Operator> PROGRAMMER = new HashSet<>() {{
    add(Operator.ARITHMETIC_PLUS);
    add(Operator.LOGICAL_LEFT_SHIFT);
    add(Operator.LOGICAL_RIGHT_SHIFT);
    add(Operator.BITWISE_AND);
    add(Operator.BITWISE_OR);
    add(Operator.BITWISE_XOR);
  }};
}

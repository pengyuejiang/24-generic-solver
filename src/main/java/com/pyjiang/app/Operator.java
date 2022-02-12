package com.pyjiang.app;

public enum Operator {
  ARITHMETIC_PLUS("+"),
  ARITHMETIC_MINUS("-"),
  ARITHMETIC_TIMES("*"),
  ARITHMETIC_DIVIDE("/"),
  LOGICAL_LEFT_SHIFT("<<"),
  LOGICAL_RIGHT_SHIFT(">>"),
  BITWISE_AND("&"),
  BITWISE_OR("|"),
  BITWISE_XOR("^");

  /** The symbol that stands for the operator. */
  private final String symbol;

  /**
   * Construct an operator from symbol.
   * @param symbol the symbol that stands for the operator
   */
  Operator(final String symbol) {
    this.symbol = symbol;
  }

  /**
   * Returns the string representation of an operator.
   * @return the string representation of an operator
   */
  @Override
  public String toString() {
    return this.symbol;
  }
}

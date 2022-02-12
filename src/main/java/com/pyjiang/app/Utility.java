package com.pyjiang.app;

public class Utility {
  public static int evaluate(int first, int second, Operator operator) throws ArithmeticException {
    int result = 0;
    switch (operator) {
      case ARITHMETIC_PLUS:
        result = first + second;
        break;
      case ARITHMETIC_MINUS:
        result = first - second;
        break;
      case ARITHMETIC_TIMES:
        result = first * second;
        break;
      case ARITHMETIC_DIVIDE:
        if (second == 0) {
          throw new ArithmeticException("Can't divide by 0.");
        } else if (first % second != 0) {
          throw new ArithmeticException("They don't divide nicely.");
        }
        result = first / second;
        break;
      case LOGICAL_LEFT_SHIFT:
        result = first << second;
        break;
      case LOGICAL_RIGHT_SHIFT:
        result = first >> second;
        break;
      case BITWISE_AND:
        result = first & second;
        break;
      case BITWISE_OR:
        result = first | second;
        break;
      case BITWISE_XOR:
        result = first ^ second;
        break;
    }
    return result;
  }
}

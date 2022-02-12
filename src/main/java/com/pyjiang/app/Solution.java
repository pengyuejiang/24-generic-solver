package com.pyjiang.app;

import java.util.List;

/**
 * Class representing a solution. Not sure how to implement, but the structure should be tree-like.
 * Needs redesign, leave if for now. We will represent solution with String first.
 */
public class Solution {
  private int[] operands;
  private List<Operator> operators;

  public Solution(final int[] operands, final List<Operator> operators) {
    this.operands = operands;
    this.operators = operators;
  }

  @Override
  public String toString() {
    // TODO: Implement it
    return null;
  }
}

package com.pyjiang.app.solver;

import com.pyjiang.app.Operator;

import java.util.Set;

public interface Solver {
  /**
   * Solves a given problem represented by the four operands with the given rule set.
   * @param ruleSet the rule set to work with
   * @param operands the operands of a given problem
   * @return a solution set currently represented as a String set
   */
  public Set<String> Solve(final Set<Operator> ruleSet, final int[] operands);
}

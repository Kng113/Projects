package operators;

import operands.*;

public class RightParenthesesOperator extends Operator {

  @Override
  public int priority() {
    return 1;
  }

  @Override
  public Operand execute(Operand operand1, Operand operand2) {
    return null;
  }
}

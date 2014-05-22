/*
 * @(#)MultipleFieldTypeDenoter.java                2.0 1999/08/11
 *
 * Copyright (C) 1999 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class MultipleCaseItem extends CaseItem {

  public MultipleCaseItem (IntegerLiteral ilAST, Command cAST, CaseItem ciAST,
                            SourcePosition thePosition) {
    super (thePosition);
    IL = ilAST;
    C  = cAST;
    CI = ciAST;
  }

  public Object visit (Visitor v, Object o) {
    return v.visitMultipleCaseItem(this, o);
  }

  public boolean equals (Object obj) {
    if (obj != null && obj instanceof MultipleCaseItem) {
      MultipleCaseItem ft = (MultipleCaseItem) obj;
      return (this.IL.spelling.compareTo(ft.IL.spelling) == 0) &&
              this.C.equals(ft.C) &&
              this.CI.equals(ft.CI);
    } else
      return false;
  }

  public IntegerLiteral IL;
  public Command C;
  public CaseItem CI;
}

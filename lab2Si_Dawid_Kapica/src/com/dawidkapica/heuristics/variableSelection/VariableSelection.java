package com.dawidkapica.heuristics.variableSelection;

import com.dawidkapica.informations.IndividualSudoku;
import com.dawidkapica.informations.PointSudoku;

public interface VariableSelection {

    PointSudoku chooseVariable (IndividualSudoku individualSudoku);
}

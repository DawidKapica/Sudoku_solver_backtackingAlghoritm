package com.dawidkapica.heuristics.valueSelection;

import com.dawidkapica.informations.IndividualSudoku;
import com.dawidkapica.informations.PointSudoku;

import java.util.ArrayList;

public interface ValueSelection {

    int chooseValue (IndividualSudoku individualSudoku, PointSudoku pointSudoku, ArrayList<Integer> domain);
}

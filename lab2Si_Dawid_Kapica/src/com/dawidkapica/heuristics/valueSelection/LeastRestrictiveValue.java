package com.dawidkapica.heuristics.valueSelection;

import com.dawidkapica.informations.IndividualSudoku;
import com.dawidkapica.informations.PointSudoku;

import java.util.ArrayList;

public class LeastRestrictiveValue implements ValueSelection {

    @Override
    public int chooseValue (IndividualSudoku individualSudoku, PointSudoku pointSudoku, ArrayList<Integer> domain) {
        return 0;
    }
}

package com.dawidkapica.heuristics.valueSelection;

import com.dawidkapica.informations.IndividualSudoku;
import com.dawidkapica.informations.PointSudoku;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class InOrderValue implements ValueSelection {

    private static final int EMPTY_SUDOKU_FIELD = 0;
    public int chooseValue(IndividualSudoku individualSudoku,  PointSudoku pointSudoku, ArrayList<Integer> domain) {

        if (domain.size() != 0) {
            Collections.sort(domain);
            return domain.get(0);
        } else {
            return EMPTY_SUDOKU_FIELD;
        }
    }
}

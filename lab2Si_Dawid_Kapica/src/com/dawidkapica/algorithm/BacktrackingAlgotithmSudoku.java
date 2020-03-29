package com.dawidkapica.algorithm;

import com.dawidkapica.heuristics.valueSelection.ValueSelection;
import com.dawidkapica.heuristics.variableSelection.VariableSelection;
import com.dawidkapica.informations.IndividualSudoku;
import com.dawidkapica.structures.Node;
import com.dawidkapica.structures.Tree;

import java.util.ArrayList;

public class BacktrackingAlgotithmSudoku {

    Tree<IndividualSudoku> tree;
    IndividualSudoku individualSudoku;
    ValueSelection valueSelection;
    VariableSelection variableSelection;

    public BacktrackingAlgotithmSudoku(ValueSelection valueSelection, VariableSelection variableSelection) {
        this.valueSelection = valueSelection;
        this.variableSelection = variableSelection;
    }

    public ArrayList<IndividualSudoku> findSolutions(IndividualSudoku individualSudoku) {
        this.individualSudoku = individualSudoku;
        tree = new Tree<IndividualSudoku>(new Node<IndividualSudoku>(individualSudoku));


        return null;
    }
}

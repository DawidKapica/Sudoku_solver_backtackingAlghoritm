package com.dawidkapica.informations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class IndividualSudoku implements Cloneable {

    ArrayList<ArrayList<PointSudoku>> sudokuBoard;
    public static final int MIN_SUDOKU_INDEX = 0;
    public static final int MAX_SUDOKU_INDEX = 8;
    public static final int MIN_SUDOKU_VALUE = 1;
    public static final int MAX_SUDOKU_VALUE = 9;
    public static final int EMPTY_FIELD_VALUE = 0;

    public IndividualSudoku () {
        sudokuBoard = new ArrayList<ArrayList<PointSudoku>>();
        for (int i = MIN_SUDOKU_INDEX; i <= MAX_SUDOKU_INDEX; i++) {
            for (int j = MIN_SUDOKU_INDEX; j < MAX_SUDOKU_INDEX; j++) {
                sudokuBoard.get(i).add(new PointSudoku(i, j, 0));
            }
        }
    }

    public IndividualSudoku (ArrayList<ArrayList<PointSudoku>> sudokuBoard) {
        this.sudokuBoard = new ArrayList<ArrayList<PointSudoku>>(sudokuBoard);
    }


    public int getSingleElement(PointSudoku pointSudoku) {
        return pointSudoku.getValue();
    }

    public void setSingleElement(PointSudoku pointSudoku, int value) {
        if (value >= MIN_SUDOKU_VALUE && value <= MAX_SUDOKU_VALUE) {
            pointSudoku.setValue(value);
        }
    }

    public boolean checkColumn(int columnNumber) {
        if (columnNumber >= MIN_SUDOKU_INDEX && columnNumber <= MAX_SUDOKU_INDEX) {
            ArrayList<PointSudoku> columnToCheck = new ArrayList<PointSudoku>();
            for (int i = MIN_SUDOKU_INDEX; i < MAX_SUDOKU_INDEX; i++) {
                columnToCheck.add(sudokuBoard.get(i).get(columnNumber));
            }
            Collections.sort(columnToCheck);
            for (int i = MIN_SUDOKU_INDEX; i < MAX_SUDOKU_INDEX; i++) {
                if (columnToCheck.get(i).getValue() != EMPTY_FIELD_VALUE && columnToCheck.get(i) == columnToCheck.get(i+1)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkLine (int lineNumber) {
        if (lineNumber >= MIN_SUDOKU_INDEX && lineNumber <= MAX_SUDOKU_INDEX) {
            ArrayList<PointSudoku> lineToCheck = sudokuBoard.get(lineNumber);
            Collections.sort(lineToCheck);
            for (int i = MIN_SUDOKU_INDEX; i < MAX_SUDOKU_INDEX; i++) {
                if (lineToCheck.get(i).getValue() != EMPTY_FIELD_VALUE && lineToCheck.get(i).getValue() == lineToCheck.get(i+1).getValue()) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public boolean checkGrid(int horizontalFirstIndex, int verticalFirstIndex) {
        if (verticalFirstIndex >= MIN_SUDOKU_INDEX && verticalFirstIndex <= MAX_SUDOKU_INDEX &&
                horizontalFirstIndex >= MIN_SUDOKU_INDEX && horizontalFirstIndex <= MAX_SUDOKU_INDEX) {
            ArrayList<Integer> gridToCheck = new ArrayList<Integer>();

            for (int i = horizontalFirstIndex; i <= horizontalFirstIndex+2; i++) {
                for (int j = verticalFirstIndex; j <= verticalFirstIndex+2; j++) {
                    gridToCheck.add(sudokuBoard.get(horizontalFirstIndex).get(verticalFirstIndex).getValue());
                }
            }

            Collections.sort(gridToCheck);
            for (int i = MIN_SUDOKU_INDEX; i < MAX_SUDOKU_INDEX; i++) {
                if (gridToCheck.get(i) != EMPTY_FIELD_VALUE && gridToCheck.get(i) == gridToCheck.get(i+1)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public boolean checkSudoku () {
        //Sprawdzenie kolumn
        for (int i = MIN_SUDOKU_INDEX; i <= MAX_SUDOKU_INDEX; i++) {
            if(checkColumn(i) == false) {
                return false;
            }
        }
        //Sprawdzenie wierszy
        for (int i = MIN_SUDOKU_INDEX; i <= MAX_SUDOKU_INDEX; i++) {
            if(checkLine(i) == false) {
                return false;
            }
        }
        //Sprawdzenie kwadratów
        for (int i = MIN_SUDOKU_INDEX; i <= MAX_SUDOKU_INDEX; i = i + 3) {
            for (int j = MIN_SUDOKU_INDEX; j <= MAX_SUDOKU_INDEX; j = j + 3) {
                if(checkGrid(i, j) == false) {
                    return false;
                }
            }
        }

        return true;

    }

    public boolean isFull() {
        for (int i = 0; i <= MAX_SUDOKU_INDEX; i++) {
            for (int j = 0; j <= MAX_SUDOKU_INDEX; j++) {
                if (sudokuBoard.get(i).get(j).getValue() == EMPTY_FIELD_VALUE) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSolved() {
        if (checkSudoku() && isFull()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<ArrayList<PointSudoku>> getSudokuBoard () {
        return sudokuBoard;
    }

    public void setSudokuBoard (ArrayList<ArrayList<PointSudoku>> sudokuBoard) {
        this.sudokuBoard = new ArrayList<ArrayList<PointSudoku>>(sudokuBoard);
    }

    @Override
    public IndividualSudoku clone() throws CloneNotSupportedException {
        IndividualSudoku coordinates = new IndividualSudoku(sudokuBoard);
        return coordinates;
    }
}

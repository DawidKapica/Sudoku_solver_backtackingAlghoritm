package com.dawidkapica.parser;

import com.dawidkapica.informations.IndividualSudoku;
import com.dawidkapica.informations.PointSudoku;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ParserSudoku {

    private static final int SUDOKU_SIZE = 9;

    public IndividualSudoku parse(String filename, int sundokuIndex){
        ArrayList<ArrayList<Integer>> sudokuBoard = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<PointSudoku>> sudokuPointBoard = new ArrayList<ArrayList<PointSudoku>>();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(new File(getClass().getClassLoader().getResource("dataSudoku/" +filename).getFile())));
            reader.readLine();
            String line;

            while (getSudokuIndex(line = reader.readLine()) != sundokuIndex) {}

            char[] tableSudokuWithoutDots = line.replace(".", "0").toCharArray();

            ArrayList<Integer> row = new ArrayList<Integer>();
            for (char sudokuSingleValue: tableSudokuWithoutDots) {
                if (row.size() == SUDOKU_SIZE){
                    sudokuBoard.add(row);
                    row = new ArrayList<Integer>();
                }
                else
                    row.add(Character.getNumericValue(sudokuSingleValue));
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i<sudokuBoard.size(); i++) {
            ArrayList<PointSudoku> row = new ArrayList<PointSudoku>();
            for (int j = 0; j < sudokuBoard.get(0).size(); j++) {
                row.add(new PointSudoku(i, j, sudokuBoard.get(i).get(j)));
            }
            sudokuPointBoard.add(row);
        }

        return new IndividualSudoku(sudokuPointBoard);

    }

    private int getSudokuIndex(String line){
        StringTokenizer tokenizer = new StringTokenizer(line, ";");
        return Integer.parseInt(tokenizer.nextToken());
    }
}

package com.company.codewars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BreakingChocolateProblem {
    public static int breakChocolate(int n, int m) {
        if (n <= 1 && m <= 1) {
            return 0;
        }
        int numberOfBreaks = 0;
        List<Cell> piecesLeftToBreak = new ArrayList<>();
        piecesLeftToBreak.add(new Cell(n, m));
        while (!piecesLeftToBreak.isEmpty()) {
            piecesLeftToBreak.sort(Comparator.comparingInt(Cell::getBiggerSide));
            Cell cell = piecesLeftToBreak.get(0);
            piecesLeftToBreak.remove(0);
            List<Cell> cellList = cell.breakToSmallerPiece();
            piecesLeftToBreak.addAll(cellList);
            numberOfBreaks++;
        }
        return numberOfBreaks;
    }
}

class Cell {
    private int n;
    private int m;

    public Cell(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int getBiggerSide() {
        return n > m ? n : m;
    }

    public List<Cell> breakToSmallerPiece() {
        boolean nBigger = isNsideBigger();
        int biggerSide;
        int smallerSide;
        if (nBigger) {
            biggerSide = getN();
            smallerSide = getM();
        } else {
            biggerSide = getM();
            smallerSide = getN();
        }
        List<Cell> listOfSmallerCells = new ArrayList<>();
        double biggerAfterDividing = Math.ceil(biggerSide / 2.0);
        double smallerAfterDividing = Math.floor(biggerSide / 2.0);
        addToListIfDividable(biggerAfterDividing, smallerSide, listOfSmallerCells);
        addToListIfDividable(smallerAfterDividing, smallerSide, listOfSmallerCells);
        return listOfSmallerCells;
    }

    private void addToListIfDividable(double numberToAdd, int smallerSide, List<Cell> listOfSmallerCells) {
        if (numberToAdd > 1 || smallerSide > 1) {
            listOfSmallerCells.add(new Cell((int) numberToAdd, smallerSide));
        }
    }

    private boolean isNsideBigger() {
        return n > m;
    }

}

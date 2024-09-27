package org.example;

import java.util.ArrayList;
import java.util.List;

class Button {
    private int countClick = 0;

    public int getCountClick() {
        return countClick;
    }

    void click() {
        ++countClick;
        System.out.println(countClick);
    }
}

class Balance {
    double right;
    double left;

    Balance(double left, double right) {
        this.right = right;
        this.left = left;
    }

    public void addLeft(double number) {
        left += number;
    }

    public void addRight(double number) {
        right += number;
    }

    public String result() {
        if (right == left) {
            return "=";
        } else if (right > left) {
            return "R";
        } else {
            return "L";
        }
    }
}

class Bell {
    String currentString = "dong";

    public void sound() {
        System.out.println((currentString.equals("dong")) ? (currentString = "ding") : (currentString = "dong"));
    }
}

class OddEvenSeparator {
    private final List<Integer> oddNumbers = new ArrayList<>();
    private final List<Integer> evenNumbers = new ArrayList<>();

    public boolean addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }

        return true;
    }

    public List<Integer> odd() {
        return oddNumbers;
    }

    public List<Integer> even() {
        return evenNumbers;
    }
}

class Table {
    private final int rowCount;
    private final int columnCount;
    private final int[][] tableNumbers;

    Table(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        tableNumbers = new int[rowCount][columnCount];
    }

    public int getValue(int row, int column) {
        return tableNumbers[row][column];
    }

    public void setValue(int row, int column, int value) {
        tableNumbers[row][column] = value;
    }

    public int rows() {
        return rowCount;
    }

    public int cols() {
        return columnCount;
    }

    public String toString() {
        StringBuilder tableString = new StringBuilder();

        for (int indexRow = 0; indexRow < rowCount; ++indexRow) {
            for (int indexColumn = 0; indexColumn < columnCount; ++indexColumn) {
                tableString.append(tableNumbers[indexRow][indexColumn]).append("\t");
            }

            tableString.append("\n");
        }

        return tableString.toString();
    }

    public double average() {
        int sumNumbers = 0;

        for (int indexRow = 0; indexRow < rowCount; ++indexRow) {
            for (int indexColumn = 0; indexColumn < columnCount; ++indexColumn) {
                sumNumbers += tableNumbers[indexRow][indexColumn];
            }
        }

        return (double)sumNumbers / (rowCount * columnCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.click();
        button.click();
        button.click();

        System.out.println(button.getCountClick());

        Balance balance = new Balance(4, 2);

        System.out.println(balance.result());

        Bell bell = new Bell();


    }
}
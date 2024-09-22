package org.example;

import java.util.ArrayList;

class Button {
    public int CountClick = 0;

    void click() {
        ++CountClick;
    }
}

class Balance {
    double right;
    double left;

    Balance() { }

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
    String dingdong = "dong";

    public String sound() {
        return (dingdong.equals("dong")) ? (dingdong = "ding") : (dingdong = "dong");
    }
}

class OddEvenSeparator {
    private ArrayList<Integer> oddNumbers = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public boolean addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }

        return true;
    }

    public ArrayList<Integer> odd() {
        return oddNumbers;
    }

    public ArrayList<Integer> even() {
        return evenNumbers;
    }
}

class Table {
    private int rowCount;
    private int columnCount;
    private int[][] tableNumbers;

    Table(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        tableNumbers = new int[rowCount][columnCount];
    }

    public int getValue(int row, int column) {
        return tableNumbers[row][column];
    }

    public boolean setValue(int row, int column, int value) {
        tableNumbers[row][column] = value;

        return true;
    }

    public int rows() {
        return rowCount;
    }

    public int cols() {
        return columnCount;
    }

    public String toString() {
        String tableString = "";

        for (int indexRow = 0; indexRow < rowCount; ++indexRow) {
            for (int indexColumn = 0; indexColumn < columnCount; ++indexColumn) {
                tableString += tableNumbers[indexRow][indexRow] + "\t";
            }

            tableString += "\n";
        }

        return tableString;
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

        System.out.println(button.CountClick);

        Balance balance = new Balance(4, 2);

        System.out.println(balance.result());

        Bell bell = new Bell();
        System.out.println(bell.sound());
        System.out.println(bell.sound());
        System.out.println(bell.sound());
        System.out.println(bell.sound());
        System.out.println(bell.sound());
        System.out.println(bell.sound());
        System.out.println(bell.sound());


    }
}
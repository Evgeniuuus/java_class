package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------Zadanie 1----------------------");
        Button but1 = new Button();
        Button but2 = new Button();
        Button but3 = new Button();
        but1.click();
        but1.click();
        System.out.println();
        for (int i = 0; i < 10; i++) but2.click();
        System.out.println();
        but3.click();

        System.out.println("----------------------Zadanie 2----------------------");
        Balance balance1 = new Balance();
        Balance balance2 = new Balance();
        Balance balance3 = new Balance();
        balance1.addLeft(5);
        balance1.addRight(7);
        System.out.print("Scales number 1 ---> ");
        balance1.result();
        balance2.addLeft(4);
        balance2.addRight(3);
        System.out.print("Scales number 2 ---> ");
        balance2.result();
        balance3.addLeft(1);
        balance3.addRight(1);
        System.out.print("Scales number 2 ---> ");
        balance3.result();

        System.out.println("----------------------Zadanie 3----------------------");
        Bell bell1 = new Bell();
        bell1.sound();
        bell1.sound();
        bell1.sound();
        System.out.println();
        Bell bell2 = new Bell();
        bell2.sound();
        bell2.sound();
        bell2.sound();
        bell2.sound();

        System.out.println("----------------------Zadanie 4----------------------");
        OddEvenSeparator CoolSeparator = new OddEvenSeparator();
        CoolSeparator.addNumber(5);
        CoolSeparator.addNumber(1);
        CoolSeparator.addNumber(3);
        CoolSeparator.addNumber(10);
        CoolSeparator.addNumber(8);
        CoolSeparator.addNumber(7);
        CoolSeparator.addNumber(5);
        CoolSeparator.addNumber(6);
        CoolSeparator.addNumber(1);
        CoolSeparator.number();
        CoolSeparator.even();
        CoolSeparator.odd();

        System.out.println("----------------------Zadanie 5----------------------");
        Table table = new Table(4, 2);
        table.setValue(0, 0, 5);
        table.setValue(0, 1, 1);
        table.setValue(1, 0, 0);
        table.setValue(1, 1, 6);
        table.setValue(2, 0, 3);
        table.setValue(2, 1, 2);
        table.setValue(3, 0, 4);
        table.setValue(3, 1, 8);
        System.out.println(table.TableToString());
        System.out.println("element [2][1] = " + table.getValue(2, 1));
        System.out.println("Average value from table = " + table.average());

        System.out.println("----------------------Zadanie 6----------------------");
        Circle circle = new Circle(-5);
        System.out.println(circle.CircleToString());
        System.out.println("Square of circle = " + circle.calcArea());
        Rectangle rectangle = new Rectangle(5,2);
        System.out.println("\n" + rectangle.RectangleToString());
        System.out.println("Square of rectangle = " + rectangle.calcArea());
        Cylinder cylinder = new Cylinder(rectangle, 15);
        System.out.println("\n" + "Volume of cylinder = " + cylinder.calcVolume());
    }
}

class Button {
    private int clickCount;

    public void click() {
        clickCount++;
        System.out.println("Button has been clicked " + clickCount + " times.");
    }
}

class Balance {
    int right_bowl;
    int left_bowl;

    Balance() {
        right_bowl = 0;
        left_bowl = 0;
    }

    public void addRight(int weight) {
        right_bowl += weight;
    }

    public void addLeft(int weight) {
        left_bowl += weight;
    }

    public void result() {
        if (right_bowl == left_bowl)
            System.out.println("=");
        else if (right_bowl > left_bowl)
            System.out.println("R");
        else System.out.println("L");
    }
}

class Bell {
    private boolean flag = true;

    public void sound() {
        if (flag) {
            System.out.println("ding");
            flag = false;
        } else {
            System.out.println("dong");
            flag = true;
        }
    }
}

class OddEvenSeparator {
    private final int[] numbers;
    private final int[] odds;
    private final int[] evens;
    private int numCount = 0;
    private int oddCount = 0;
    private int evenCount = 0;

    OddEvenSeparator() {
        numbers = new int[10];
        odds = new int[10];
        evens = new int[10];
    }

    public void addNumber(int num) {
        numbers[numCount] = num;
        numCount++;
        if (num % 2 == 0) {
            odds[oddCount] = num;
            oddCount++;
        } else {
            evens[evenCount] = num;
            evenCount++;
        }
    }

    public void number() {
        System.out.print("All numbers: ");
        for (int i = 0; i < numCount; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void even() {
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
    }

    public void odd() {
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odds[i] + " ");
        }
        System.out.println();
    }

}

class Table {
    private final int[][] data;

    public Table(int rows, int columns) {
        data = new int[rows][columns];
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public int getValue(int row, int column) {
        return data[row][column];
    }

    public int rows() {
        return data.length;
    }

    public int columns() {
        return data[0].length;
    }


    public String TableToString() {
        StringBuilder CollStringBuilder = new StringBuilder();
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < columns(); j++) CollStringBuilder.append(data[i][j]).append(" ");
            CollStringBuilder.append("\n");
        }
        return CollStringBuilder.toString();
    }

    public double average() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < columns(); j++) {
                sum += data[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }
}



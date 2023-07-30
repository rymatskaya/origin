package Lesson5;

import static Lesson5.GenerateFunctions.Generate_Double_element;
import static Lesson5.GenerateFunctions.Generate_String_element;


public class Matrix {
    public static void main(String[] args) {

        String[][] matrix = new String[10][10];
        String[] main_diagonal = new String[10];
        String[] secondary_diagonal = new String[10];

        createMatrix(matrix);

        createArray(matrix, main_diagonal, secondary_diagonal);

        printMatrix(matrix);
        System.out.println("Главная диагональ:");
        printArrays(main_diagonal);
        System.out.println("\nПобочная диагональ:");
        printArrays(secondary_diagonal);

        isCompareArrays(main_diagonal, secondary_diagonal);

        System.out.println("Главная диагональ:");
        updateArrays(main_diagonal);
        System.out.println("\nПобочная диагональ:");
        updateArrays(secondary_diagonal);
    }

    private static void updateArrays(String[] main_diagonal) {
        String regex = "^\\d+(\\.\\d+)*$";
        boolean IsIssetNumbers = false;
        String[] NumberArray = new String[3];
        int i = 0;
        StringBuilder updateElements = new StringBuilder();
        for (String diagonal : main_diagonal)
            if (diagonal.matches(regex)) {
                if (!IsIssetNumbers) {
                    System.out.println("Округление чисел: ");
                    IsIssetNumbers = true;
                }
                if (Double.parseDouble(diagonal) > 1.7) {
                    diagonal = String.valueOf(Math.ceil(Double.parseDouble(diagonal)));
                    NumberArray[i] = diagonal;
                } else {
                    diagonal = String.valueOf(Math.floor(Double.parseDouble(diagonal)));
                    NumberArray[i] = diagonal;
                }
                i++;
            } else {
                diagonal = diagonal.substring(2, 4);
                if (updateElements.length() == 0) {
                    updateElements = updateElements.append(diagonal);
                } else {
                    updateElements = updateElements.append(", ").append(diagonal);
                }
            }
        printArray(NumberArray);
        System.out.println("\nStringBuilder = " + updateElements);
    }

    private static void isCompareArrays(String[] main_diagonal, String[] secondary_diagonal) {
        boolean no_equals = false;
        for (int j = 0; j < 10; j++) {
            if (!main_diagonal[j].equals(secondary_diagonal[j])) {
                System.out.println("\nГлавная и побочная диагонали не равны");
                no_equals = true;
                break;
            }
        }
        if (!no_equals) {
            System.out.println("\nГлавная и побочная диагонали равны");
        }
    }

    private static void printArrays(String[] main_diagonal) {

        for (int j = 0; j < main_diagonal.length; j++) {
            System.out.print(main_diagonal[j] + "\t");
        }

    }

    private static void printArray(String[] main_diagonal) {

        for (int j = 0; j < main_diagonal.length; j++) {
            if (main_diagonal[j] != null) {
                if (j != main_diagonal.length - 1) {
                    System.out.print(main_diagonal[j] + "_");
                } else {
                    System.out.print(main_diagonal[j]);
                }
            }

        }

    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    private static void createArray(String[][] matrix, String[] main_diagonal, String[] secondary_diagonal) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    main_diagonal[i] = matrix[i][j];
                } else if (i + j == 9) {
                    secondary_diagonal[i] = matrix[i][j];
                }
            }
        }
    }

    private static void createMatrix(String[][] matrix) {
        int ind3 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ind3++;
                if ((ind3) % 3 == 0) {
                    matrix[i][j] = Generate_Double_element();
                } else {
                    matrix[i][j] = Generate_String_element();
                }
            }
        }
    }


}

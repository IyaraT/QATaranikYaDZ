package lesson_2;

public class Main {

    public static void main(String[] args){
        crossArray();
    }

    public static void printThreeWords(){
        System.out.println("Orange,\nBanana,\nApple");
    }

    public static void checkSumSign(){
        int a = 6;
        int b = 7;
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }

    public static void printColor(){
        int value = 21;
        if (value <=  0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 99;
        int b = 101;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void checkSign(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean chekcSignBool(int a){
        return a < 0;
    }

    public static void typeString(String text, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

    public static boolean isYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void arrayFlip(){
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] == 0 ? 1 : 0;
            System.out.println(numbers[i]);
        }
    }

    public static void arrayFill(){
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }

    public static void multiplySix() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void crossArray(){
        int[][] array = new int [9][9];

        for (int i = 0; i < 9; i++){
            array[i][i] = 1;
            array[i][9 - 1  - i] = 1;
        }

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}

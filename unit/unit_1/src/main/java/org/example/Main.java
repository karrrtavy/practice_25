package org.example;
import java.util.Scanner;

/*
 * Scanner - класс для ввода с клавиатуры
 * n.charAt(t) - возвращает символ из строки n по индексу i
 * Character - класс, предоставляющий методы для работы с символами
 * Character.toString() - преобразует символ в строку
 * Integer - класс для int, числа -> объекты
 * Integer.parseInt() - преобразует строку в целочего число
 * final - константа
 */

public class Main {

    // 1 задание
    static void printGreeting() {
        System.out.println("Hello, world!");
    }

    // 2 задание
    static void division(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Division by zero isn`t allowed");
        } else {
            System.out.println(a + "/" + b + "=" + a / b + " и " + a % b + " в остатке");
        }
    }

    // 3 задание
    static void palindromValidator(String a) {
        for (int i = 0; i < a.length(); ++i) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                System.out.println("Number isn`t palindrom");
                return;
            }
        }
        System.out.println("Number is palindrom");
    }

    // 4 задание
    static void sumOfDigit(String n) {
        if (n.length() != 3) {
            System.out.println("Repeat input");
            return;
        }
        int sum = 0;
        for (int i = 0; i < n.length(); ++i) {
            sum += Integer.parseInt(Character.toString(n.charAt(i)));
        }
        System.out.println("Sum of " + n + ": " + sum);
    }

    // задание 5
    static void earthToMoon(double a) {
        final double k = 0.17;
        System.out.println(a * k);
    }

    public static void main(String[] args) {
        printGreeting();

        division(21, 8);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input a random number: ");
        String strNumber = in.nextLine();
        palindromValidator(strNumber);


        System.out.println("Input a random number of 3 digits: ");
        String str3Number = in.nextLine();
        sumOfDigit(str3Number);

        System.out.println("Input a weight: ");        
        double weight = in.nextDouble();
        earthToMoon(weight);

        in.close();
    }


}
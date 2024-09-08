package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        String ageString = age + " ";
        if (age % 10 == 1 && age % 100 != 11) {
            ageString += "год";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 12 || age % 100 > 14)) {
            ageString += "года";
        } else {
            ageString += "лет";
        }
        System.out.println(ageString);
    }
}
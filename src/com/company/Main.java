package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Кайсыл кунду чакырасыз: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();


        switch (Week.valueOf(userInput.toUpperCase(Locale.ROOT))) {
            case ДУЙШОМБУ:
                System.out.println("Дуйшомбу кечке сабак бар");
                break;
            case ШЕЙШЕМБИ:
                System.out.println("Кундузу практикага келем жана Софт Скилс сабагы бар");
                break;
            case ШАРШЕМБИ:
                System.out.println("Шаршемби кечке сабак бар");
                break;
            case БЕЙШЕМБИ:
                System.out.println("Кундузу практикага келем жана Англис тили сабагы бар");
                break;
            case ЖУМА:
                System.out.println("Жума кечке сабак бар");
                break;
            case ИШЕМБИ:
                System.out.println("Группа менен практика бар");
                break;
            case ЖЕКШЕМБИ:
                System.out.println("Келбейм!!!");
                break;
            default:
                break;
        }
    }

}

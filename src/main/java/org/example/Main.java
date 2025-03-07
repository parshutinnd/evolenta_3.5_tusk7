package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        name = scanner.nextLine();

        System.out.println("Введите возраст первого пользователя");
        age = scanner.nextInt();
        scanner.nextLine();

        User firstUser = new User(name,age);

        System.out.println(firstUser.toString());

        System.out.println("Введите имя второго пользователя");
        name = scanner.nextLine();

        System.out.println("Введите возраст второго пользователя");
        age = scanner.nextInt();

        User scndUser = new User(name,age);

        scanner.close();

        if(firstUser.getAge() < scndUser.getAge()){
            System.out.println(firstUser.toString());
        } else {
            System.out.println(scndUser.toString());
        }
    }
}
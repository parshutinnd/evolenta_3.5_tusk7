package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<User> users = GetUsersFromConsole(5);

        for(User u: users){
            System.out.println(u.toString());
        }
    }

    public static List<User> GetUsersFromConsole(int number){

        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        for(int i = 0; i < number; i++){
            String name;
            int age;

            System.out.println("Введите имя пользователя " + (i + 1));
            name = scanner.nextLine();

            System.out.println("Введите возраст пользователя" + (i + 1));
            age = scanner.nextInt();
            scanner.nextLine();

           users.add(new User(name,age));
        }

        Collections.sort(users);

        return users;
    }
}
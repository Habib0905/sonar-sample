package com.example;

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.println("Sum of 3 and 5 is: " + addNumbers(3, 5));
    }

    
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static String greet(String name) {
        String message = "Hello, User!";
        return message; // 'name' is ignored → SonarQube will flag this
    }
}

package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 (){
/* 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
        - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
        - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.*/
        Scanner scan = new Scanner (System.in);
        int a;
        int b;
        try {
            System.out.print("Введите первое целое число a = ");
            a = scan.nextInt();
            System.out.print("Введите второе целое число b = ");
            b = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Ошибка: " + e.getMessage());
            System.out.print("Пожалуйста, введите ЦЕЛЫЕ числа.");
            a = scan.nextInt();
            b = scan.nextInt();
        }

        if(a>b) System.out.println("a > b");
        else if (a<b) System.out.println("a < b");
        else if (a==b) System.out.println("a = b");

        System.out.println("a+b="+(a+b));
        if (a>=b){
            System.out.println("a-b="+(a-b));
            System.out.println("a/b="+(a/b)+" остаток: "+(a%b));
        }else {
            System.out.println("b-a="+(b-a));
            System.out.println("b/a="+(b/a)+" остаток: "+(b%a));
        }
        System.out.println("a*b="+(a*b));
    }

    public static void task2(){
/*  2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
      В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"*/
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите первую строку: ");
        String a = scan.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = scan.nextLine();
        if (a.equals(b)) System.out.println("Строки идентичны");
        else System.out.println("Строки неидентичны");
    }

    public static void task3(){
/*3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо написать программу, которая выведет в консоль все чётные числа.*/
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                System.out.println(array[i]);
            } else continue;
        }

    }
}
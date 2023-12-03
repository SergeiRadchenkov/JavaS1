package ru.geekbrains.api.seminar1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean f = true;   
        while (f) {
            System.out.println("Меню приложения");
            System.out.println("===============");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("================================");
            System.out.print("Укажите номер задачи: ");
            int no = Integer.parseInt(scanner.nextLine());
            switch (no) {
                case 0:
                    f = false;
                    System.out.println("Завершение работы приложения! Всего хорошего!");                  
                    break;

                case 1:
                    System.out.println("Hello Geekbrains!");
                    System.out.println(LocalDateTime.now());
                    printName();
                    break;

                case 2:
                    int[] array1 = new int[] {1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1};
                    processArray(array1);
                    break;
            
                default:
                    System.out.println("Вы указали некорректный пункт меню!\nПовторите попытку ввода.");
                    break;
            }
        }
    }

    static void printName() {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello," + name + "!");
    }

    /**
     * Дан массив чисел, состоящий из 0 и 1, вывести максимальное 
     * количество подряд идущих 1
     * @param array массив
     */
    static void processArray(int[] array) {
        int counter = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counter++;
            }
            else {
                counter = 0;
            }
            if (max < counter) {
                max = counter;
            }
        }
        System.out.println("Максимальное количество подряд идущих единиц " + max);              
    }
}

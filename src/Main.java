import java.util.Scanner;

public class Main {
    public static void printYearType(int yearCheck) {
        if ((yearCheck % 4 == 0 && yearCheck % 100 != 0) || yearCheck % 400 == 0) {
            System.out.println(yearCheck + " год является високосным");
        } else {
            System.out.println(yearCheck + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задание 1");
//        Реализуйте метод, который получает в качестве параметра год, проверяет,
//        является ли он високосным, и выводит результат в консоль.
//        високосным является каждый четвертый год, но не является каждый сотый.
//        Также високосным является каждый четырехсотый год.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год - ");
        int year = sc.nextInt();
        printYearType(year);
    }
}
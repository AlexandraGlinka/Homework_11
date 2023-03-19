import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void printYearType(int yearCheck) {
        if ((yearCheck % 4 == 0 && yearCheck % 100 != 0) || yearCheck % 400 == 0) {
            System.out.println(yearCheck + " год является високосным");
        } else {
            System.out.println(yearCheck + " год не является високосным");
        }
    }

    public static void printClientVersion(String nameOs, int yearOfCreation) { // проверяем ОС и год для задачи 2
        int os;
        int currentYear = LocalDate.now().getYear(); // текущий год

        if (nameOs.equals("iOS")) {
            os = 0; // iOs
        } else {
            os = 1; // Andriod
        }

        // !!!!!!!!!!!!!!
        // ПОЧЕМУ ЕСЛИ Я ДОБАВЛЯЮ УСЛОВИЕ ELSE IF, ВЫСВЕЛИЧВАЕТ ОШИБКУ, ЧТО НАДО ИНИЦИАЛИЗИРОВАТЬ OS ???
        // если использовать закомментированный кусок ниже, а не сверху
        // хотела дополнительно сделать проверку на регистр. не понимаю почему ошибка
//        if (nameOs.toLowerCase().equals("ios")) {
//            os = 0; // iOs
//        } else if (nameOs.toLowerCase().equals("andriod")) {
//            os = 1; // Andriod
//        }

        if (os == 0) {
            if (yearOfCreation < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (yearOfCreation < currentYear) {
                System.out.println("Установите облегченную версию приложения для Andrion по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

    }

    public static void printDelivaryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            //deliveryTime = deliveryTime;
        } else if (deliveryDistance < 60) {
            deliveryTime += 1;
        } else if (deliveryDistance < 100) {
            deliveryTime += 2;
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println("Потребуется дней на доставку: " + deliveryTime);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
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

    public static void task2() {
        System.out.println("Задание 2");
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите операционную систему - ");
        String osName = sc.next(); // вводим модель

        System.out.print("Введите год выпуска телефона - ");
        int clientDeviceYear = sc.nextInt(); // вводим год выпуска

        printClientVersion(osName, clientDeviceYear); // идем в метод и делаем проверку
    }

    public static void task3() {
        System.out.println("Задание 3");
        Scanner sc = new Scanner(System.in);

        System.out.print("Введине расстояние от офиса до адреса доставки - ");
        int deliveryDistance = sc.nextInt();

        printDelivaryTime(deliveryDistance);
    }

}
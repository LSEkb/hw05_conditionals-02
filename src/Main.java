public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int iOS = 0;
        int android = 1;
        int clientOS = 3;

        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("На ваш телефон нельзя установить приложение банка");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");

        int controlYear = 2015;

        int clientOS = 1;
        int clientYear = 2014;

        switch (clientOS) {
            case 0: // iOS
                if (clientYear < controlYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите обычную версию приложения для iOS по ссылке");
                }
                break;
            case 1: // android
                if (clientYear < controlYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("На ваш телефон нельзя установить приложение банка");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int year = 2021;
        //var leapYear = year % 4 = 0 && year % 100 != 0 || year % 400)==0
        if (year % 4 == 0 && year % 100 != 0 || year % 400==0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int deliveryTime = 1;
        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 1 + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("В ваш регион доставки нет");
        }


    }

    public static void task5() {
        System.out.println("Задача 5");

        int month = 12;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
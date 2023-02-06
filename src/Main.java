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
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подаждать.");
        }
        age += 2;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подаждать.");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        byte airTemperature = 4;
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " грудсов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + airTemperature + " грудса, можно идти без шапки.");
        }
        airTemperature += 2;
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " грудсов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + airTemperature + " грудса, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte speedLimit = 61;
        if (speedLimit >= 60) {
            System.out.println("Если скорость " + speedLimit + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedLimit + ", то можно ездить спокойно.");
        }
        speedLimit -= 2;
        if (speedLimit >= 60) {
            System.out.println("Если скорость " + speedLimit + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedLimit + ", то можно ездить спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte age = 3;
        boolean canNotGoToKindergarten = age >= 2 && age <= 6;
        if (canNotGoToKindergarten) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        age += 4;
        boolean canNotGoToSchool = age >= 7 && age<= 18;
        if (canNotGoToSchool) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        age += 12;
        boolean canNotGoToUniversity = age >= 19 && age <= 24;
        if (canNotGoToUniversity) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        age += 10;
        boolean canNotGoToStudy = age < 2;
        if (canNotGoToStudy) {
            System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить учиться.");
        } else {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
    }
}
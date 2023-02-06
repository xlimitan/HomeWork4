public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}
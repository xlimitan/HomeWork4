public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подаждать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte airTemperature = 8;
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " грудсов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + airTemperature + " нужно надеть шапку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte speedLimit = 36;
        if (speedLimit >= 60) {
            System.out.println("Если скорость " + speedLimit + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedLimit + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte age = 32;
        boolean canNotGoToKindergarten = age >= 2 && age <= 6;
        if (canNotGoToKindergarten) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age > 6 && age <= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age <= 24) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить учиться.");
        } else {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte ageChild = 22;
        if (ageChild < 5) {
            System.out.println("Есди возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе");
        } else if (ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься на аттракционе, только в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он  не может кататься на аттракционе, без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte vanCapacity = 102;
        byte numberOfSeats = 60;
        int numberOfOther = vanCapacity - numberOfSeats;
        short totalPersonSeats = 60;
        short totalPersonOther = 42;
        if (totalPersonSeats < numberOfSeats) {
            System.out.println("В вагоне есть ещё " + (numberOfSeats - totalPersonSeats) + " сидячих мест");
        }
        if (totalPersonOther < numberOfOther) {
            System.out.println("В вагоне есть ещё " + (numberOfOther - totalPersonOther) + " стоячих мест");
        }
        if (totalPersonSeats == numberOfSeats) {
            System.out.println("В вагоне нет сидячих места");
        }
        if (totalPersonOther == numberOfOther) {
            System.out.println("В вагоне нет стоячих места");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte one = 13;
        byte two = 15;
        byte three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимально число " + one);
            } else if (three > one) {
                System.out.println("Максимально число " + three);
            } else {
                System.out.println("Числа " + one + " и " + three + " равный.");
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Максимально число " + two);
            } else if (three > two) {
                System.out.println("Максимально число " + three);
            } else {
                System.out.println("Числа " + two + " и " + three + " равный.");
            }
        } else {
            if (one > three) {
                System.out.println("Максимально число " + one);
            } else if (three > one) {
                System.out.println("Максимально число " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}
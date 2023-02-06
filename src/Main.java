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
        byte ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Есди возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе");
        }
        ageChild += 5;
        boolean escort = true;
        boolean fulfilledTheConditions14 = ageChild >= 5 && ageChild < 15 && escort;
        if (fulfilledTheConditions14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься на аттракционе, только в сопровождении взрослого.");
        } else {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то он  не может кататься на аттракционе, без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte vanCapacity = 102;
        byte numberOfSeats = 60;
        short totalPerson = 59;
        boolean thereAreSeats = totalPerson < 60;
        boolean thereArePlacesForStanding = totalPerson < 102 && totalPerson > numberOfSeats;
        if (thereAreSeats) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        totalPerson += 20;
        boolean thereArePlacesForStanding2 = totalPerson < 102 && totalPerson > numberOfSeats;
        if (thereArePlacesForStanding2) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нету места");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte one = 1;
        byte two = 2;
        byte three = 3;
        boolean answer = one < two && one < three && two < three;
        if (answer) {
            System.out.println("Three самое больше число");
        } else {
            System.out.println("Three не самое большое число");
        }
    }
}
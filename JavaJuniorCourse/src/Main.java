package JavaJuniorCourse.src;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Printable client2 = new Client("Иванов1", "Иван1",222);
        Printable employee2 = new Employee("Петров1", "Петр1", 98766435667L);
        client2.print();
        employee2.print();

        SeasonHandler client3 = new Client("Иванов3", "Иван3",333);
        SeasonHandler employee3 = new Employee("Петров3", "Петр3", 333333333333L);
        client3.printSeason(Season.WINTER);
        employee3.printSeason(Season.AUTUMN);



    }

}

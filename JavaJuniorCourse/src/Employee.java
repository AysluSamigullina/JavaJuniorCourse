package JavaJuniorCourse.src;

public class Employee extends Person implements Printable, SeasonHandler {
    private long inn;

    public Employee(String name, String surname, long inn) {
        super(name, surname);
        this.inn = inn;
    }

    @Override
    public void print() {
        System.out.println(this.getName() + " " + this.getSurname() + " " + this.inn);
    }

    @Override
    public void printSeason(Season season) {
        System.out.println("Сейчас " + season.name() + ". Цвет этого сезона - " + season.getColor());
    }
}

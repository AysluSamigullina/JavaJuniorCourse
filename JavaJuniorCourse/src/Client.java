package JavaJuniorCourse.src;

public class Client extends Person implements Printable, SeasonHandler {
    private int agreementNum;



    public Client(String name, String surname, int agreementNum) {
        super(name, surname);
        this.agreementNum = agreementNum;
    }

    @Override
    public void print() {
        System.out.println(this.getName() + " " + this.getSurname() + " " + this.agreementNum);
    }
    @Override
    public void printSeason(Season season) {
        System.out.println("Сейчас " + season.name() + ". Цвет этого сезона - " + season.getColor());
    }
}

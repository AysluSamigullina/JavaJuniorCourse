package JavaJuniorCourse.src;

import java.util.Objects;

public class Flower implements Replantable {
    private int diameter;
    private String name;
    private int price;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flower(String name, int diameter, int price) {
        this.diameter = diameter;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return diameter == flower.diameter && Objects.equals(name, flower.name);
    }

    @Override
    public int hashCode() {
        return 17 * (name.hashCode() + diameter +1 );
    }

    @Override
    public String toString() {
        return "Комнатный цветок \"" + name + "\" в горшке диаметром " + diameter + ", цена " + price;
    }

    @Override
    public void replant() {
        System.out.println("Пересадить в горшок диаметром " + (this.diameter+2));
    }
}

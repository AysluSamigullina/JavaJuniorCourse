package JavaJuniorCourse.src;

import java.util.Objects;

public class Tree implements Replantable {
    private String name;
    private int price;
    private int age;

    public Tree(String name, int age, int price) {
        this.name = name;
        this.price = price;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Дерево \"" + name + ", возраст " + age + " года, цена " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return age == tree.age && Objects.equals(name, tree.name);
    }

    @Override
    public int hashCode() {
        return 17 * (name.hashCode() + age +1 );
    }

    @Override
    public void replant() {
        System.out.println("Пересадить в ОГ в ближайшее демисезонье");
    }
}

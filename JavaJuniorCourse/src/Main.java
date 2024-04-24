package JavaJuniorCourse.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower("petunia",10, 250);
        Flower flower2 = new Flower("astrum",10, 100);
        Tree tree = new Tree("olive", 3,1500);
        OtherGood furn = new OtherGood("Table");

        Good<Flower> good1 = new Good<>(flower);
        Good<Tree> good2 = new Good<>(tree);

        System.out.println(flower.toString());
        System.out.println(tree.toString());
        System.out.println("Сравнение " + flower.equals(flower2));
        flower.replant();
        tree.replant();
        //Good<OtherGood> good3 = new Good<>(furn);    // не проходит код из=за ограничения обощения по интерфейсу
     }
}

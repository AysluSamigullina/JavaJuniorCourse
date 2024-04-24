package JavaJuniorCourse.src;

public class Good <T extends Replantable> {
    private T good;

    public Good(T good) {
        this.good = good;
    }
}

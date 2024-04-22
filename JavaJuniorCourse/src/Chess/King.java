package JavaJuniorCourse.src.Chess;

public class King extends ChessPiece{
    private boolean alive;

    public King(int positionX, int positionY, int strength, boolean alive) {
        super(positionX, positionY, strength);
        this.alive = alive;
    }

    public King() {

    }

    @Override
    public void act() {
        System.out.println("King's action");
    }

    @Override
    public void fight() {
        System.out.println("King's fight");
    }
}

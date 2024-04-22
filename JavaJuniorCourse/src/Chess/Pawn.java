package JavaJuniorCourse.src.Chess;

public class Pawn extends ChessPiece{
    private boolean transform;

    public Pawn(int positionX, int positionY, int strength, boolean transform) {
        super(positionX, positionY, strength);
        this.transform = transform;
    }

    public Pawn() {
    }

    public boolean isTransform() {
        return transform;
    }

    public void setTransform(boolean transform) {
        this.transform = transform;
    }

    @Override
    public void act() {
        System.out.println("Pawn's action");
    }

    @Override
    public void fight() {
        System.out.println("Pawn's fight");
    }

    public void transformToQueen() {
        System.out.println("The Pawn transforms to Queen");
    }
}

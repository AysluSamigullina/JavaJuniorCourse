package JavaJuniorCourse.src.Chess;

public abstract class ChessPiece {
    private int positionX, positionY;

    private int strength;

    protected ChessPiece() {}
    protected ChessPiece(int positionX, int positionY, int strength) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.strength = strength;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public abstract void act();

    public abstract void fight();
}

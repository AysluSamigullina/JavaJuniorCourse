package JavaJuniorCourse.src;

import java.awt.*;

public enum Season {
    WINTER(Color.WHITE),
    SPRING(Color.PINK),
    SUMMER(Color.GREEN),
    AUTUMN(Color.ORANGE);

    private Color color;

    public Color getColor() {
        return color;
    }

    Season(Color color) {
        this.color = color;
    }
}

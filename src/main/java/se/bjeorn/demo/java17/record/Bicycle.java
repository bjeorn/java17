package se.bjeorn.demo.java17.record;

import java.util.Objects;

public final class Bicycle {
    private final String color;
    private final String wheelSize;

    public Bicycle(final String color, final String wheelSize) {
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public String getColor() {
        return color;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicycle)) return false;
        Bicycle bicycle = (Bicycle) o;
        return Objects.equals(color, bicycle.color)
            && Objects.equals(wheelSize, bicycle.wheelSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, wheelSize);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
            "color='" + color + '\'' +
            ", wheelSize='" + wheelSize + '\'' +
            '}';
    }
}

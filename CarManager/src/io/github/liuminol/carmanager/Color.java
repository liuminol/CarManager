package io.github.liuminol.carmanager;

public enum Color {

	WHITE, GREEN, BLACK, BLUE, ORANGE;

	@Override
    public String toString() {
        return name().toLowerCase();
    }
}

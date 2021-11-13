package io.github.liuminol.carmanager;

public enum Color {

	WHITE, GREEN, BLACK, BLUE, RED;

	@Override
    public String toString() {
        return name().toLowerCase();
    }
}

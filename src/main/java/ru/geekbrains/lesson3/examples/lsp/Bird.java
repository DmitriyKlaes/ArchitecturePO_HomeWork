package ru.geekbrains.lesson3.examples.lsp;

/**
 * T
 */
public class Bird {

    private boolean canFly = true;

    public Bird(boolean canFly) {
        this.canFly = canFly;
    }

    public Bird() {
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void fly(){
        System.out.println("Птица летит.");
    }

}

package oop;

public interface Saleable {

    default void toSell(){
        System.out.println("I'm selling");
    }

}

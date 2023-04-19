// Interfaces Abstract Classes

// Interface: special case of abstract class which follows these rules:
// 1. All methods are public and abstract
// 2. All properties are public static and final
// 3. No static methods

// Defines the behavior of our objects, thus typically only used to define methods and occasionally class constants
// Interfaces allow us to define the way that our objects interact with the rest of our application

package java2;

public interface WritesCode<Bug> {
    Bug[] writeCode (int numberOfLines);
    boolean debug(Bug bug);
    void drinkCoffee();


}

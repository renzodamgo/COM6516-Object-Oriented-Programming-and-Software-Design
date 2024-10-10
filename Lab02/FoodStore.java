/*
 * FoodStore.java  1.0 26/08/2011
 *
 * Copyright (c) University of Sheffield 2011
 */

/**
 * FoodStore.java
 *
 * A simple class used in COM6516 lab class
 *
 */
// this line of code declares the class
public class FoodStore {

    // this is the constructor, which is called when a new object is created
    // the constructor name is always the same as the class name
    // classes can have more than one constructor
    // the constructor takes zero or more parameters
    // in this case there is one parameter (int a) that is used to set the
    // instance field of the class
    public FoodStore(int a) {
        amountStored = a;
        amountDeposited = 0;
        amountWithdrawn = 0;
    }

    // these are class methods, which enable the value of the instance
    // field to be modified
    // these methods have a public access modifier, because they need to
    // be called by other classes
    // neither class method returns anything, so the return type is void
    public static void depositFood(int amountToDeposit) {
        amountStored = amountStored + amountToDeposit;
        amountDeposited += amountToDeposit;
    }

    public static void withdrawFood(int amountToWithdraw) {
        amountStored = amountStored - amountToWithdraw;
        amountWithdrawn += amountToWithdraw;
    }

    // these are accessor methods, which return the value of the instance field
    public static int getAmountStored() {
        return (amountStored);
    }

    public String toString() {
        return ("AmountStored = " + amountStored + " AmountDeposited = "
                + amountDeposited + " AmountWithdrawn = " + amountWithdrawn);
    }

    // this is the instance field, which is an attribute associated with
    // each object of the FoodStore class
    // the access modifier is private, which means that this field can
    // only be accessed through the class methods
    // by keeping instance fields private there is a well specified interface
    // to the data associated with each object
    // this approach is called encapsulation
    private static int amountStored;
    private static int amountDeposited;
    private static int amountWithdrawn;

}

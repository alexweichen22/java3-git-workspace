package ca.jac.a10a_starbuzz.model;

import java.io.Serializable;

import ca.jac.a10a_starbuzz.R;

public class Food implements Serializable {

    private String name;
    private String description;
    private int imageResourceId;

    //Each Food has a name, description, and an image resource
    private Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }

    //drinks is an array of Drinks
    public static final Food[] food = {
            new Food("Fries",
                    "Original Canada Farm Patato, We support the local farm",
                    R.drawable.fries),
            new Food("Cupcake",
                    "Blueberry flavor, Strawberry flavor",
                    R.drawable.cupcake),
            new Food("Brownie",
                    "Fresh all time, Quebec traditional",
                    R.drawable.brownie)
    };
}

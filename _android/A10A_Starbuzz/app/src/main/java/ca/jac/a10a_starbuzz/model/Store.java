package ca.jac.a10a_starbuzz.model;

import java.io.Serializable;

import ca.jac.a10a_starbuzz.R;

public class Store implements Serializable {

    private String name;
    private String description;
    private int imageResourceId;

    //Each Store has a name, description, and an image resource
    private Store(String name, String description, int imageResourceId) {
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

    //drinks is an array of Stores
    public static final Store[] stores = {
            new Store("Montreal",
                    "Located in Downtown Montreal",
                    R.drawable.storemontreal),
            new Store("Laval",
                    "Located in Center of Laval",
                    R.drawable.storelaval),
            new Store("Tremblant",
                    "Located near National Park of Tremblant",
                    R.drawable.storetremblant)
    };
}

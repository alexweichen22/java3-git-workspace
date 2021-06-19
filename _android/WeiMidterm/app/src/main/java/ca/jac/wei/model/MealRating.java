package ca.jac.wei.model;
import androidx.annotation.NonNull;

import java.io.Serializable;

public class MealRating implements Comparable, Serializable {

    private String mealName;
    private int rating;

    public MealRating(String mealName, int rating) {
        this.mealName = mealName;
        this.rating = rating;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Meal: " + mealName + "Rating: " + rating;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        MealRating otherObject = (MealRating) o;
        return mealName.compareTo(otherObject.getMealName());
    }
}









//------------------------------------------ An other way of implementing compareTo method
//        if(mealName.compareTo(otherObject.getMealName()) > 0)
//            return 1;
//        else if(mealName.compareTo(otherObject.getMealName())==0)
//            return 0;
//        else
//            return -1;



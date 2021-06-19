package ca.jac.a10a_starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ca.jac.a10a_starbuzz.model.Food;

public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_FOODID = "foodId";

    ImageView photoFood;
    TextView nameFood, descriptionFood;
    Food food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        initialize();
        getMyIntent();
        populateData(food);
    }

    private void initialize() {
        photoFood = findViewById(R.id.photoFood);
        nameFood = findViewById(R.id.nameFood);
        descriptionFood = findViewById(R.id.descriptionFood);
    }

    private void getMyIntent() {
        // 1-
        int foodId = (Integer)getIntent().getExtras().get(EXTRA_FOODID);

        food = Food.food[foodId];
    }
    private void populateData(Food food) {
        // 2-
        nameFood.setText(food.getName());

        // 3-
        descriptionFood.setText(food.getDescription());

        // 4-
        photoFood.setImageResource(food.getImageResourceId());
        photoFood.setContentDescription(food.getName());

    }
}
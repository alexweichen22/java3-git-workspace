package ca.jac.wei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

import ca.jac.wei.model.MealRating;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener, AdapterView.OnItemSelectedListener{

    Spinner spinnerMeal;
    ImageView imageViewMeal;
    RatingBar ratingBarMeal;
    Button btnAdd, btnShowAll, btnMeal,btnSalad;

    String[] listMeal = {"Salmon", "Poutine", "Sushi", "Tacos"};
    String[] listSalad = {"Chicken Salad","Montreal","Green Salad"};
    int[] mealPicture = {R.drawable.salmon, R.drawable.poutine, R.drawable.sushi, R.drawable.tacos};
    int[] saladPicture = {R.drawable.chickensalad, R.drawable.montreal, R.drawable.greensalad};

    View selectedView;
    int imageDefaultMeal, imageDefaultSalad;

    ArrayList<MealRating> listOfMealRating;
    ArrayAdapter<String> mealAdapter, saladAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        listOfMealRating = new ArrayList<>();

        // Reference to ratingBar.................................
        ratingBarMeal = findViewById(R.id.ratingBar);
        //........................................................


        imageViewMeal = findViewById(R.id.imageView);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnShowAll = findViewById(R.id.btnShowAll);
        btnShowAll.setOnClickListener(this);

        btnMeal = findViewById(R.id.btnMeal);
        btnMeal.setOnClickListener(this);

        btnSalad = findViewById(R.id.btnSalad);
        btnSalad.setOnClickListener(this);

        // Initialize spinner -----------------------------------
        spinnerMeal = findViewById(R.id.spinnerMeal);
        spinnerMeal.setOnItemSelectedListener(this);

        mealAdapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                listMeal);
        saladAdapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                listSalad);
        spinnerMeal.setAdapter(mealAdapter);
        //-------------------------------------------------------
    }

    // AdapterView.OnItemSelectedListener ----------------------------------------------------------
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
        // 'parent' The AdapterView where the click happened
        // 'i' is index of selected item in spinner,
        // so we can assign the corresponding image reference
        // from our image array to our imageView
        int image = mealPicture[i];
        imageViewMeal.setImageResource(image);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) { }
    //----------------------------------------------------------------------------------------------

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btnAdd:
                addMealRating();
                break;

            case R.id.btnShowAll:
                showAllMealRating();
                break;
            case R.id.btnMeal:
                spinnerMeal.setAdapter(mealAdapter);
                selectedView = spinnerMeal;
                imageDefaultMeal = mealPicture[1];
                imageViewMeal.setImageResource(imageDefaultMeal);
                break;
            case R.id.btnSalad:
                spinnerMeal.setAdapter(saladAdapter);
                selectedView = spinnerMeal;
                imageDefaultSalad = saladPicture[1];
                imageViewMeal.setImageResource(imageDefaultSalad);
                break;

        }
    }

    private void addMealRating() {
        String meal = spinnerMeal.getSelectedItem().toString();

        // Read ratingBar ....................................
        int rating  = (int) ratingBarMeal.getRating();
        //....................................................

        // Create new object and add it to our model array....
        MealRating mealRating = new MealRating(meal, rating);
        listOfMealRating.add(mealRating);
        //....................................................

        // Reset rating bar for next time
        ratingBarMeal.setRating(0);
    }

    private void showAllMealRating() {
        Collections.sort(listOfMealRating);

        StringBuilder sb = new StringBuilder("");

        for(MealRating oneMealRating : listOfMealRating) {
            sb.append(oneMealRating).append("\n");
        }
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();

        passIntent();
    }

    private void passIntent() {
        Intent myIntent = new Intent(this,RatingResultsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("serializableRatingKey",(Serializable)listOfMealRating);
        myIntent.putExtra("ratingKey", bundle);
        startActivity(myIntent);

    }

}
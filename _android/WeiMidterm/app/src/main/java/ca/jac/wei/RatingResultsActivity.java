package ca.jac.wei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.io.Serializable;
import java.util.ArrayList;

import ca.jac.wei.model.MealRating;

public class RatingResultsActivity extends AppCompatActivity {
    EditText editTextResultsDisplay, editTextRegisterBy;
    Button buttonGoBack;
    ArrayList<MealRating> mealRatingArray, mealRatingArrayOneStar, mealRatingArrayTwoStar,mealRatingArrayThreeStar;
    RadioButton radioButtonOneStar, radioButtonTwoStar, radioButtonThreeStar;
    String registeredBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_results);
        initialize();
        myGetIntent();

    }

    private void initialize() {
        editTextResultsDisplay = findViewById(R.id.editTextResultsDisplay);
        editTextRegisterBy = findViewById(R.id.editTextRegisterBy);
        buttonGoBack = findViewById(R.id.buttonGoBack);
        radioButtonOneStar = findViewById(R.id.radioButtonOneStar);
        radioButtonTwoStar = findViewById(R.id.radioButtonTwoStar);
        radioButtonThreeStar = findViewById(R.id.radioButtonThreeStar);
    }


    private void myGetIntent() {
        Intent receivedIntent = getIntent();
        Bundle myBundle = receivedIntent.getBundleExtra("ratingKey");
        Serializable serialRating = myBundle.getSerializable("serializableRatingKey");
        String output = "";
        mealRatingArray = (ArrayList<MealRating>)serialRating;
        for(MealRating oneRating:mealRatingArray){
            output += (oneRating.toString() + "\n");
        }
        editTextResultsDisplay.setText(output);
    }

    public void displayOneStar(View view) {
        String output = "";
        mealRatingArrayOneStar.clear();
        for(int i=0;i<mealRatingArray.size();i++){
            if(mealRatingArray.get(i).getRating()==1){
                mealRatingArrayOneStar.add(mealRatingArray.get(i));
            }
        }

        for(MealRating oneRating:mealRatingArrayOneStar){
            output += (oneRating.toString() +"\n");
        }

        editTextResultsDisplay.setText(output);
    }
    public void displayTwoStar(View view){
        String output = "";
        mealRatingArrayTwoStar.clear();
        for(int i=0;i<mealRatingArray.size();i++){
            if(mealRatingArray.get(i).getRating()==2){
                mealRatingArrayTwoStar.add(mealRatingArray.get(i));
            }
        }

        for(MealRating oneRating:mealRatingArrayTwoStar){
            output += (oneRating.toString() +"\n");
        }

        editTextResultsDisplay.setText(output);
    }
    public void displayThreeStar(View view){
        String output = "";
        mealRatingArrayThreeStar.clear();
        for(int i=0;i<mealRatingArray.size();i++){
            if(mealRatingArray.get(i).getRating()==2){
                mealRatingArrayThreeStar.add(mealRatingArray.get(i));
            }
        }

        for(MealRating oneRating:mealRatingArrayThreeStar){
            output += (oneRating.toString() +"\n");
        }

        editTextResultsDisplay.setText(output);
    }


    public void registMe(View view) {
        registeredBy = editTextRegisterBy.getText().toString();
    }
}
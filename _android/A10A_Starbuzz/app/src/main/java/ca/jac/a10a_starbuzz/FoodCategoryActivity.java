package ca.jac.a10a_starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import ca.jac.a10a_starbuzz.model.Food;

public class FoodCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);

        initializeListView();
    }

    private void initializeListView() {
        // 1-
        ListView listFood = findViewById(R.id.list_food);

        // 2-
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Food.food);

        // 3-
        listFood.setAdapter(listAdapter);

        // 4-
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listFoodAdapterView,
                                            View itemView,
                                            int position,    // Position in the ListView start from zero
                                            long id) {       // Row id of the underlying data

                        // How to get an item based on clicked cell from AdapterView
                        System.out.println("FoodCategoryActivity -----------------------\n" +
                                listFoodAdapterView.getItemAtPosition(position).toString());

                        Toast.makeText(FoodCategoryActivity.this, "position = " +
                                position + ", id = " + id,Toast.LENGTH_SHORT).show();

                        // 3-1- Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
                        intent.putExtra(FoodActivity.EXTRA_FOODID, (int) id);
                        startActivity(intent);
                    }
                };
        // 5-
        listFood.setOnItemClickListener(itemClickListener);

    }
}
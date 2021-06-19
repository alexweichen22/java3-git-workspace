package ca.jac.a10a_starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import ca.jac.a10a_starbuzz.model.Food;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        initializeListView();
    }

    private void initializeListView() {

        // 1- Create a ListView with XML array entries
        ListView listView = findViewById(R.id.list_options);
        // 1-1- listView Adapter is set in listView XML by an array from strings.xml

        // 2- Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =

                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,   // Position in the ListView start from zero
                                            long id) {      // Row id of the underlying data
                        if (position == 0) {
                            Intent intent = new Intent(TopLevelActivity.this,
                                    DrinkCategoryActivity.class);
                            startActivity(intent);
                        }else if (position == 1){
                            Intent intent = new Intent(TopLevelActivity.this, FoodCategoryActivity.class);
                            startActivity(intent);
                        }else if (position == 2){
                            Intent intent = new Intent(TopLevelActivity.this, StoreCategoryActivity.class);
                            startActivity(intent);
                        }
                    }
                };

        // 3- Add the listener to the list view
        listView.setOnItemClickListener(itemClickListener);
    }
}
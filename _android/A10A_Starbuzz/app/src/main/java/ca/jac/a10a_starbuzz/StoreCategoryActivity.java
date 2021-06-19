package ca.jac.a10a_starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import ca.jac.a10a_starbuzz.model.Store;

public class StoreCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_category);

        initializeListView();
    }

    private void initializeListView() {
        // 1-
        ListView listStores = findViewById(R.id.list_stores);

        // 2-
        ArrayAdapter<Store> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Store.stores);

        // 3-
        listStores.setAdapter(listAdapter);

        // 4-
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listStoresAdapterView,
                                            View itemView,
                                            int position,    // Position in the ListView start from zero
                                            long id) {       // Row id of the underlying data

                        // How to get an item based on clicked cell from AdapterView
                        System.out.println("StoreCategoryActivity -----------------------\n" +
                                listStoresAdapterView.getItemAtPosition(position).toString());

                        Toast.makeText(StoreCategoryActivity.this, "position = " +
                                position + ", id = " + id,Toast.LENGTH_SHORT).show();

                        // 3-1- Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(StoreCategoryActivity.this, StoreActivity.class);
                        intent.putExtra(StoreActivity.EXTRA_STOREID, (int) id);
                        startActivity(intent);
                    }
                };

        // 5-
        listStores.setOnItemClickListener(itemClickListener);
    }
}
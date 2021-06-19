package ca.jac.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> countriesArrayMain;
    ArrayAdapter<Country> countriesAdapterMain;
    ListView listViewMain;
    Button buttonAdd,buttonEdit,buttonDelete,buttonNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        countriesArrayMain = new ArrayList<>();

        countriesArrayMain.add(new Country("Canada", "Ottawa"));
        countriesArrayMain.add(new Country("USA", "DC"));
        countriesArrayMain.add(new Country("UK", "London"));
        countriesArrayMain.add(new Country("France", "Paris"));

        countriesAdapterMain = new ArrayAdapter<Country>(
            this,
            android.R.layout.simple_list_item_1,
                countriesArrayMain);

        listViewMain.setAdapter(countriesAdapterMain);


    }
}
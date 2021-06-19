package ca.jac.weifinalexam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import ca.jac.weifinalexam.model.Country;


public class MainActivity extends AppCompatActivity implements
        View.OnClickListener,
        AdapterView.OnItemClickListener,
        AdapterView.OnItemLongClickListener,
        DialogInterface.OnClickListener {

    EditText editTextCountryName, editTextCapital;
    Button btnAdd, btnSort;

    ListView listViewCountries;
    ArrayList<Country> listOfCountries;
    ArrayAdapter<Country> countryAdapter;

    AlertDialog alertDialog;
    AlertDialog.Builder alertDialog_Builder;

    int clickedItemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        initializeModel();
        initializeListView();
        initializeAlertDialog();
    }

    private void initialize() {

        editTextCountryName = findViewById(R.id.editTextCountryName);
        editTextCapital = findViewById(R.id.editTextCapital);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnSort = findViewById(R.id.btnSort);
        btnSort.setOnClickListener(this);
    }

    private void initializeModel() {
        //Define data
        listOfCountries = new ArrayList<Country>();

        Country c1 = new Country("China", "Beijing"),
                c2 = new Country("India", "Delhi");

        listOfCountries.add(c1);
        listOfCountries.add(c2);

        listOfCountries.add(new Country("Canada", "Ottawa"));
        listOfCountries.add(new Country("Iran", "Tehran"));
        listOfCountries.add(new Country("US", "DC"));
    }

    private void initializeListView() {

        //1- Create reference to ListView
        listViewCountries = findViewById(R.id.listViewCountries);
        listViewCountries.setOnItemClickListener(this);
        listViewCountries.setOnItemLongClickListener(this);

        //2- Define an Adapter for ListView
        countryAdapter = new ArrayAdapter<Country>(this,
                android.R.layout.simple_list_item_1,
                listOfCountries);

        //3- Setting the Adapter
        listViewCountries.setAdapter(countryAdapter);
    }

    private void initializeAlertDialog() {
        //Using the alert
        alertDialog_Builder = new AlertDialog.Builder(this);

        alertDialog_Builder.setTitle("Delete element");
        alertDialog_Builder.setMessage("Do you want to delete (Y/N)");

        alertDialog_Builder.setPositiveButton("Yes", this);
        alertDialog_Builder.setNegativeButton("No", this);

        alertDialog = alertDialog_Builder.create();
    }

    // View.OnClickListener ------------------------------------------------------------------------
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAdd:
                goAdd();
                break;

            case R.id.btnSort:
                goSort();
                break;
        }
    }

    private void goAdd() {
        String countryName = editTextCountryName.getText().toString();
        String capital = editTextCapital.getText().toString();

        if (!countryName.isEmpty() && !capital.isEmpty()) {

            Country country = new Country(countryName, capital);
            listOfCountries.add(country);
            countryAdapter.notifyDataSetInvalidated();

            editTextCountryName.setText("");
            editTextCapital.setText("");

            editTextCountryName.requestFocus();
        } else
            Toast.makeText(this,
                    "Country name or capital is empty.",
                    Toast.LENGTH_SHORT).show();
    }

    private void goSort() {
        Collections.sort(listOfCountries);
        countryAdapter.notifyDataSetChanged();
    }
    //----------------------------------------------------------------------------------------------

    // AdapterView.OnItemClickListener -------------------------------------------------------------
    // Get the clicked item from list and set it in editTexts
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Country selectedCountry = listOfCountries.get(position);
        editTextCountryName.setText(selectedCountry.getCountryName());
        editTextCapital.setText(selectedCountry.getCapital());
    }
    //----------------------------------------------------------------------------------------------

    // AdapterView.OnItemLongClickListener ---------------------------------------------------------
    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        // 'parent' The AdapterView where the click happened
        // 'position' is the index of selected item in the ListView

        clickedItemPosition = position;
        alertDialog.show();

        // true means that the View that currently received the event is the true event receiver and
        // the event should not be propagated to the other Views in the tree;
        // when you return false you let the event be passed to the other Views that may consume it.
        return true;
    }
    //----------------------------------------------------------------------------------------------

    // DialogInterface.OnClickListener -------------------------------------------------------------
    // Pay attention that DialogInterface onClick needs to know the position of long clicked item
    @Override
    public void onClick(DialogInterface dialog, int which) {

        switch (which) {
            case DialogInterface.BUTTON_POSITIVE:
                listOfCountries.remove(clickedItemPosition);
                countryAdapter.notifyDataSetChanged();
                break;

            case DialogInterface.BUTTON_NEGATIVE:
                break;
        }
    }
    //----------------------------------------------------------------------------------------------
}

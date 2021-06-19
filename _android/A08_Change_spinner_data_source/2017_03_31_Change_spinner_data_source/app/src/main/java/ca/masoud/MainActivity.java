package ca.masoud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener,
        View.OnClickListener {

    Spinner spinnerDays;
    Button btnAssignColors, btnDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        spinnerDays = findViewById(R.id.spinnerDays);
        spinnerDays.setOnItemSelectedListener(this);

        btnAssignColors = findViewById(R.id.btnAssignColors);
        btnAssignColors.setOnClickListener(this);

        btnDisplayTextView = findViewById(R.id.btnDisplayTextView);
        btnDisplayTextView.setOnClickListener(this);
    }

    // View.OnClickListener Interface
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnDisplayTextView:
                //-------------------------------------------- Manually extract text of selected spinner item to Toast it
                View selectedView = spinnerDays.getSelectedView();

                TextView selectedTextView = (TextView) selectedView;
                String selectedText = selectedTextView.getText().toString();
                Toast.makeText(this, "You select : " + selectedText, Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnAssignColors:
                //-------------------------------------------- Assign new array to spinner by adapter
                ArrayAdapter adapter = ArrayAdapter.createFromResource(
                        this,
                        R.array.myColors,
                        R.layout.support_simple_spinner_dropdown_item);

                spinnerDays.setAdapter(adapter);
                break;
        }
    }

    // Automatically extract text of the selected spinner item to Toast it -------------------------
    // AdapterView.OnItemSelectedListener Interface ------------------------------------------------
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // 'adapterView' The AdapterView where the click happened
        // 'i' is the index of selected item in the spinner
        // 'l' The row id of the item that was clicked
        TextView textView = (TextView) view;
        String selectTextView = textView.getText().toString();

        Toast.makeText(this, "The selected text is " + selectTextView +
                        "\n Position is " + i +
                        "\n Row id is " + l,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
    //----------------------------------------------------------------------------------------------
}
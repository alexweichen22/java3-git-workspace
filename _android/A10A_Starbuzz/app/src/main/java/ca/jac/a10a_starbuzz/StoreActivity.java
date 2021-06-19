package ca.jac.a10a_starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ca.jac.a10a_starbuzz.model.Store;

public class StoreActivity extends AppCompatActivity {

    public static final String EXTRA_STOREID = "storeId";
    
    ImageView photoStore;
    TextView nameStore, descriptionStore;
    Store store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        
        initialize();
        getMyIntent();
        populateData(store);
    }

    private void initialize() {
        photoStore = findViewById(R.id.photoStore);
        nameStore = findViewById(R.id.nameStore);
        descriptionStore = findViewById(R.id.descriptionStore);
    }

    private void getMyIntent() {
        // 1-
        int storeId = (Integer)getIntent().getExtras().get(EXTRA_STOREID);

        store = Store.stores[storeId];
    }

    private void populateData(Store store) {
        // 2-
        nameStore.setText(store.getName());

        // 3-
        descriptionStore.setText(store.getDescription());

        // 4-
        photoStore.setImageResource(store.getImageResourceId());
        photoStore.setContentDescription(store.getName());
    }
}
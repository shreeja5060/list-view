package rob.myappcompany.myapplicationlisting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView =findViewById(R.id.myListView);
        ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Shreeja");
        myFamily.add("smriti");
        myFamily.add("shreya");
        myFamily.add("shakshi");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,myFamily);
        myListView.setAdapter(arrayAdapter);
    }
}
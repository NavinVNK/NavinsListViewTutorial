package com.nawin.navinslistviewtutorial;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] bond_films = { "Dr.No", "Man with Golden gun",
            "You only Live twice", "Live and Let die", "Thunderball",
            "License to Kill", "From Russia with Love", "Moonraker",
            "Octopussy", "A View to Kill", "On Her Majesty Service",
            "Golden Eye","Tommorrow never Dies","Never say never  again","Casino Royale",
            "Sky Fall","Spectere","Quantom of Solace","Die another day","On Your Majesty Service","Gold finger","Diamonds are for Ever"


    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // use your custom layout
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //        R.layout.item_row, R.id.label, bond_films);
        MyarrayAdapter adapter = new MyarrayAdapter(this, bond_films);
        setListAdapter(adapter);
      //  setListAdapter(new ArrayAdapter<String>(this,
      //          android.R.layout.simple_list_item_1, bond_films));
        ListView lstView = getListView();
       lstView.setTextFilterEnabled(true);
    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(this, "You have selected " + bond_films[position],
                Toast.LENGTH_SHORT).show();
    }
}
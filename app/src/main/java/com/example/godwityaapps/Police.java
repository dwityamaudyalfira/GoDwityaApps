package com.example.godwityaapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Police extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listPolice = new String[] {"Polda Riau", "Polsek Tenayan Raya"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPolice));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan) {
        try {
            Intent a = null;

            if (pilihan.equals("Polda Riau")) {
                a = new Intent(this, PoldaRiau.class);

            } else if (pilihan.equals("Polsek Tenayan Raya")) {
                a = new Intent(this, PolrestaPekanbaru.class);

            }

            startActivity(a);

        }    catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

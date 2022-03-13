package com.example.godwityaapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSIslamIbnuSina extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "Driving Directions", "Website", "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan) {
        try {
            Intent a = null;

            if (pilihan.equals("Call Center")) {
                String telephone = "tel:0761-24242";
                a = new Intent (Intent.ACTION_DIAL, Uri.parse(telephone));

            } else if (pilihan.equals("Driving Directions")) {
                String lokasiHospital = "https://maps.app.goo.gl/DSPhMnAe7jYjMfTz5";
                a = new Intent (Intent.ACTION_VIEW, Uri.parse(lokasiHospital));


            } else if (pilihan.equals("Website")) {
                String website = "https://www.rsi-ibnusina.com";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"RS Islam Ibnu Sina Pekanbaru");

            }

            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

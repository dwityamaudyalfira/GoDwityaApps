package com.example.godwityaapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listHospital = new String[] {"RSUD Arifin Achmad", "RS Islam Ibnu Sina", "RS Jiwa Tampan", "RS Pekanbaru Eye Center", "RSIA Zainab"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, listHospital));
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

            if (pilihan.equals("RSUD Arifin Achmad")) {
                a = new Intent(this, RSUDArifinAchmad.class);

            } else if (pilihan.equals("RS Islam Ibnu Sina")) {
                a = new Intent(this, RSIslamIbnuSina.class);

            }  else if (pilihan.equals("RS Jiwa Tampan")) {
                a = new Intent(this, RSJiwaTampan.class);

            } else if (pilihan.equals("RS Pekanbaru Eye Center")) {
                a = new Intent(this, RSPekanbaruEyeCenter.class);

            } else if (pilihan.equals("RSIA Zainab")) {
                a = new Intent(this, RSIAZainab.class);
            }

            startActivity(a);

        }    catch (Exception e)
            {
                e.printStackTrace();
            }
        }

}


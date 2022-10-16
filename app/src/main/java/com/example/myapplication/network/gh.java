package com.example.myapplication.network;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.AdapterView;



public class gh extends Context {
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
            Log.i("Click", "click en el elemento " + position + " de mi ListView");
            muestraDialogo();

        }
    });
}
    private void muestraDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Deseas realizar alguna acción?")
                .setCancelable(false)
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Aquí lo que deseas realizar
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}

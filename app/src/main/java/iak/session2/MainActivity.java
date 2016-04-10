package iak.session2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button pencet; //implementasi button

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Keluar")
                .setMessage("Apa Anda Yakin akan keluar?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//menampilkan layout
        addListenerOnButton();//pengaruh di button ke form2
        Typeface terserahKamu = Typeface.createFromAsset(getAssets(), "Admiration Pains.ttf");
        TextView samaaja = (TextView) findViewById(R.id.awal); //id textView
        samaaja.setTypeface(terserahKamu);

    }
    public void addListenerOnButton() {
        final Context context = this;
        pencet = (Button) findViewById(R.id.klik);//idButton
        pencet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, form2.class);//memanggil class
                startActivity(intent);
            }

        });
    }
}

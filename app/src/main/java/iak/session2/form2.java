package iak.session2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by developer on 4/10/16.
 */
public class form2 extends MainActivity {

    EditText ed1, ed2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form2);//menampilkan form2
        ed1 = (EditText) findViewById(R.id.editText);//sesuai id form2
        ed2 = (EditText) findViewById(R.id.editText2);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") &&

                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Sukses Login", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(form2.this, MainActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Password anda Salah", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
}
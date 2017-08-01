package com.example.hes_stajyer.heskablokatalog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendEmail extends AppCompatActivity {


    Button btn_Send;
    EditText et_Subject;
    EditText et_Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);

        et_Subject = (EditText) findViewById(R.id.et_Subject);
        et_Email = (EditText) findViewById(R.id.et_Mail);
        btn_Send = (Button) findViewById(R.id.btn_SendEmail);


        btn_Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"hes@hes.com.tr"});
                email.putExtra(Intent.EXTRA_SUBJECT, et_Subject.getText());
                email.putExtra(Intent.EXTRA_TEXT, et_Email.getText());
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Lütfen Bir E-Mail İstemcisi Seçiniz :"));
            }
        });



    }
}

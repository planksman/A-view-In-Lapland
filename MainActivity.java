package com.example.viewinlapland;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button gogl;
    private TextView link;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gogl = (Button) findViewById(R.id.btngoogle);
        link = (TextView) findViewById(R.id.textViewInfo);

        link.setMovementMethod(LinkMovementMethod.getInstance());

        gogl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwzEspzzZg9GLPSSzIScxLAQA-YgZS&q=lapland&rlz=1C1GCEU_fiFI1070FI1070&oq=lapla&aqs=chrome.2.69i57j46i131i199i433i465i512j46i433i512j0i433i512j46i131i175i199i433i512i664i665i670j0i131i433i512j46i131i175i199i433i512i664i665i670l2j0i512.5104j0j7&sourceid=chrome&ie=UTF-8")));
            }
        });
    }
}
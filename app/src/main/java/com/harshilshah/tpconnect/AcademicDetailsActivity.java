package com.harshilshah.tpconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcademicDetailsActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_details);
    
        Button btnNext = (Button) (findViewById(R.id.btnNext));
    
        Intent i = new Intent(AcademicDetailsActivity.this, InternshipDetailsActivity.class);
    
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
}

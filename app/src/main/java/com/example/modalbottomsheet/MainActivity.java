package com.example.modalbottomsheet;

import static com.google.android.material.bottomsheet.BottomSheetBehavior.from;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    public Button showbtn;
    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout bottomSheetLayout = findViewById(R.id.bottomsheetl);
        bottomSheetBehavior = from(bottomSheetLayout);

        showbtn =  findViewById(R.id.showbtn);

        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(bottomSheetBehavior.STATE_HALF_EXPANDED);

            }
        });
    }
}
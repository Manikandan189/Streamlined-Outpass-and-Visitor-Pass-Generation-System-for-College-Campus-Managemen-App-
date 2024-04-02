package com.example.kit_visiguard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class outpassreg extends AppCompatActivity {
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outpassreg);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt();
            }
        });
    }

    private void bt() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Sent to Hod");
        // Set the message of the dialog

// Add a button to the dialog
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Do something when the OK button is clicked
                dialog.dismiss(); // Dismiss the dialog
            }
        });

// Create and show the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}
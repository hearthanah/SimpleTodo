package com.hanahluong.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditItemActivity extends AppCompatActivity {

    String oldItem;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        Intent getIntent = getIntent();
        oldItem = getIntent.getStringExtra("item");

        etName =(EditText) findViewById(R.id.editText);
        etName.setText(oldItem);
        etName.setSelection(etName.getText().length());

    }

    public void onSubmit(View view) {


        Intent data = new Intent();

        data.putExtra("newItem", etName.getText().toString());

        setResult(RESULT_OK, data);
        finish();
    }



}

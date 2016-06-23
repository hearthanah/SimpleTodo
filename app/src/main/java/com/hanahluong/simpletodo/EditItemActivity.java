package com.hanahluong.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

    }

    public void onSubmit(View view) {
        EditText etName =(EditText) findViewById(R.id.editText);

        Intent data = new Intent();

        data.putExtra("newItem", etName.getText().toString());

        setResult(RESULT_OK, data);
        finish();
    }

}

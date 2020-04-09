package com.iamthaoly.hocrecylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.iamthaoly.adapter.ContactAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvContact;
    ContactAdapter contactAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        rvContact = findViewById(R.id.rvContact);
        contactAdapter = new ContactAdapter(MainActivity.this, R.layout.contact_item);
        rvContact.setAdapter();
    }
}

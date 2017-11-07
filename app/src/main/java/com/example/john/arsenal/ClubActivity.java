package com.example.john.arsenal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        Club club = new Club();
        ArrayList<Player> arsenal = club.getArsenal();

        ClubAdapter arsenalAdapter = new ClubAdapter(this, arsenal);
        ListView listView = (ListView) findViewById(R.id.club);
        listView.setAdapter(arsenalAdapter);
    }

    public void getPlayer(View listItem) {
        Player player = (Player) listItem.getTag();
        Log.d("Player name: ", player.getName());
    }
}

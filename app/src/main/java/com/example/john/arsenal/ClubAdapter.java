package com.example.john.arsenal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by John on 07/11/2017.
 */

public class ClubAdapter extends ArrayAdapter<Player> {
    public ClubAdapter(Context context, ArrayList<Player> players) {
        super(context, 0, players);
    }

    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_player, parent, false);
        }
        Player currentPlayer = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.name_text);
        name.setText(currentPlayer.getName());
        TextView squadNumber = (TextView) listItemView.findViewById(R.id.number_text);
        squadNumber.setText(currentPlayer.getSquadNumber());
        TextView weeklyWage = (TextView) listItemView.findViewById(R.id.wage_text);
        weeklyWage.setText(currentPlayer.getWeeklyWage());

        listItemView.setTag(currentPlayer);
        return listItemView;
    }
}

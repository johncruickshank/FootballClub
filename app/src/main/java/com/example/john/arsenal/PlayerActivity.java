//package com.example.john.arsenal;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.TextView;
//
//import org.w3c.dom.Text;
//
//public class PlayerActivity extends AppCompatActivity {
//    TextView nameText;
//    TextView numberText;
//    TextView salaryText;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_player);
//
//        Bundle extras = getIntent().getExtras();
//        String name = extras.getString("name");
//        String number = extras.getString("number");
//        String salary = extras.getString("salary");
//        nameText = (TextView) findViewById(R.id.name_text);
//        nameText.setText(name);
//        numberText = (TextView) findViewById(R.id.number_text);
//        numberText.setText(number);
//        salaryText = (TextView) findViewById(R.id.wage_text);
//        nameText.setText(name);
//    }
//}

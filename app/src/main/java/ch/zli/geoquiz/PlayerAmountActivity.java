package ch.zli.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerAmountActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_amount);

        Button p2 = findViewById(R.id.p2);
        p2.setOnClickListener(View -> two_players());
        Button p3 = findViewById(R.id.p3);
        p3.setOnClickListener(View -> three_players());
        Button p4 = findViewById(R.id.p4);
        p4.setOnClickListener(View -> four_players());
        Button start = findViewById(R.id.start);
        start.setOnClickListener(View -> start());
    }

    public void two_players(){

    }
    public void three_players(){

    }
    public void four_players(){

    }
    public void start(){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}

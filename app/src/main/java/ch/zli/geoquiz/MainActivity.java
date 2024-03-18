package ch.zli.geoquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button singleplayer = findViewById(R.id.singleplayer);
        singleplayer.setOnClickListener(view -> singleplayer());
        Button multiplayer = findViewById(R.id.multiplayer);
        multiplayer.setOnClickListener(view -> multiplayer());
        Button leaderboard = findViewById(R.id.leaderboard);
        leaderboard.setOnClickListener(view -> leaderboard());
    }

    public void singleplayer() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
    public void multiplayer() {
        Intent intent = new Intent(this, PlayerAmountActivity.class);
        startActivity(intent);
    }
    public void leaderboard() {
        Intent intent = new Intent(this, LeaderboardActivity.class);
        startActivity(intent);
    }
}
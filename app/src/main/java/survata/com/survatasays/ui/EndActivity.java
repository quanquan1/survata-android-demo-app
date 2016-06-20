package survata.com.survatasays.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import survata.com.survatasays.R;

public class EndActivity extends AppCompatActivity {

    private Button mPlayAgainButton;
    private TextView mQsAnsweredTextView;
    private int mQsAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Intent intent = getIntent();
        mQsAnswered = intent.getIntExtra("questionsAnswered", 0);

        mPlayAgainButton = (Button) findViewById(R.id.playAgainButton);
        mQsAnsweredTextView = (TextView) findViewById(R.id.qsAnsweredTextView);
        mQsAnsweredTextView.setText("You managed to answer " + mQsAnswered + " questions!");

        mPlayAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void playAgain(){
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }
}

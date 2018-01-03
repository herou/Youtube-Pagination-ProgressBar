package comqueues.example.user.transitionandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progresBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        progresBar = findViewById(R.id.progresBar);

        YoutubeProgressBar c2 = new YoutubeProgressBar(getApplicationContext(),progresBar);
        c2.showProgress();
        c2.startTransition(500,500);
        c2.hideProgress(10000);


    }
}

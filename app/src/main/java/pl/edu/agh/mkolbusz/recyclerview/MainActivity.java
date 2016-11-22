package pl.edu.agh.mkolbusz.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie movie = new Movie();
        System.out.println(movie.getTitle());
        System.out.println(movie.getYear());
        System.out.println(movie.actorsToReadableString());
    }
}

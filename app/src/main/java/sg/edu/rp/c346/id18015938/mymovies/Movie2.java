package sg.edu.rp.c346.id18015938.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Movie2 extends AppCompatActivity {

    TextView tvTitle;
    TextView tvInfo;
    ImageView ivRating;
    TextView tvDescription;
    TextView tvWatched;
    TextView tvTheatre;
    RatingBar ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie2);

        tvTitle = findViewById(R.id.textViewTitle);
        tvInfo = findViewById(R.id.textViewInfo);
        ivRating = findViewById(R.id.imageViewRating);
        tvDescription = findViewById(R.id.textViewDescription);
        tvWatched = findViewById(R.id.textViewWatched);
        tvTheatre = findViewById(R.id.textViewTheatre);
        ratingbar = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();
        String ScoreSelected = intentReceived.getStringExtra("Rating_Score");
        ratingbar.setRating(Float.parseFloat(ScoreSelected));
        String titleSelected = intentReceived.getStringExtra("Title");
        tvTitle.setText(titleSelected);
        String infoSelected = intentReceived.getStringExtra("Info");
        tvInfo.setText(infoSelected);
        String ratingSelected = intentReceived.getStringExtra("Rating");
        if ( ratingSelected.equals("g") ){
            ivRating.setImageResource(R.drawable.rating_g);
        }else if (ratingSelected.equals("pg")){
            ivRating.setImageResource(R.drawable.rating_pg);
        }else if (ratingSelected.equals("pg13")){
            ivRating.setImageResource(R.drawable.rating_pg13);
        }else if (ratingSelected.equals("nc16")){
            ivRating.setImageResource(R.drawable.rating_nc16);
        }else if (ratingSelected.equals("m18")){
            ivRating.setImageResource(R.drawable.rating_m18);
        }else{
            ivRating.setImageResource(R.drawable.rating_r21);
        }
        String descriptionSelected = intentReceived.getStringExtra("Description");
        tvDescription.setText(descriptionSelected);
        String watchedSelected = intentReceived.getStringExtra("Watched_Date");
        tvWatched.setText(watchedSelected);
        String theatreSelected = intentReceived.getStringExtra("Theatre");
        tvTheatre.setText(theatreSelected);

    }
}

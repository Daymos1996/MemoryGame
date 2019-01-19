package daymos.lodz.uni.math.pl.memorygame;

import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;

import static daymos.lodz.uni.math.pl.memorygame.GameActivity.IMAGE_LIST;
import static daymos.lodz.uni.math.pl.memorygame.GameActivity.URI_IMAGE_LIST;

public class PlayGameActivity extends AppCompatActivity {

    private ImageView img11;
    private ImageView img12;
    private ImageView img13;
    private ImageView img14;
    private ImageView img15;
    private ImageView img16;
    private ImageView img21;
    private ImageView img22;
    private ImageView img23;
    private ImageView img24;
    private ImageView img25;
    private ImageView img26;
    private TextView textView2;
    private ArrayList<Bitmap> imageList;
    private ArrayList<Uri> uriImageList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        init();

       // imageList = new ArrayList<Bitmap>();
        uriImageList = new ArrayList<Uri>();
        uriImageList = (ArrayList<Uri>) getIntent().getSerializableExtra(URI_IMAGE_LIST);


        img11.setImageURI(uriImageList.get(0));
        img12.setImageURI(uriImageList.get(1));
        img13.setImageURI(uriImageList.get(2));
        img14.setImageURI(uriImageList.get(3));
        img15.setImageURI(uriImageList.get(4));
        img16.setImageURI(uriImageList.get(5));


    }



    private void init() {
        setTitle("Memory Game");

        img11 = findViewById(R.id.img11);
        img12 = findViewById(R.id.img12);
        img13 = findViewById(R.id.img13);
        img11 = findViewById(R.id.img11);
        img12 = findViewById(R.id.img12);
        img13 = findViewById(R.id.img13);
        img14 = findViewById(R.id.img14);
        img15 = findViewById(R.id.img15);
        img16 = findViewById(R.id.img16);
        img21 = findViewById(R.id.img21);
        img22 = findViewById(R.id.img22);
        img23 = findViewById(R.id.img23);
        img24 = findViewById(R.id.img24);
        img25 = findViewById(R.id.img25);
        img26 = findViewById(R.id.img26);
        textView2= (TextView) findViewById(R.id.text2);



    }
}

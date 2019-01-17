package daymos.lodz.uni.math.pl.memorygame;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class GameActivity extends AppCompatActivity {


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
    private TextView textView1;
    private Button startGame;
    public static final int PICK_IMAGE_1= 1;
    public static final int PICK_IMAGE_2= 2;
    public static final int PICK_IMAGE_3= 3;
    public static final int PICK_IMAGE_4= 4;
    public static final int PICK_IMAGE_5= 5;
    public static final int PICK_IMAGE_6= 6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_1);
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_2);
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_3);
            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_4);
            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_5);
            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_6);
            }
        });

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeVisibility();


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == PICK_IMAGE_1) {
            Uri mImageProfileUri = data.getData();
            try {
                Bitmap image_1 = MediaStore.Images.Media.getBitmap(this.getContentResolver(), mImageProfileUri);
                img11.setImageBitmap(image_1);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (requestCode == PICK_IMAGE_2) {
            Uri mImageProfileUri = data.getData();
            try {
                Bitmap image_2 = MediaStore.Images.Media.getBitmap(this.getContentResolver(), mImageProfileUri);
                img12.setImageBitmap(image_2);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (requestCode == PICK_IMAGE_3) {
            Uri mImageProfileUri = data.getData();
            try {
                Bitmap image_3 = MediaStore.Images.Media.getBitmap(this.getContentResolver(), mImageProfileUri);
                img13.setImageBitmap(image_3);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (requestCode == PICK_IMAGE_4) {
            Uri mImageProfileUri = data.getData();
            try {
                Bitmap image_4 = MediaStore.Images.Media.getBitmap(this.getContentResolver(), mImageProfileUri);
                img14.setImageBitmap(image_4);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (requestCode == PICK_IMAGE_5) {
            Uri mImageProfileUri = data.getData();
            try {
                Bitmap image_5 = MediaStore.Images.Media.getBitmap(this.getContentResolver(), mImageProfileUri);
                img15.setImageBitmap(image_5);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (requestCode == PICK_IMAGE_6) {
            Uri mImageProfileUri = data.getData();
            try {
                Bitmap image_6 = MediaStore.Images.Media.getBitmap(this.getContentResolver(), mImageProfileUri);
                img16.setImageBitmap(image_6);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    private void changeVisibility(){
        textView1.setVisibility(View.INVISIBLE);
        startGame.setVisibility(View.INVISIBLE);

        img11.setVisibility(View.VISIBLE);
        img12.setVisibility(View.VISIBLE);
        img13.setVisibility(View.VISIBLE);
        img14.setVisibility(View.VISIBLE);
        img15.setVisibility(View.VISIBLE);
        img16.setVisibility(View.VISIBLE);
        img21.setVisibility(View.VISIBLE);
        img22.setVisibility(View.VISIBLE);
        img23.setVisibility(View.VISIBLE);
        img24.setVisibility(View.VISIBLE);
        img25.setVisibility(View.VISIBLE);
        img26.setVisibility(View.VISIBLE);


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
        textView1= (TextView) findViewById(R.id.text1);
        startGame = (Button) findViewById(R.id.startGame);


    }
}

package daymos.lodz.uni.math.pl.memorygame;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {


    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;
    private ImageView img21;
    private TextView textView1;
    private Button startGame;
    public static final int PICK_IMAGE_1= 1;
    public static final int PICK_IMAGE_2= 2;
    public static final int PICK_IMAGE_3= 3;
    public static final int PICK_IMAGE_4= 4;
    public static final int PICK_IMAGE_5= 5;
    public static final int PICK_IMAGE_6= 6;
    public static final String IMAGE_LIST="IMAGE_LIST";
    public static final String URI_IMAGE_LIST="URI_IMAGE_LIST";
    // private ArrayList<Bitmap> imageList;
    private ArrayList<Uri> uriImageList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();

        //imageList = new ArrayList<Bitmap>();
        uriImageList = new ArrayList<Uri>();
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_1);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_2);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_3);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_4);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_5);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_6);
            }
        });

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this, PlayGameActivity.class);
                intent.putExtra(URI_IMAGE_LIST, uriImageList);
                startActivity(intent);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == PICK_IMAGE_1) {
            Uri uriImage_1 = data.getData();
            img1.setImageURI(uriImage_1);
            uriImageList.add(uriImage_1);

        }
        if (requestCode == PICK_IMAGE_2) {
            Uri uriImage_2 = data.getData();
            img2.setImageURI(uriImage_2);
            uriImageList.add(uriImage_2);


        }
        if (requestCode == PICK_IMAGE_3) {
            Uri uriImage_3 = data.getData();
            img3.setImageURI(uriImage_3);
            uriImageList.add(uriImage_3);

        }
        if (requestCode == PICK_IMAGE_4) {
            Uri uriImage_4 = data.getData();
            img4.setImageURI(uriImage_4);
            uriImageList.add(uriImage_4);

        }
        if (requestCode == PICK_IMAGE_5) {
            Uri uriImage_5 = data.getData();
                img5.setImageURI(uriImage_5);
                uriImageList.add(uriImage_5);


        }
        if (requestCode == PICK_IMAGE_6) {
            Uri uriImage_6 = data.getData();
                img6.setImageURI(uriImage_6);
                uriImageList.add(uriImage_6);

        }
    }


    private void init() {
        setTitle("Memory Game");

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        textView1= (TextView) findViewById(R.id.text1);
        startGame = (Button) findViewById(R.id.startGame);


    }
}

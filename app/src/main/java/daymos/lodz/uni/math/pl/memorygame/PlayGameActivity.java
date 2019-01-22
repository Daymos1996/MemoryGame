package daymos.lodz.uni.math.pl.memorygame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    private ArrayList<Uri> uriImageList;

    //array for the images
    Integer[] cardsArray ={101, 102 , 103 , 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int firstCard, secendCard;
    int clickedFirst,clickedSecend;
    int cardNumber =1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        init();




        uriImageList = new ArrayList<Uri>();
        uriImageList = (ArrayList<Uri>) getIntent().getSerializableExtra(URI_IMAGE_LIST);


        img11.setTag("0");
        img12.setTag("1");
        img13.setTag("2");
        img14.setTag("3");
        img15.setTag("4");
        img16.setTag("5");
        img21.setTag("6");
        img22.setTag("7");
        img23.setTag("8");
        img24.setTag("9");
        img25.setTag("10");
        img26.setTag("11");

        //shuffle images
        Collections.shuffle(Arrays.asList(cardsArray));

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img11, theCard);
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img12, theCard);
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img13, theCard);
            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img14, theCard);
            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img15, theCard);
            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img16, theCard);
            }
        });

        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img21, theCard);
            }
        });

        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img22, theCard);
            }
        });

        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img23, theCard);
            }
        });

        img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img24, theCard);
            }
        });

        img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img25, theCard);
            }
        });

        img26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String ) view.getTag());
                checkStatus(img26, theCard);
            }
        });








    }

    private void checkStatus(ImageView img, int card) {

        //set the correct image to the imageview
        if(cardsArray[card]== 101){
            img.setImageURI(uriImageList.get(0));
        } else if(cardsArray[card]== 102){
            img.setImageURI(uriImageList.get(1));
        } else if(cardsArray[card]== 103){
            img.setImageURI(uriImageList.get(2));
        } else if(cardsArray[card]== 104){
            img.setImageURI(uriImageList.get(3));
        } else if(cardsArray[card]== 105){
            img.setImageURI(uriImageList.get(4));
        } else if(cardsArray[card]== 106){
            img.setImageURI(uriImageList.get(5));
        } else if(cardsArray[card]== 201){
            img.setImageURI(uriImageList.get(0));
        } else if(cardsArray[card]== 202){
            img.setImageURI(uriImageList.get(1));
        } else if(cardsArray[card]== 203){
            img.setImageURI(uriImageList.get(2));
        } else if(cardsArray[card]== 204){
            img.setImageURI(uriImageList.get(3));
        } else if(cardsArray[card]== 205){
            img.setImageURI(uriImageList.get(4));
        } else if(cardsArray[card]== 206){
            img.setImageURI(uriImageList.get(5));
        }


        //check which image its selected and save it
        if(cardNumber==1){
            firstCard=cardsArray[card];
            if(firstCard>200){
                firstCard=firstCard - 100;
            }
            cardNumber=2;
            clickedFirst = card;
            img.setEnabled(false);
        } else if (cardNumber==2){
            secendCard = cardsArray[card];
            if(secendCard>200){
                secendCard=secendCard - 100;
            }
            cardNumber=1;
            clickedSecend = card;

            img11.setEnabled(false);
            img12.setEnabled(false);
            img13.setEnabled(false);
            img14.setEnabled(false);
            img15.setEnabled(false);
            img16.setEnabled(false);
            img21.setEnabled(false);
            img22.setEnabled(false);
            img23.setEnabled(false);
            img24.setEnabled(false);
            img25.setEnabled(false);
            img26.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the images are the same
                    comparison();
                }
            }, 1000);


        }

    }

    private void comparison() {
        if(firstCard==secendCard){
            if(clickedFirst==0){
                img11.setVisibility(View.INVISIBLE);
            } else if(clickedFirst==1){
                img12.setVisibility(View.INVISIBLE);
            } else if(clickedFirst==2){
                img13.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==3){
                img14.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==4){
                img15.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==5){
                img16.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==6){
                img21.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==7){
                img22.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==8){
                img23.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==9){
                img24.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==10){
                img25.setVisibility(View.INVISIBLE);
            }else if(clickedFirst==11){
                img26.setVisibility(View.INVISIBLE);
            }

            if(clickedSecend==0){
                img11.setVisibility(View.INVISIBLE);
            } else if(clickedSecend==1){
                img12.setVisibility(View.INVISIBLE);
            } else if(clickedSecend==2){
                img13.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==3){
                img14.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==4){
                img15.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==5){
                img16.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==6){
                img21.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==7){
                img22.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==8){
                img23.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==9){
                img24.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==10){
                img25.setVisibility(View.INVISIBLE);
            }else if(clickedSecend==11){
                img26.setVisibility(View.INVISIBLE);
            }

        }
        else {
            img11.setImageResource(R.drawable.znak);
            img12.setImageResource(R.drawable.znak);
            img13.setImageResource(R.drawable.znak);
            img14.setImageResource(R.drawable.znak);
            img15.setImageResource(R.drawable.znak);
            img16.setImageResource(R.drawable.znak);
            img21.setImageResource(R.drawable.znak);
            img22.setImageResource(R.drawable.znak);
            img23.setImageResource(R.drawable.znak);
            img24.setImageResource(R.drawable.znak);
            img25.setImageResource(R.drawable.znak);
            img26.setImageResource(R.drawable.znak);

        }

        img11.setEnabled(true);
        img12.setEnabled(true);
        img13.setEnabled(true);
        img14.setEnabled(true);
        img15.setEnabled(true);
        img16.setEnabled(true);
        img21.setEnabled(true);
        img22.setEnabled(true);
        img23.setEnabled(true);
        img24.setEnabled(true);
        img25.setEnabled(true);
        img26.setEnabled(true);
        
        // check end ?
        checkEnd();
        
    }

    private void checkEnd() {
        if(img11.getVisibility()==View.INVISIBLE &&
                img12.getVisibility()==View.INVISIBLE &&
                img13.getVisibility()==View.INVISIBLE &&
                img14.getVisibility()==View.INVISIBLE &&
                img15.getVisibility()==View.INVISIBLE &&
                img16.getVisibility()==View.INVISIBLE &&
                img21.getVisibility()==View.INVISIBLE &&
                img22.getVisibility()==View.INVISIBLE &&
                img23.getVisibility()==View.INVISIBLE &&
                img24.getVisibility()==View.INVISIBLE &&
                img25.getVisibility()==View.INVISIBLE &&
                img26.getVisibility()==View.INVISIBLE
                ){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PlayGameActivity.this);
                alertDialogBuilder
                        .setMessage("Game over Congratulation !!!!! ")
                        .setCancelable(false)
                        .setPositiveButton("New", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(getApplicationContext(),PlayGameActivity.class);
                                intent.putExtra(URI_IMAGE_LIST, uriImageList);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
        }
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

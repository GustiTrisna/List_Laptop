package com.example.listlaptop;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {
    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getIncomingIntent();
    }
    private void getIncomingIntent(){
        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_description") && getIntent().hasExtra("image_harga")){
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDescription = getIntent().getStringExtra("image_description");
            String imageHarga = getIntent().getStringExtra("image_harga");

            setImage(imageUrl, imageName, imageDescription, imageHarga);
        }
    }

    private void setImage(String imageUrl, String imageName, String imageDescription, String imageHarga){
        TextView price = findViewById(R.id.harga);
        price.setText(imageHarga);
        TextView laptop = findViewById(R.id.laptop);
        laptop.setText(imageName);
        TextView name = findViewById(R.id.image_description);
        name.setText(imageDescription);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}

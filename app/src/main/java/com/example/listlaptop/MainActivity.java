package com.example.listlaptop;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();
    private ArrayList<String> mHarga = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageBitmaps();
    }

    private void initImageBitmaps(){
        mImageUrls.add("https://www.itgaleri.com/wp-content/uploads/2017/12/Asus-ROG-Strix-GL503VD.jpg");
        mNames.add("ASUS GL503VD");
        mHarga.add("Rp. 15.799.000,-");
        mDescription.add("Spesifikasi--> Intel Core i7 7700HQ, 8GB DDR4 @2400MHz, Intel HD Graphics 630, NVIDIA GeForce GTX 1050 4 GB GDDR5, 1 TB SSHD 5400 RPM SATA III 6 Gbps, 15,6 inch @1920 x 1080 pixels @60 Hz");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTv2592v7ovT8WLgHkcrHv3Mm268bpr4biDZTlesAroJStn0KFQag");
        mNames.add("ASUS GL503VM ");
        mHarga.add("Rp. 26.299.000,-");
        mDescription.add("Spesifikasi--> Intel Core i7 7700HQ, 32GB DDR4 @2400MHz, Intel HD Graphics 630, NVIDIA GeForce GTX 1060 6 GB GDDR5, 1 TB SSHD 5400 RPM SATA III 6 Gbps, 15,6 inch @1920 x 1080 pixels @120 Hz");

        mImageUrls.add("https://gadgetren.com/wp-content/uploads/2018/03/ASUS-ROG-GL503VS-Header.jpg");
        mNames.add("ASUS GL503VS");
        mHarga.add("Rp. 38.299.000,-");
        mDescription.add("Spesifikasi--> Intel Core i7 7700HQ, 8GB DDR4 @2400MHz, Intel HD Graphics 630, NVidia GeForce GTX1070 8G DDR5, 1TB SSHD+ 256GB PCIe 3×4 SSD, 15,6” Non-glare IPS Full HD (1920 x 1080) 144Hz IPS level panel");

        mImageUrls.add("https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ZenBook_13_UX331UN/ASUS_ZenBook_13_UX331UN_L_3.jpg");
        mNames.add("ASUS ZenBook 13 UX331UN");
        mHarga.add("Rp. 18.999.000,-");
        mDescription.add("Spesifikasi--> Intel Core i7-8550U, 16GB DDR4 @2400MHz, Intel HD Graphics 630, NVIDIA GeForce MX150 , with 2GB GDDR5 VRAM, 1 TB SSHD 5400 RPM SATA III 6 Gbps, 13.3 inch @1920 x 1080 pixels @60 Hz");

        mImageUrls.add("https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ZenBook_S_UX391UA/ASUS_ZenBook_S_UX391UA_L_2.jpg");
        mNames.add("ASUS ZenBook S UX391UA");
        mHarga.add("Rp. 19.999.000,-");
        mDescription.add("Spesifikasi--> Intel Core i7-8550U 4.0GHz (i7-8550U), 16GB DDR4 @2400MHz, Intel HD Graphics 630, NVIDIA GeForce GTX 1050 4 GB GDDR5, 1 TB SSHD 5400 RPM SATA III 6 Gbps, 13,3 inch @1920 x 1080 pixels @60 Hz");

        mImageUrls.add("https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_G703/ASUS_ROG_G703_L_2.jpg");
        mNames.add("ASUS ROG G703");
        mHarga.add("Rp. 62.988.000,-");
        mDescription.add("Spesifikasi--> Intel Core i7-7820HK, 64GB DDR4 @2800MHz, Intel HD Graphics 630, NVIDIA GeForce GTX 1080 with 8GB GDDR5X VRAM, 1 TB SSHD 7200 RPM SATA III 6 Gbps, 17,3 inch @1920 x 1080 pixels Anti-Glare 144Hz Panel with 72% NTSC with 178˚ wide-viewing angle display");

        mImageUrls.add("https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_Zephyrus_GX501/ASUS_ROG_Zephyrus_GX501_L_2.jpg");
        mNames.add("ASUS ROG Zephyrus GX501");
        mHarga.add("Rp. 31.599.000,-");
        mDescription.add("Spesifikasi--> Intel Core i7 i7-7700HQ, 24GB DDR4 @2400MHz, Intel HM175 Express Chipset, \tNVIDIA GeForce GTX 1080 with Max-Q Design, with 8GB GDDR5 VRAM, 1 TB SSHD 5400 RPM SATA III 6 Gbps, 15,6 inch @1920 x 1080 pixels LED backlit 120Hz Anti-Glare Panel with 72% NTSC with G-Sync");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDescription, mHarga);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                break;

            case R.id.action_grid:
                break;

            case R.id.action_cardview:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

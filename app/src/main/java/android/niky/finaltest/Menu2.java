package android.niky.finaltest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Menu2 extends AppCompatActivity {
    View navigationBar;
    ImageView Home,Add,Menu,MenuLine,Search;

    RelativeLayout JobBank,OffFinder,Register,Laws,ads,Estekhdami,MyAds,Share,Favorite,aboutUs,Setting,ContactUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        JobBank=(RelativeLayout)findViewById(R.id.btn_bank);
        OffFinder=(RelativeLayout)findViewById(R.id.btn_off);
        Register=(RelativeLayout)findViewById(R.id.btn_register);
        Laws=(RelativeLayout)findViewById(R.id.btn_law);
        ads=(RelativeLayout)findViewById(R.id.btn_ads);
        Estekhdami=(RelativeLayout)findViewById(R.id.btn_employment);
        MyAds=(RelativeLayout)findViewById(R.id.btn_my_ads);
        Share=(RelativeLayout)findViewById(R.id.btn_share);
        Favorite=(RelativeLayout)findViewById(R.id.btn_favorite);
        aboutUs=(RelativeLayout)findViewById(R.id.btn_about_us);
        Setting=(RelativeLayout)findViewById(R.id.btn_setting);
        ContactUs=(RelativeLayout)findViewById(R.id.btn_contact_us);

        JobBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,JobBankMenu.class);
                startActivity(i);
            }
        });

        OffFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Off_Finder.class);
                startActivity(i);
            }
        });


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Register.class);
                startActivity(i);
            }
        });


        Laws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Laws.class);
                startActivity(i);
            }
        });

        ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Ads.class);
                startActivity(i);
            }
        });


        Estekhdami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Estekhdami_menu.class);
                startActivity(i);
            }
        });

        MyAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Ads_show.class);
                startActivity(i);
            }
        });

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,AboutUs.class);
                startActivity(i);
            }
        });
        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Setting.class);
                startActivity(i);
            }
        });

        ContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,ContactUs.class);
                startActivity(i);
            }
        });


        map();
    }


    public void map()
    {
        LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        navigationBar=inflater.inflate(R.layout.bottom_navigation,null);
        Home=(ImageView)navigationBar.findViewById(R.id.home);
        Add=(ImageView)navigationBar.findViewById(R.id.add);
        Menu=(ImageView)navigationBar.findViewById(R.id.menu);
        MenuLine=(ImageView)navigationBar.findViewById(R.id.menuLine);
        Search=(ImageView)navigationBar.findViewById(R.id.search);

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Search.class);
                startActivity(i);

            }
        });

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Menu2.class);
                startActivity(i);

            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,SabtAgahi_other.class);
                startActivity(i);

            }
        });

        MenuLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Group.class);
                startActivity(i);

            }
        });


    }

}

package android.niky.finaltest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Switch;
import android.widget.TextView;


public class Setting extends AppCompatActivity {
    View navigationBar;
    ImageView Home,Add,Menu,MenuLine,Search;

    Button cam,gallery;
    EditText city;
    View CityLayout;
    TextView city_1,city_2,city_3,city_4,city_5,city_6,city_7,city_8,city_9
            ,city_10,city_11,city_12,city_13,city_14;
    PopupWindow City_Layout;
    Switch per,eng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        cam=(Button)findViewById(R.id.cam);
        gallery=(Button)findViewById(R.id.gallery);

        city=(EditText)findViewById(R.id.T);

        eng=(Switch)findViewById(R.id.eng);
        per=(Switch)findViewById(R.id.per);

        LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        CityLayout=inflater.inflate(R.layout.city_layout,null);

        City_map();
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
                Intent i=new Intent(Setting.this,Search.class);
                startActivity(i);

            }
        });

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Setting.this,Menu2.class);
                startActivity(i);

            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Setting.this,SabtAgahi_other.class);
                startActivity(i);

            }
        });

        MenuLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Setting.this,Group.class);
                startActivity(i);

            }
        });


    }

    public PopupWindow popupDisplay(View view)
    {
        final PopupWindow popupWindow=new PopupWindow(this);
        LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        popupWindow.setFocusable(true);
        popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setContentView(view);
        return popupWindow;
    }

    public void City_map()
    {

        city_1=(TextView)CityLayout.findViewById(R.id.Tt1);
        city_2=(TextView)CityLayout.findViewById(R.id.Tt2);
        city_3=(TextView)CityLayout.findViewById(R.id.Tt3);
        city_4=(TextView)CityLayout.findViewById(R.id.Tt4);
        city_5=(TextView)CityLayout.findViewById(R.id.Tt5);
        city_6=(TextView)CityLayout.findViewById(R.id.Tt6);
        city_7=(TextView)CityLayout.findViewById(R.id.Tt7);
        city_8=(TextView)CityLayout.findViewById(R.id.Tt8);
        city_9=(TextView)CityLayout.findViewById(R.id.Tt9);
        city_10=(TextView)CityLayout.findViewById(R.id.Tt10);
        city_11=(TextView)CityLayout.findViewById(R.id.Tt11);
        city_12=(TextView)CityLayout.findViewById(R.id.Tt12);
        city_13=(TextView)CityLayout.findViewById(R.id.Tt13);
        city_14=(TextView)CityLayout.findViewById(R.id.Tt14);

        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                City_Layout=popupDisplay(CityLayout);
                City_Layout.showAsDropDown(view);


            }
        });


        city_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_1.getText().toString());
                City_Layout .dismiss();
            }
        });


        city_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_2.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_3.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_1.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_4.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_1.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_5.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_6.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_1.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_7.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_8.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_9.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_10.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_11.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_12.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_13.getText().toString());
                City_Layout .dismiss();
            }
        });

        city_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city.setText(city_14.getText().toString());
                City_Layout .dismiss();
            }
        });

    }
}



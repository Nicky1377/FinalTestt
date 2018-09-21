package android.niky.finaltest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class Filter_Khodro extends AppCompatActivity {
    EditText Group,brand,Gheimat,year,Type,K_meter,city;
    View CityLayout,TypeLayout,GheimatLayout,BrandLayout;
    TextView Type_1,Type_2,Type_3,Gh_1,Gh_2,Gh_3,Gh_4
            ,Br_1,Br_2,Br_3,Br_4,Br_5,Br_6,Br_7,Br_8,Br_9,Br_10,Br_11,Br_12,Br_13,Br_14
            ,Br_15,Br_16,Br_17,Br_18,Br_19,Br_20,Br_21,Br_22,Br_23,Br_24,Br_25,Br_26,Br_27,Br_28,Br_29
            ,Br_30,Br_31,Br_32,Br_33,Br_34,Br_35,Br_36,Br_37,Br_38,Br_39,Br_40,Br_41,Br_42,Br_43,Br_44,Br_45,
            Br_46,Br_47,Br_48,Br_49,Br_50,Br_51,Br_52,Br_53,Br_54,Br_55,Br_56,Br_57,Br_58,Br_59
            ,city_1,city_2,city_3,city_4,city_5,city_6,city_7,city_8,city_9
            ,city_10,city_11,city_12,city_13,city_14;
    Button send,newest,expensive,cheap;
    PopupWindow Type_Layout,Gheimat_Layout,City_Layout,Brand_Layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter__khodro);

        Group=(EditText)findViewById(R.id.T1);
        brand=(EditText)findViewById(R.id.T2);
        Gheimat=(EditText)findViewById(R.id.T3);
        year=(EditText)findViewById(R.id.T4);
        Type=(EditText)findViewById(R.id.T5);
        K_meter=(EditText)findViewById(R.id.T6);
        city=(EditText)findViewById(R.id.T7);

        send=(Button)findViewById(R.id.send);
        expensive=(Button)findViewById(R.id.c1);
        newest=(Button)findViewById(R.id.c2);
        cheap=(Button)findViewById(R.id.c3);

        LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        TypeLayout=inflater.inflate(R.layout.type_agahi_layout,null);
        GheimatLayout=inflater.inflate(R.layout.gheimat_layout,null);
        BrandLayout=inflater.inflate(R.layout.brand_layout,null);
        CityLayout=inflater.inflate(R.layout.city_layout,null);

        Type_map();
        City_map();
       Gheimat_map();
        Brand_map();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tt("اعمال شد.");
            }
        });

        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();

    }

public void tt(String s)
{
    Toast.makeText(getBaseContext(),s,Toast.LENGTH_SHORT).show();
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

    public void Type_map()
    {
        Type_1=(TextView)TypeLayout.findViewById(R.id.Tt1);
        Type_2=(TextView)TypeLayout.findViewById(R.id.Tt2);
        Type_3=(TextView)TypeLayout.findViewById(R.id.Tt3);

        Type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Type_Layout=popupDisplay(TypeLayout);
                Type_Layout.showAsDropDown(view);


            }
        });

        Type_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type.setText(Type_1.getText().toString());
                Type_Layout.dismiss();
            }
        });

        Type_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type.setText(Type_2.getText().toString());
                Type_Layout.dismiss();
            }
        });

        Type_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type.setText(Type_3.getText().toString());
                Type_Layout.dismiss();
            }
        });

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

    public  void Gheimat_map()
    {
        Gh_1=(TextView)GheimatLayout.findViewById(R.id.Tt1);
        Gh_2=(TextView)GheimatLayout.findViewById(R.id.Tt2);
        Gh_3=(TextView)GheimatLayout.findViewById(R.id.Tt3);
        Gh_4=(TextView)GheimatLayout.findViewById(R.id.Tt4);

        Gheimat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Gheimat_Layout=popupDisplay(GheimatLayout);
                Gheimat_Layout.showAsDropDown(view);


            }
        });

        Gh_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_1.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_2.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_3.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_4.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

    }

    public void Brand_map()
    {
        Br_1=(TextView)BrandLayout.findViewById(R.id.Tt1);
        Br_2=(TextView)BrandLayout.findViewById(R.id.Tt2);
        Br_3=(TextView)BrandLayout.findViewById(R.id.Tt3);
        Br_4=(TextView)BrandLayout.findViewById(R.id.Tt4);
        Br_5=(TextView)BrandLayout.findViewById(R.id.Tt5);
        Br_6=(TextView)BrandLayout.findViewById(R.id.Tt6);
        Br_7=(TextView)BrandLayout.findViewById(R.id.Tt7);
        Br_8=(TextView)BrandLayout.findViewById(R.id.Tt8);
        Br_9=(TextView)BrandLayout.findViewById(R.id.Tt9);
        Br_10=(TextView)BrandLayout.findViewById(R.id.Tt10);
        Br_11=(TextView)BrandLayout.findViewById(R.id.Tt11);
        Br_12=(TextView)BrandLayout.findViewById(R.id.Tt12);
        Br_13=(TextView)BrandLayout.findViewById(R.id.Tt13);
        Br_14=(TextView)BrandLayout.findViewById(R.id.Tt14);
        Br_15=(TextView)BrandLayout.findViewById(R.id.Tt15);
        Br_16=(TextView)BrandLayout.findViewById(R.id.Tt16);
        Br_17=(TextView)BrandLayout.findViewById(R.id.Tt17);
        Br_18=(TextView)BrandLayout.findViewById(R.id.Tt18);
        Br_19=(TextView)BrandLayout.findViewById(R.id.Tt19);
        Br_20=(TextView)BrandLayout.findViewById(R.id.Tt20);
        Br_21=(TextView)BrandLayout.findViewById(R.id.Tt21);
        Br_22=(TextView)BrandLayout.findViewById(R.id.Tt22);
        Br_23=(TextView)BrandLayout.findViewById(R.id.Tt23);
        Br_24=(TextView)BrandLayout.findViewById(R.id.Tt24);
        Br_25=(TextView)BrandLayout.findViewById(R.id.Tt25);
        Br_26=(TextView)BrandLayout.findViewById(R.id.Tt26);
        Br_27=(TextView)BrandLayout.findViewById(R.id.Tt27);
        Br_28=(TextView)BrandLayout.findViewById(R.id.Tt28);
        Br_29=(TextView)BrandLayout.findViewById(R.id.Tt29);
        Br_30=(TextView)BrandLayout.findViewById(R.id.Tt30);
        Br_31=(TextView)BrandLayout.findViewById(R.id.Tt31);
        Br_32=(TextView)BrandLayout.findViewById(R.id.Tt32);
        Br_33=(TextView)BrandLayout.findViewById(R.id.Tt33);
        Br_34=(TextView)BrandLayout.findViewById(R.id.Tt34);
        Br_35=(TextView)BrandLayout.findViewById(R.id.Tt35);
        Br_36=(TextView)BrandLayout.findViewById(R.id.Tt36);
        Br_37=(TextView)BrandLayout.findViewById(R.id.Tt37);
        Br_38=(TextView)BrandLayout.findViewById(R.id.Tt38);
        Br_39=(TextView)BrandLayout.findViewById(R.id.Tt39);
        Br_40=(TextView)BrandLayout.findViewById(R.id.Tt40);
        Br_41=(TextView)BrandLayout.findViewById(R.id.Tt41);
        Br_42=(TextView)BrandLayout.findViewById(R.id.Tt42);
        Br_43=(TextView)BrandLayout.findViewById(R.id.Tt43);
        Br_44=(TextView)BrandLayout.findViewById(R.id.Tt44);
        Br_45=(TextView)BrandLayout.findViewById(R.id.Tt45);
        Br_46=(TextView)BrandLayout.findViewById(R.id.Tt46);
        Br_47=(TextView)BrandLayout.findViewById(R.id.Tt47);
        Br_48=(TextView)BrandLayout.findViewById(R.id.Tt48);
        Br_49=(TextView)BrandLayout.findViewById(R.id.Tt49);
        Br_50=(TextView)BrandLayout.findViewById(R.id.Tt50);
        Br_51=(TextView)BrandLayout.findViewById(R.id.Tt51);
        Br_52=(TextView)BrandLayout.findViewById(R.id.Tt52);
        Br_53=(TextView)BrandLayout.findViewById(R.id.Tt53);
        Br_54=(TextView)BrandLayout.findViewById(R.id.Tt54);
        Br_55=(TextView)BrandLayout.findViewById(R.id.Tt55);
        Br_56=(TextView)BrandLayout.findViewById(R.id.Tt56);
        Br_57=(TextView)BrandLayout.findViewById(R.id.Tt57);
        Br_58=(TextView)BrandLayout.findViewById(R.id.Tt58);
        Br_59=(TextView)BrandLayout.findViewById(R.id.Tt59);



        brand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Brand_Layout=popupDisplay(BrandLayout);
                Brand_Layout.showAsDropDown(view);


            }
        });
        Br_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_1.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_2.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_3.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_4.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_5.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_6.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_7.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_8.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_9.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_10.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_11.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_12.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_13.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_14.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_15.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_16.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_17.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_18.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_19.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_20.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_21.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_22.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_23.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_24.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_25.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_26.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_27.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_28.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_29.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_30.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_31.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_32.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_33.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_34.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_35.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_35.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_36.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_37.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_38.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_39.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_40.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_41.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_42.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_43.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_44.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_45.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_46.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_47.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_48.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_49.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_50.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_51.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_52.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_53.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_54.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_55.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_56.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_57.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_59.getText().toString());
                Brand_Layout.dismiss();
            }
        });


    }

}

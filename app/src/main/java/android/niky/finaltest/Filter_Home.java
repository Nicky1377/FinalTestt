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

public class Filter_Home extends AppCompatActivity {
    EditText Group,rooms,meter,Type,Gheimat,hoome,rahn,ejareh;
    View HoomeLayout,TypeLayout,GheimatLayout,GheimatMoredNazarLayout;
    TextView Type_1,Type_2,Type_3,Gh_1,Gh_2,Gh_3,Gh_4,yes,no;
    CheckBox rahn_To_ejareh;
    Button send,newest,expensive,cheap;
    PopupWindow Type_Layout,Hoome_Layout,Gheimat_Layout,Gheimat_Mored_Nazar_Layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter__home);


        Group=(EditText)findViewById(R.id.T1);
        rooms=(EditText)findViewById(R.id.T2);
        meter=(EditText)findViewById(R.id.T3);
        Type=(EditText)findViewById(R.id.T4);
        Gheimat=(EditText)findViewById(R.id.T5);
        hoome=(EditText)findViewById(R.id.T6);

        send=(Button)findViewById(R.id.send);
        expensive=(Button)findViewById(R.id.c1);
        newest=(Button)findViewById(R.id.c2);
        cheap=(Button)findViewById(R.id.c3);


        LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        TypeLayout=inflater.inflate(R.layout.type_agahi_layout,null);
        GheimatLayout=inflater.inflate(R.layout.gheimat_layout,null);
        HoomeLayout=inflater.inflate(R.layout.there_layout,null);
        GheimatMoredNazarLayout=inflater.inflate(R.layout.ghimat_mored_nazar_layout,null);

        Gheimat_map();
        Rahn_To_Ejareh_map();
        Type_map();
        Hoome_map();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tt("اعمال شد.");
            }
        });

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
                Gheimat_Mored_Nazar_Layout =popupDisplay(GheimatMoredNazarLayout);
                Gheimat_Mored_Nazar_Layout.showAsDropDown(Gheimat);

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

    public void Rahn_To_Ejareh_map()
    {

        rahn=(EditText)GheimatMoredNazarLayout.findViewById(R.id.call1);
        ejareh=(EditText)GheimatMoredNazarLayout.findViewById(R.id.Call2);
        rahn_To_ejareh=(CheckBox)GheimatMoredNazarLayout.findViewById(R.id.RTE);

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

    public void Hoome_map()
    {
        yes=(TextView)HoomeLayout.findViewById(R.id.Tt1);
        no=(TextView)HoomeLayout.findViewById(R.id.Tt2);

        hoome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Hoome_Layout=popupDisplay(HoomeLayout);
                Hoome_Layout.showAsDropDown(view);


            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hoome.setText(yes.getText().toString());
                Hoome_Layout.dismiss();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hoome.setText(no.getText().toString());
                Hoome_Layout.dismiss();
            }
        });

    }

}

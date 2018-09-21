package android.niky.finaltest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity {
    View navigationBar;
    ImageView Home,Add,Menu,MenuLine,Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        map();
        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();
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
                Intent i=new Intent(ContactUs.this,Search.class);
                startActivity(i);

            }
        });

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ContactUs.this,Menu2.class);
                startActivity(i);

            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ContactUs.this,SabtAgahi_other.class);
                startActivity(i);

            }
        });

        MenuLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ContactUs.this,Group.class);
                startActivity(i);

            }
        });


    }
}


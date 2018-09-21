package android.niky.finaltest;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;



public class Contact extends AppCompatActivity {
    View navigationBar;
    ImageView Home,Add,Menu,MenuLine,Search;
    private RelativeLayout Call_us,Message_us,Email_us;
    private TextView call_tv,sms_tv,mail_tv;

    //should fill with network data
    String ph_number="";
    String formattedNumber = PhoneNumberUtils.formatNumber(ph_number,
            Locale.getDefault().getCountry());
    String email_address="";
    ////
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_contact);

        call_tv=(TextView)findViewById(R.id.call_txt);
        call_tv.setText("تماس با"+ph_number);

        sms_tv=(TextView)findViewById(R.id.sms_txt);
        sms_tv.setText("ارسال پیامک به"+ph_number);

        mail_tv=(TextView)findViewById(R.id.mail_txt);
        mail_tv.setText("ایمیل به"+email_address);




        Call_us=(RelativeLayout)findViewById(R.id.call);
        Call_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + formattedNumber));

                final int ID_THIS_ACTIVITY=10;
                if(Build.VERSION.SDK_INT>=android.os.Build.VERSION_CODES.M){
                    if(checkSelfPermission(Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_DENIED) {
                        String[] permission = {Manifest.permission.CALL_PHONE};
                        requestPermissions(permission, ID_THIS_ACTIVITY);
                    }
                    else{
                        startActivity(i);
                    }
                }
            }
        });
        Message_us=(RelativeLayout)findViewById(R.id.Message);
        Message_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int Id_this_activity=20;
                try {
                    if(checkSelfPermission(Manifest.permission.SEND_SMS)==PackageManager.PERMISSION_DENIED){
                        String[] permission = {Manifest.permission.SEND_SMS};
                        requestPermissions(permission, Id_this_activity);
                    }
                    else{


                        String smsNumber = String.format("smsto: %s",
                                ph_number);
                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);

                        smsIntent.setData(Uri.parse(smsNumber));

                        if (smsIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(smsIntent);
                        } else {
                            Log.e("tag","Can't resolve app for ACTION_SENDTO Intent");
                        }


                    }
                }catch(Exception e){
                    Toast.makeText(getBaseContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        Email_us=(RelativeLayout)findViewById(R.id.Email);
        Email_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subject = "";
                String message = "";
                String to ="";

                Intent emailActivity = new Intent(Intent.ACTION_SEND);

                emailActivity.putExtra(Intent.EXTRA_EMAIL, new String[]{to});

                emailActivity.putExtra(Intent.EXTRA_SUBJECT, subject);

                emailActivity.putExtra(Intent.EXTRA_TEXT, message);

                emailActivity.setType("message/rfc822");

                startActivity(Intent.createChooser
                        (emailActivity, "Select your Email Provider :"));
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
                Intent i=new Intent(Contact.this,Search.class);
                startActivity(i);

            }
        });

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Contact.this,Menu2.class);
                startActivity(i);

            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Contact.this,SabtAgahi_other.class);
                startActivity(i);

            }
        });

        MenuLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Contact.this,Group.class);
                startActivity(i);

            }
        });


    }






//        call_Information=(Button)findViewById(R.id.call_inf);
//                call_Information.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        Intent intent=new Intent(AgahiShow.this,contact.class);
//        startActivity(intent);
//
//
//
//        }
//        });
//}
}
//        }


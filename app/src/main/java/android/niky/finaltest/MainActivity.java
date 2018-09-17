package android.niky.finaltest;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img;

            img = (ImageView) findViewById(R.id.spl_scr_img);
            if (!isNetworkAvailable(getBaseContext())) {
                tt("دستگاه به اینترنت متصل نیست");
//            img.setBackground(R.drawable.splash_dis);
            } else {
                tran(MainActivity.class);
            }
        }

        void tran(final Class c) {
      Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent i = new Intent(MainActivity.this,Menu.class);
            startActivity(i);
            MainActivity.this.finish();
            }
        }, 3000);

        }

        public boolean isNetworkAvailable(final Context context) {
            final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
            return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
        }

        void tt(String msg) {
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        }
    }

package android.niky.finaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Amlak_HomeSell extends AppCompatActivity {
Button aparteman,home,zamin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amlak__home_sell);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        aparteman=(Button)findViewById(R.id.btn1);
        home=(Button)findViewById(R.id.btn2);
        zamin=(Button)findViewById(R.id.btn3);


    }
}

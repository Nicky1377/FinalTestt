package android.niky.finaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Electric_Tablet extends AppCompatActivity {
Button mobile,tablet,LavazemJanebi,simcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric__tablet);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        mobile=(Button)findViewById(R.id.btn1);
        tablet=(Button)findViewById(R.id.btn2);
        LavazemJanebi=(Button)findViewById(R.id.btn3);
        simcard=(Button)findViewById(R.id.btn4);

    }
}

package android.niky.finaltest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class JobBankMenu extends AppCompatActivity {
    Button medical,meeting,car,arayesh,uni,art,sport,teach,majles,computer,jewels,
            dress,office,damdari,khadamat,copy,other,industry,food,design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_bank_menu);

        medical=(Button)findViewById(R.id.medicine);
        meeting=(Button)findViewById(R.id.meeting);
        car=(Button)findViewById(R.id.car);
        arayesh=(Button)findViewById(R.id.arayesh);
        uni=(Button)findViewById(R.id.uni);
        art=(Button)findViewById(R.id.music);
        sport=(Button)findViewById(R.id.sport);
        teach=(Button)findViewById(R.id.teach);
        majles=(Button)findViewById(R.id.majles);
        computer=(Button)findViewById(R.id.computer);
        jewels=(Button)findViewById(R.id.jewels);
        dress=(Button)findViewById(R.id.dress);
        office=(Button)findViewById(R.id.office);
        damdari=(Button)findViewById(R.id.damdari);
        khadamat=(Button)findViewById(R.id.khadamat);
        other=(Button)findViewById(R.id.other);
        industry=(Button)findViewById(R.id.industry);
        food=(Button)findViewById(R.id.food);
        design=(Button)findViewById(R.id.design);

        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();

    }
}

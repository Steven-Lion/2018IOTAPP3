package porker.steven.com.a2018iotapp3;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class mian_include_title extends AppCompatActivity {

    Button b_curtain;
    Button b_lighting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        b_curtain = (Button) findViewById(R.id.btnCurtain);
        b_lighting= (Button) findViewById(R.id.btnLight);
        //intent to curtainAcitiviy
        b_curtain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent1 = new Intent(mian_include_title.this,curtain_Activity2.class);
                startActivity(intent1);
            }
        });
    }
}

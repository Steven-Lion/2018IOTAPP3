package porker.steven.com.a2018iotapp3;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class curtainAcitivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView ivOncurtain=(ImageView)findViewById(R.id.ivOncurtain2);
        final ImageView ivOffcurtain=(ImageView)findViewById(R.id.ivOffcurtain2);
        final CheckBox cbCheck = (CheckBox)findViewById(R.id.cbCurtain2);

        final AnimationDrawable animationCurtain = (AnimationDrawable)ivOncurtain.getBackground();
        final AnimationDrawable animatioffCurtain = (AnimationDrawable)ivOffcurtain.getBackground();
        cbCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    ivOncurtain.setVisibility(View.VISIBLE);
                    ivOffcurtain.setVisibility(View.GONE);
                    animationCurtain.start();
                }
                else{
                    ivOncurtain.setVisibility(View.GONE);
                    ivOffcurtain.setVisibility(View.VISIBLE);
                    animatioffCurtain.start();
                }
            }
        });
    }
}

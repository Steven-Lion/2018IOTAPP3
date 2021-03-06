package porker.steven.com.a2018iotapp3;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class curtainAcitivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curtain_acitivity);

         final ImageView ivOncurtain=(ImageView)findViewById(R.id.ivOnCurtain);
         final ImageView ivOffcurtain=(ImageView)findViewById(R.id.ivOffCurtain);
         CheckBox cbCheck = (CheckBox)findViewById(R.id.cbCurtain);

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

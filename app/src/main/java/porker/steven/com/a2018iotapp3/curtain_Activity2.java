package porker.steven.com.a2018iotapp3;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class curtain_Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curtain_2);

        final ImageView ivCurtain=(ImageView)findViewById(R.id.ivOnCurtain3);
        CheckBox cbCheck = (CheckBox)findViewById(R.id.cbCurtain3);


        cbCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    ivCurtain.setImageResource(R.drawable.curtain_on_anim);
                    AnimationDrawable animationOnCurtain = (AnimationDrawable)ivCurtain.getDrawable();
                    animationOnCurtain.start();
                }
                else{
                    ivCurtain.setImageResource(R.drawable.curtain_off_anim);
                    AnimationDrawable animationOffCurtain = (AnimationDrawable)ivCurtain.getDrawable();
                    animationOffCurtain.start();
                }
            }
        });
    }
}

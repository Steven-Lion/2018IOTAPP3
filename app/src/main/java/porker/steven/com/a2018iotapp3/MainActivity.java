package porker.steven.com.a2018iotapp3;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ip_edit ;
    private EditText program_edit;
    private EditText user_edit;
    private EditText pass_edit;
    private Button B_comfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ip_edit = (EditText) findViewById(R.id.ip);
        program_edit = (EditText) findViewById(R.id.program_sign);
        user_edit = (EditText) findViewById(R.id.user_name);
        pass_edit = (EditText) findViewById(R.id.user_password);
        B_comfirm = (Button) findViewById(R.id.ok);

    }
    public void MyClick(View v){
        if (v.getId()==R.id.ok) {
            Intent intent = new Intent(MainActivity.this, mian_include_title.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "failed click", Toast.LENGTH_SHORT).show();
        }

    }
}

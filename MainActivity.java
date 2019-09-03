import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.info_text3).setOnClickListener(new View.OnClickListener() {     /** insert the id of your Button or Text View**/
            @Override
            public void onClick(View v) {
                phonenummber("123456789");
            }
        });


    }

    private void phonenummber(final String phoneNumber) {         /**Insert your OnClick ID**/
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));   /**newIntent**/
    }



}

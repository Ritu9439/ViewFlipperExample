package eazy.viewflipperexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper= (ViewFlipper) findViewById(R.id.fp);
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(1000);
        viewFlipper.startFlipping();

    }
}

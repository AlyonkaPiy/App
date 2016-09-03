package app.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class CardViewActivity extends Activity {

    TextView productName;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_behavior);
        productName = (TextView)findViewById(R.id.product_name);
        image = (ImageView)findViewById(R.id.image);

        productName.setText("Carrot");

    }
}

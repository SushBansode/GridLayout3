package tatastrive.application.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ratingBar=findViewById( R.id.ratingBar);
        button=findViewById( R.id.button );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r= (int) ratingBar.getRating();
                Toast.makeText( MainActivity.this, "Rating:"+r, Toast.LENGTH_SHORT ).show();
                //  Toast.makeText( MainActivity.this, "Stars="+(int)ratingBar.getRating(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}

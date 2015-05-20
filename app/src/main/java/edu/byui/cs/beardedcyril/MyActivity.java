package edu.byui.cs.beardedcyril;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends Activity {

    Beard beard = new Beard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        beard.setLength(10.0);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void handleHugeButtonClick(View view) {
        System.out.println("The button was clicked.");

        TextView textView = (TextView)findViewById(R.id.txtHello);
        textView.setAllCaps(true);


        for (int i = 0; i < 3; i++) {
            beard.setLength(beard.getLength() + i);
            Toast toast = Toast.makeText(this, "Bearded Cyril is activated. " + beard.getLength(), Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}

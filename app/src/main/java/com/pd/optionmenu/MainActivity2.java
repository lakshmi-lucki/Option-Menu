package com.pd.optionmenu;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.zip.Inflater;

@RequiresApi(api = Build.VERSION_CODES.M)
public class MainActivity2 extends AppCompatActivity {
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        layout = (LinearLayout) findViewById( R.id.layout );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate( R.menu.optionmenu, menu );
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.id_home:
                Toast.makeText( MainActivity2.this, "Color change1 successful", Toast.LENGTH_SHORT ).show();
                layout.setBackgroundColor( Color.GRAY );
                break;
            case R.id.id_Profile:
                Toast.makeText( MainActivity2.this, "Color change2 successful", Toast.LENGTH_SHORT ).show();
                layout.setBackgroundColor( Color.BLUE );
                break;

            case R.id.id_set:
                Toast.makeText( MainActivity2.this, "Color change3 successful", Toast.LENGTH_SHORT ).show();
                layout.setBackgroundColor( Color.WHITE );
                break;
            case R.id.id_signout:
                Toast.makeText( MainActivity2.this, "Color change4 successful", Toast.LENGTH_SHORT ).show();
                layout.setBackgroundColor( Color.YELLOW );
                break;

            default:
                return super.onOptionsItemSelected( item );
        }

        return super.onOptionsItemSelected( item );
    }

}

package com.pd.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //  one = (LinearLayout)findViewById( R.id.one );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater = getMenuInflater();
        Inflater.inflate( R.menu.optionmenu, menu );
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.id_home:

                Toast.makeText( this, "Optionmenu Home is selected", Toast.LENGTH_SHORT ).show();

                return true;

            case R.id.id_Profile:

                Toast.makeText( this, "Optionmenu Profile is selected", Toast.LENGTH_SHORT ).show();
                return true;

            case R.id.id_set:

                Toast.makeText( this, "Optionmenu Settings is selected", Toast.LENGTH_SHORT ).show();
                return true;
            case R.id.id_signout:

                Toast.makeText( this, "Optionmenu signout" + " is selected", Toast.LENGTH_SHORT ).show();

                return true;

            default:
                return super.onOptionsItemSelected( item );
        }

    }


}
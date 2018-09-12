package com.songshakes.internship.skilllist.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.songshakes.internship.skilllist.R
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

class MainActivity : AppCompatActivity() {

    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item?.getItemId()==R.id.action_add){
            val intent = Intent(context, SecondActivity::class.java)
            startActivity(intent)
            return true
        }
        //return true
        return super.onOptionsItemSelected(item)
    }
}

//    fun void adds(){
//        val intent = Intent(context, SecondActivity::class.java)
//        startActivity(intent)
//    }


//
//@Override
//public boolean onOptionsItemSelected(MenuItem item) {
//
//    if(item.getItemId()==R.id.menu_option_two){
//        Settings();
//        Log.d("Option","2");
//
//    }
//    return super.onOptionsItemSelected(item);
//}
//
//private void Settings() {
//    Intent intent = new Intent(this, SettingsActivity.class);
//    startActivity(intent) ;
//}


//@Override
//public boolean onCreateOptionsMenu(Menu menu) {
//    getMenuInflater().inflate(R.menu.menu_main,menu);
//    return true;
//}
//@Override
//public boolean onOptionsItemSelected(MenuItem item) {
//    if(item.getItemId() == R.id.action_settings){
//        Toast.makeText(MainActivity.this,
//                "Test menu",
//                Toast.LENGTH_SHORT)
//                .show();
//    }
//    return super.onOptionsItemSelected(item);
//}
//
//
//

//
//
//getSupportActionBar()!!.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
//getSupportActionBar()!!.setDisplayShowCustomEnabled(true)
//getSupportActionBar()!!.setCustomView(R.layout.activity_main)
//
//var view = getSupportActionBar()?.getCustomView()
//
//var imageButton = view?.findViewById(R.id.action_bar_back) as ImageButton
//
//
//var imageButton2 = view?.findViewById(R.id.action_bar_forward) as ImageButton
//
//
//imageButton!!.setOnClickListener {
//    Toast.makeText(getApplicationContext(), "Forward Button is clicked", Toast.LENGTH_LONG).show();
//}
//imageButton2!!.setOnClickListener {
//    Toast.makeText(getApplicationContext(), "Forward Button is clicked", Toast.LENGTH_LONG).show();
//}


//package com.journaldev.customactionbar;
//
//import android.support.v7.app.ActionBar;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.ImageButton;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setDisplayShowCustomEnabled(true);
//        getSupportActionBar().setCustomView(R.layout.custom_action_bar_layout);
//
//        View view =getSupportActionBar().getCustomView();
//
//        ImageButton imageButton= (ImageButton)view.findViewById(R.id.action_bar_back);
//
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
//
//        ImageButton imageButton2= (ImageButton)view.findViewById(R.id.action_bar_forward);
//
//        imageButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Forward Button is clicked",Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//



package com.rcgonzalezf.kotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.activity_main.changeTextWithKotlin
import rcgonzalezf.com.kotlinhelloworld.R

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(rcgonzalezf.com.kotlinhelloworld.R.layout.activity_main)
        changeTextWithKotlin.setText("Hello Kotlin!")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(rcgonzalezf.com.kotlinhelloworld.R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == rcgonzalezf.com.kotlinhelloworld.R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}

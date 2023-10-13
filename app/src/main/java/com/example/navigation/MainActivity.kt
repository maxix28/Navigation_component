package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var  binding: ActivityMainBinding
  private  lateinit var  toogle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            navView.bringToFront()
           setSupportActionBar(toolbar3)
            toogle = ActionBarDrawerToggle(this@MainActivity, drawerLayout,R.string.nav_open,R.string.nav_close)
            drawerLayout.addDrawerListener(toogle)

            navView.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.home-> {
                      //  Toast.makeText(this@MainActivity,"Home",Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity,"Home",Toast.LENGTH_SHORT).show()
                        drawerLayout.closeDrawer(GravityCompat.START)

                    }
                    R.id.hotel-> {
                        //  Toast.makeText(this@MainActivity,"Home",Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity,"hotel",Toast.LENGTH_SHORT).show()

                    }
                    R.id.WhatsApp-> {
                        //  Toast.makeText(this@MainActivity,"Home",Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity,"WhatsApp",Toast.LENGTH_SHORT).show()

                    }
                    R.id.insta-> {
                        //  Toast.makeText(this@MainActivity,"Home",Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity,"Instagram",Toast.LENGTH_SHORT).show()

                    }
                    R.id.login-> {
                        //  Toast.makeText(this@MainActivity,"Home",Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity,"login",Toast.LENGTH_SHORT).show()

                    }
                    R.id.share-> {
                        //  Toast.makeText(this@MainActivity,"Home",Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity,"Share",Toast.LENGTH_SHORT).show()

                    }
                    R.id.map-> {
                        //  Toast.makeText(this@MainActivity,"Home",Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity,"Map",Toast.LENGTH_SHORT).show()

                    }

                    else->{return@setNavigationItemSelectedListener false }
                }
                true
            }

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        return if(toogle.onOptionsItemSelected(item)){
            true
        }else {

            return super.onOptionsItemSelected(item)
        }
    }
}
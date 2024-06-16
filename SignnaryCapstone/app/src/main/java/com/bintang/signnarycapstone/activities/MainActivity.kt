package com.bintang.signnarycapstone.activities

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.bintang.signnarycapstone.R
import com.bintang.signnarycapstone.fragments.AbjadFragment
import com.bintang.signnarycapstone.fragments.CameraFragment
import com.bintang.signnarycapstone.fragments.NumberFragment
import com.bintang.signnarycapstone.fragments.WordFragment
import com.bintang.signnarycapstone.ui.theme.SignnaryCapstoneTheme
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        val bottomNavigation : BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when(item.itemId){
                R.id.navigation_abjad -> selectedFragment = AbjadFragment()
                R.id.navigation_number -> selectedFragment = NumberFragment()
                R.id.navigation_word -> selectedFragment = WordFragment()
                R.id.navigation_sentence -> selectedFragment = SentenceFragment()
                R.id.navigation_camera -> selectedFragment = CameraFragment()
            }
            if (selectedFragment != null){
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, selectedFragment).commit()
            }
            true
        }

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, AbjadFragment()).commit()
        }

        override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
        ) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults)
            if(requestCode == REQUEST_CODE_PERMISSIONS){
                if(allPermissionGranted()){
                    startCamera()
                }else{
                    Toast.makeText(this, "Permissions not granted by the user.", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        }
    }
}
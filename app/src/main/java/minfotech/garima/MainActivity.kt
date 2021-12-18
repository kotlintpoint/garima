package minfotech.garima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import minfotech.garima.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.apply{
            setSupportActionBar(this)
            supportActionBar!!.setDisplayShowTitleEnabled(false);
        }

    }
}
package ph.kodego.aragon.janreign.applicationforemployment_8a

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nextPageButton = findViewById<Button>(R.id.education_page_btn)
        nextPageButton.setOnClickListener{
            val Intent = Intent(this,EducationActivity::class.java)
            startActivity(Intent)


        }

    }
}
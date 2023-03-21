package ph.kodego.aragon.janreign.applicationforemployment_8a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityEducationBinding
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityMainBinding

class EducationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEducationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEducationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nextPageButton2 = findViewById<Button>(R.id.employment_page_btn)
        nextPageButton2.setOnClickListener{
            val Intent = Intent(this,EmploymentActivity::class.java)
            startActivity(Intent)
        }
      }
    }


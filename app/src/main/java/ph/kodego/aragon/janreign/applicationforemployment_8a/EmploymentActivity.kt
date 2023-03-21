package ph.kodego.aragon.janreign.applicationforemployment_8a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityEducationBinding
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityEmploymentBinding
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityMainBinding
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityReferencesBinding

class EmploymentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEmploymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmploymentBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_employment)

        val nextPageButton3 = findViewById<Button>(R.id.reference_next_page_btn)
        nextPageButton3.setOnClickListener{
            val Intent = Intent(this,ReferencesActivity::class.java)
            startActivity(Intent)


        }

        }
    }
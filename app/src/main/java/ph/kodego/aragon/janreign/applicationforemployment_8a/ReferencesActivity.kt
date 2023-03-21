package ph.kodego.aragon.janreign.applicationforemployment_8a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityMainBinding
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityReferencesBinding

class ReferencesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReferencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferencesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nextPageButton4 = findViewById<Button>(R.id.acknowledgement_btn)
        nextPageButton4.setOnClickListener{
            val Intent = Intent(this,AcknowledgmentAndAuthorizationActivity::class.java)
            startActivity(Intent)


        }
    }
}
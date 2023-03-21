package ph.kodego.aragon.janreign.applicationforemployment_8a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityAcknowledgmentAndAuthorizationBinding
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityEducationBinding

class AcknowledgmentAndAuthorizationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAcknowledgmentAndAuthorizationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAcknowledgmentAndAuthorizationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val saveButton = findViewById<Button>(R.id.save_btn)
        saveButton.setOnClickListener{
            val Intent = Intent(this,DoneActivity::class.java)
            startActivity(Intent)
        }
    }
}
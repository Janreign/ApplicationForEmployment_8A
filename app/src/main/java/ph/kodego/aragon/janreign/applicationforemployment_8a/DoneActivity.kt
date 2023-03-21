package ph.kodego.aragon.janreign.applicationforemployment_8a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityDoneBinding
import ph.kodego.aragon.janreign.applicationforemployment_8a.databinding.ActivityEducationBinding

class DoneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
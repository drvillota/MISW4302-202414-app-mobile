package com.example.securephonemobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.securephonemobile.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun cambiarPantallaOnline(view: View){
        val intent = Intent(this, InicioOnlineActivity::class.java)
        startActivity(intent)
    }

    fun cambiarPantallaAjustes(view: View){
        val intent = Intent(this, AjustesActivity::class.java)
        startActivity(intent)
    }

    fun cambiarPantallaInformacion(view: View){
        val intent = Intent(this, InfoActivity::class.java)
        startActivity(intent)
    }
}
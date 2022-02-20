package com.example.dagger_copmponents_fun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.core.MessageInteractor
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var interactor: MessageInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as CustomApplication).appComponent.inject(this)

        val title: TextView = findViewById(R.id.title)
        title.text = interactor.prepareMessage()
    }
}
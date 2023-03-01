package com.example.alertdialogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var num=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.Btn.setOnClickListener {
            val alertdialog = AlertDialog.Builder(this)
            alertdialog.setTitle("Alert")
            alertdialog.setMessage(resources.getString(R.string.app_name))
            alertdialog.setPositiveButton("Add") { _, _ ->
                num += 10
                binding.etNumber.setText(num.toString())
            }
            alertdialog.setNegativeButton("Multiply") { _, _ ->
                num *= 5
                binding.etNumber.setText(num.toString())
            }
            alertdialog.setNeutralButton("Reset") { _, _ ->
                num = 0
                binding.etNumber.setText(num.toString())
            }
            alertdialog.show()
            alertdialog.setCancelable(false)
        }
    }
}
package com.example.spinneroptions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spinneroptions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        val countryCodesList = ArrayList<CountryCodes>().also {
            it.add(
                CountryCodes(
                    Flag = R.drawable.usa_flag,
                    Code = "+1"
                )
            )
            it.add(
                CountryCodes(
                    Flag = R.drawable.brazil,
                    Code = "+55"
                )
            )
            it.add(
                CountryCodes(
                    Flag = R.drawable.uk,
                    Code = "+44"
                )
            )
            it.add(
                CountryCodes(
                    Flag = R.drawable.germany,
                    Code = "+49"
                )
            )
            it.add(
                CountryCodes(
                    Flag = R.drawable.peru,
                    Code = "+51"
                )
            )
        }

        val adapter = CountryCodesAdapter(this, countryCodesList)
        binding.spinnerCountryCode.adapter = adapter
    }
}
package com.example.spinneroptions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class CountryCodesAdapter(
    private val context: Context,
    private val arrayList: ArrayList<CountryCodes>
) : BaseAdapter() {
    override fun getCount() = arrayList.size
    override fun getItem(p0: Int) = arrayList[p0]
    override fun getItemId(p0: Int) = p0.toLong()

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        var convertView: View? = convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                .inflate(R.layout.country_dropdown_menu, viewGroup, false)
        }

        val codes = getItem(position) as CountryCodes

        convertView?.apply {
            val flag = findViewById<ImageView>(R.id.countryFlag)
            val code = findViewById<TextView>(R.id.countryCode)

            codes.apply {
                flag.setImageResource(Flag)
                code.text = Code

            }
        }
        return convertView!!
    }
}
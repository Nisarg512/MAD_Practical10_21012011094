package com.example.mad_practical_10_21012011094

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import java.security.AccessControlContext

class PersonAdapter
    (val context: Context,val personarray:ArrayList<Person>):ArrayAdapter<Person>(context,0,personarray)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(context).inflate(R.layout.person_item,parent,false)

        view.findViewById<TextView>(R.id.tv_layout_1).text = personarray[position].name
        view.findViewById<TextView>(R.id.tv_layout_2).text = personarray[position].phoneNo
        view.findViewById<TextView>(R.id.tv_layout_3).text = personarray[position].emailId
        view.findViewById<TextView>(R.id.tv_layout_4).text = personarray[position].address
        view.findViewById<MaterialButton>(R.id.MatrialButoon1).setOnClickListener {
            Intent(context, MapsActivity::class.java).putExtra("object",personarray[position]).apply { context.startActivity(this) }
        }
        return view
    }
    }

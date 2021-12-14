package com.example.fragments.fragments

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments.R

class FinishFragment: Fragment(R.layout.fragment_finish) {

    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button3)

        button.setOnClickListener {

            var alertDialogBuilder = AlertDialog.Builder(context)
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.setPositiveButton("გამოსვლა", DialogInterface.OnClickListener { dialog, which ->
                // ...
                dialog.cancel()
            } )
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }

        view.findViewById<TextView>(R.id.textView1).text =
            FinishFragmentArgs.fromBundle(requireArguments()).eat.toString()

        view.findViewById<TextView>(R.id.textView3).text =
            FinishFragmentArgs.fromBundle(requireArguments()).sleep.toString()

        view.findViewById<TextView>(R.id.textView2).text =
            FinishFragmentArgs.fromBundle(requireArguments()).play.toString()





    }
}
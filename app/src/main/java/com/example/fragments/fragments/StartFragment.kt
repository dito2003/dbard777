package com.example.fragments.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragments.R

class StartFragment: Fragment(R.layout.fragment_start) {

    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button1)

        val navController = Navigation.findNavController(view)

        button.setOnClickListener {

            val action1 = StartFragmentDirections.actionStartFragmentToQuestionFragment()

            navController.navigate(action1)
        }
    }
}
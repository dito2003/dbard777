package com.example.fragments.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragments.R

class QuestionFragment: Fragment(R.layout.fragment_question) {

    private lateinit var eatEditText: EditText
    private lateinit var sleepEditText: EditText
    private lateinit var playEditText: EditText

    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        eatEditText = view.findViewById(R.id.editTextEat)
        sleepEditText = view.findViewById(R.id.editTextSleep)
        playEditText = view.findViewById(R.id.editTExtPlay)

        button = view.findViewById(R.id.button2)

        val navController = Navigation.findNavController(view)

        button.setOnClickListener {

            val eatText = eatEditText.text.toString()
            if(eatText.isEmpty()){
                return@setOnClickListener
            }
            val eat = eatText.toInt()

            val sleepText = sleepEditText.text.toString()
            if(sleepText.isEmpty()){
                return@setOnClickListener
            }
            val sleep = sleepText.toInt()

            val playText = playEditText.text.toString()
            if(playText.isEmpty()){
                return@setOnClickListener
            }
            val play = playText.toInt()

            val action2 = QuestionFragmentDirections.actionQuestionFragmentToFinishFragment(eat, sleep, play)
            navController.navigate(action2)


        }


    }
}
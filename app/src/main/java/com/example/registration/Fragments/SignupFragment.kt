package com.example.registration.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.registration.R
import com.example.registration.databinding.ActivityMainBinding
import com.example.registration.databinding.FragmentSignupBinding


class SignupFragment : Fragment() {
   private val binding by lazy {FragmentSignupBinding.inflate(layoutInflater)}
    private lateinit var list: Array<String>
    private lateinit var adapter: ArrayAdapter<String>

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val languages = resources.getStringArray(R.array.languages)
        val arrayAdapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, languages)
        binding.signupspinner.setAdapter(arrayAdapter)
        list = arrayOf(
            "Uzbekistan",
            "Russia",
            "Balarussia",
            "Gruziya",
            "Armanistan",
            "Indaneziya",
            "Gollandiya"
        )
        adapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, list)
        binding.signupspinner.setAdapter(adapter)






        return binding.root
    }

}
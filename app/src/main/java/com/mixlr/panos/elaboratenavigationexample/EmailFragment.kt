package com.mixlr.panos.elaboratenavigationexample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mixlr.panos.elaboratenavigationexample.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding
    private var signUpUsername: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmailBinding.inflate(inflater, container, false)
        signUpUsername = requireArguments().getString("sign_up_name")
        Log.i("MYTAG", "Sign up username = $signUpUsername")

        return binding.root
    }
}
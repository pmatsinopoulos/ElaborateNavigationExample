package com.mixlr.panos.elaboratenavigationexample

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.mixlr.panos.elaboratenavigationexample.databinding.FragmentNameBinding

class NameFragment : Fragment() {
    private lateinit var binding: FragmentNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNameBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            if (!TextUtils.isEmpty(binding.etName.text.toString())) {
                val bundle = bundleOf("sign_up_name" to binding.etName.text.toString())
                it.findNavController().navigate(R.id.action_frgmntName_to_frgmntEmail, bundle)
            } else {
                Toast.makeText(context, "You need to give a name", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root
    }
}
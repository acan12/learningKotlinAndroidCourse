package com.mimo.pigeon.learningkotlinandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.mimo.pigeon.learningkotlinandroid.data.City
import com.mimo.pigeon.learningkotlinandroid.databinding.FragmentOneBinding
import com.mimo.pigeon.learningkotlinandroid.databinding.FragmentTwoBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val data: City? = arguments?.getParcelable("DATA_ONE") ?: null
        Toast.makeText(activity, "Name: ${data?.name}", Toast.LENGTH_LONG).show()

        binding.btnFragment2.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}
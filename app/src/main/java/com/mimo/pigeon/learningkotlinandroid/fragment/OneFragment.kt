package com.mimo.pigeon.learningkotlinandroid.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mimo.pigeon.learningkotlinandroid.R
import com.mimo.pigeon.learningkotlinandroid.data.City
import com.mimo.pigeon.learningkotlinandroid.databinding.FragmentOneBinding

class OneFragment : Fragment() {
    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var bundle = Bundle()

        with(binding){
            btnFragment1.setOnClickListener {
                var secFragment = SecondFragment()
                var city = City("Jakarta", "Indonesia")
                bundle.putParcelable("data", city)
                secFragment.arguments = bundle
                moveFragment(secFragment)
            }
        }
    }

    fun moveFragment(nextFragment: Fragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.container, nextFragment)
        transaction?.commit()
    }
}
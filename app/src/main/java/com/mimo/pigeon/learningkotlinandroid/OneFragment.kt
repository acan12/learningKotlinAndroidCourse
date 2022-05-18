package com.mimo.pigeon.learningkotlinandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
        with(binding){
            btnFragment1.setOnClickListener {
                var fragment = SecondFragment()
                fragment.arguments?.putParcelable("DATA_ONE", City("Jakarta", "Indonesia"))
                moveFragment(fragment)
            }
        }
    }

    fun moveFragment(nextFragment: Fragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.container, nextFragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
    }
}
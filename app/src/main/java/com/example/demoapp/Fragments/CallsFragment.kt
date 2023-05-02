package com.example.demoapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoapp.Adapters.CallsAdapter
import com.example.demoapp.ProModel
import com.example.demoapp.R
import com.example.demoapp.databinding.FragmentCallsBinding


class CallsFragment : Fragment() {


    var profile = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13,
        R.drawable.image14,
        R.drawable.image15,
        R.drawable.image16,
        R.drawable.image17,
        R.drawable.image18,
        R.drawable.image19,
        R.drawable.image20,
        R.drawable.image21
    )
    var names = arrayOf("Nency","Princy","Deni","Bhumi","Zenny","Khushi","Reni","Atmee","Mansi","Hasti","Amisha","Yesha","Bansi","Meera","Piyu","Krishna","Bhagvati","Mina","Malti","Sneha","Disha")
    lateinit var binding: FragmentCallsBinding
    var CallsList = ArrayList<ProModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCallsBinding.inflate(layoutInflater)


        for (i in 0..profile.size-1){

            var model = ProModel(profile[i],names[i])
            CallsList.add(model)
        }

        binding.rcvCalls.layoutManager = LinearLayoutManager(context)
        binding.rcvCalls.adapter = CallsAdapter(CallsList)

        return binding.root


    }
}
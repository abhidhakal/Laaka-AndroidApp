package com.example.trying.fragments_dashboard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trying.Dashboard
import com.example.trying.MainActivity
import com.example.trying.R
import com.example.trying.databinding.FragmentHomeBinding
import com.example.trying.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    lateinit var viewBinding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)

    }

}
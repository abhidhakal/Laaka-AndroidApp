package com.example.trying

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.trying.databinding.ActivityDashboardBinding
import com.example.trying.fragments_dashboard.CartFragment
import com.example.trying.fragments_dashboard.CategoriesFragment
import com.example.trying.fragments_dashboard.HomeFragment
import com.example.trying.fragments_dashboard.ProfileFragment
import com.example.trying.fragments_dashboard.WishlistFragment

class Dashboard : AppCompatActivity() {

    lateinit var viewBinding : ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        setDefaultFragment(HomeFragment())

        viewBinding.navigator.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.wishlist -> replaceFragment(WishlistFragment())
                R.id.cart -> replaceFragment(CartFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
                R.id.categories -> replaceFragment(CategoriesFragment())
                else -> {}
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.contentContainer, fragment)
        fragmentTransaction.commit()
    }

    private fun setDefaultFragment(fragmentt : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.contentContainer, fragmentt)
            commit()
        }
    }

}
package android.hibatullah.newsapp.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.hibatullah.newsapp.R
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment.findNavController

/*
* This source code is free to use
* this program created by hmilzam@gmail.com
* dont forget to give star
* */
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        (activity as AppCompatActivity).supportActionBar!!.hide()
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val runnable= Runnable { findNavController(this).
            navigate(R.id.action_mainFragment_to_dashboardFragment2)}
        Handler().postDelayed(runnable,4000)
    }

}

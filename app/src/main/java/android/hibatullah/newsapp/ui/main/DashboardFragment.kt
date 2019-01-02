package android.hibatullah.newsapp.ui.main

import android.databinding.DataBindingUtil
import android.hibatullah.newsapp.R
import android.hibatullah.newsapp.databinding.DashboardFragmentBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DashboardFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : DashboardFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.dashboard_fragment, container, false
        )
        return binding.root
    }

}

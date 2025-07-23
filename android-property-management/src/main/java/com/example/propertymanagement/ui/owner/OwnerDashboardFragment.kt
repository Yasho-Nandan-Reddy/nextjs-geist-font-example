package com.example.propertymanagement.ui.owner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.propertymanagement.R

class OwnerDashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_owner_dashboard, container, false)
    }

    // TODO: Implement logic to load properties, rent due status, tenant info, lease duration, and total income summary
}

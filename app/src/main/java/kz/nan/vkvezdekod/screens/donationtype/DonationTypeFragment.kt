package kz.nan.vkvezdekod.screens.donationtype

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.nan.vkvezdekod.R
import kz.nan.vkvezdekod.uitools.setUpTitleBar

class DonationTypeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_donation_type, container, false)

        setUpTitleBar(view, this, "Тип сбора", isBackButVisible = true)

        val buttonTargeted = view.findViewById<LinearLayout>(R.id.button_targeted)
        val buttonRegular = view.findViewById<LinearLayout>(R.id.button_regular)

        buttonTargeted.setOnClickListener {
            findNavController().navigate(DonationTypeFragmentDirections.actionDonationTypeToTargetedFirst())
        }

        buttonRegular.setOnClickListener {

        }
        return view
        //return super.onCreateView(inflater, container, savedInstanceState)
    }
}
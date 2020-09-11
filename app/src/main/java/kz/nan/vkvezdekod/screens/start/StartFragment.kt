package kz.nan.vkvezdekod.screens.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.nan.vkvezdekod.R

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        val button = view.findViewById<FrameLayout>(R.id.button_create_donation)
        button.setOnClickListener {
            findNavController().navigate(StartFragmentDirections.actionStartToDonationType())
        }

        return view
    }
}
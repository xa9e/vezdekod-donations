package kz.nan.vkvezdekod.screens.targeted.additional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.nan.vkvezdekod.R
import kz.nan.vkvezdekod.uitools.setUpTitleBar

class TargetedAdditionalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_targeted_additional, container, false)

        setUpTitleBar(view, this, "Дополнительно")

        val buttonCreate = view.findViewById<FrameLayout>(
            R.id.button_next_ta
        )

        buttonCreate.setOnClickListener {
            findNavController().navigate(TargetedAdditionalFragmentDirections.actionTargetedAdditionalToPosting())
        }

        return view
        //return super.onCreateView(inflater, container, savedInstanceState)
    }
}
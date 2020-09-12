package kz.nan.vkvezdekod.screens.targeted.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.nan.vkvezdekod.R
import kz.nan.vkvezdekod.uitools.setUpTitleBar

class TargetedFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_targeted_first, container, false)

        setUpTitleBar(view, this, "Целевой сбор")

        val buttonNext = view.findViewById<FrameLayout>(R.id.button_next_tf)
        buttonNext.setOnClickListener {
            val action =
                TargetedFirstFragmentDirections.actionTargetedFirstToTargetedAdditional(
                    //nameForDonationEdt1 = view.findViewById<EditText>()
                )
            findNavController().navigate(action)
        }

        return view
    }
}
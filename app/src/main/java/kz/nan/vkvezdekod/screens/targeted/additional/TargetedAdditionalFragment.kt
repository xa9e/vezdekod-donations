package kz.nan.vkvezdekod.screens.targeted.additional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

        return view
        //return super.onCreateView(inflater, container, savedInstanceState)
    }
}
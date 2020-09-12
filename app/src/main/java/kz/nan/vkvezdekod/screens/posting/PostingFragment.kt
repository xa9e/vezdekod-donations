package kz.nan.vkvezdekod.screens.posting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.nan.vkvezdekod.R

class PostingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_posting, container, false)

        return view
        //return super.onCreateView(inflater, container, savedInstanceState)
    }
}
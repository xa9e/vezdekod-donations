package kz.nan.vkvezdekod.uitools

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.nan.vkvezdekod.R

fun setUpTitleBar(
    view: View,
    fragmentContext: Fragment,
    headerText: String,
    isBackButVisible: Boolean = true
) {
    val backButton = view.findViewById<ImageButton>(R.id.button_back_title_bar)
    val headerTextView = view.findViewById<TextView>(R.id.text_view_title_bar)

    backButton.visibility = if (isBackButVisible) View.VISIBLE else View.GONE
    headerTextView.text = headerText

    backButton.setOnClickListener {
        fragmentContext.findNavController().popBackStack()
    }
}
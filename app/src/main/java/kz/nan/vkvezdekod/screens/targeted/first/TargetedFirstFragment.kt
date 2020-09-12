package kz.nan.vkvezdekod.screens.targeted.first

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.nan.vkvezdekod.R
import kz.nan.vkvezdekod.uitools.setUpTitleBar

class TargetedFirstFragment : Fragment() {

    private lateinit var imageView: ImageView
    private lateinit var lliv: LinearLayout
    private var imageURI: Uri? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_targeted_first, container, false)

        setUpTitleBar(view, this, "Целевой сбор")

        imageView = view.findViewById(R.id.image_view_1)
        lliv = view.findViewById(R.id.linear_layout_under_image_view)

        val buttonUpload = view.findViewById<RelativeLayout>(R.id.button_upload_photo)
        buttonUpload.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, 100)
        }

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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 100) {
            imageURI = data?.data
            lliv.visibility = View.GONE
            imageView.setImageURI(imageURI)
        }
    }
}
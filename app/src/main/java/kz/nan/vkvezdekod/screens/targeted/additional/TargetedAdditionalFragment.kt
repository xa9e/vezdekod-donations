package kz.nan.vkvezdekod.screens.targeted.additional

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.nan.vkvezdekod.R
import kz.nan.vkvezdekod.uitools.setUpTitleBar
import java.text.SimpleDateFormat
import java.util.*

class TargetedAdditionalFragment : Fragment() {

    private lateinit var dataPickerLL: LinearLayout
    private lateinit var radioGroup: RadioGroup
    private lateinit var dateTextView: TextView

    var checkedFirstRadio = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_targeted_additional, container, false)

        setUpTitleBar(view, this, "Дополнительно")

        dataPickerLL = view.findViewById(R.id.data_picker_ll)
        radioGroup = view.findViewById(R.id.radio_group_1)
        dateTextView = view.findViewById(R.id.date_text_view)


        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            // Check which radio button was clicked
            when (checkedId) {
                R.id.radio_as_reached -> {
                    dataPickerLL.visibility = View.INVISIBLE
                    checkedFirstRadio = true
                }
                R.id.radio_until_date -> {
                    dataPickerLL.visibility = View.VISIBLE
                    checkedFirstRadio = false
                }
            }
        }

        val buttonCreate = view.findViewById<FrameLayout>(
            R.id.button_next_ta
        )

        val uri = arguments?.getParcelable<android.net.Uri>("imageUri")

        buttonCreate.setOnClickListener {
            findNavController().navigate(
                TargetedAdditionalFragmentDirections.actionTargetedAdditionalToPosting(
                    imageUri = uri!!,
                    checkedFirstRadio = checkedFirstRadio,
                    nameForDonationEdt1 = arguments?.getString("name_for_donation_edt1")!!,
                    sumRublesEdt2 = arguments?.getInt("sum_rubles_edt2")!!,
                    goalEdt3 = arguments?.getString("goal_edt3")!!,
                    descEdt4 = arguments?.getString("desc_edt4")!!,
                    ccEdt5 = arguments?.getInt("cc_edt5")!!
                )
            )
        }

        val calendar = Calendar.getInstance()

        val date: DatePickerDialog.OnDateSetListener =
            DatePickerDialog.OnDateSetListener { vieww, year, month, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                val format = "dd/MM/yy"
                val sdf = SimpleDateFormat(format, Locale.UK)

                dateTextView.text = sdf.format(calendar.time)
            }

        dataPickerLL.setOnClickListener {
            DatePickerDialog(
                this.requireContext(),
                date,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        return view
    }


}
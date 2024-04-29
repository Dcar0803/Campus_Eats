package com.example.campus_eats

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class JonesFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_jones, container, false)

        // Get references to header layouts and corresponding menu layouts
        val thursdayHeader = view.findViewById<LinearLayout>(R.id.thursdayHeader)
        val fridayHeader = view.findViewById<LinearLayout>(R.id.fridayHeader)
        val saturdayHeader = view.findViewById<LinearLayout>(R.id.saturdayHeader)
        val sundayHeader = view.findViewById<LinearLayout>(R.id.sundayHeader)
        val mondayHeader = view.findViewById<LinearLayout>(R.id.mondayHeader)
        val tuesdayHeader = view.findViewById<LinearLayout>(R.id.tuesdayHeader)
        val wednesdayHeader = view.findViewById<LinearLayout>(R.id.wednesdayHeader)

        val thursdayMenu = view.findViewById<LinearLayout>(R.id.thursdayMenu)
        val fridayMenu = view.findViewById<LinearLayout>(R.id.fridayMenu)
        val saturdayMenu = view.findViewById<LinearLayout>(R.id.saturdayMenu)
        val sundayMenu = view.findViewById<LinearLayout>(R.id.sundayMenu)
        val mondayMenu = view.findViewById<LinearLayout>(R.id.mondayMenu)
        val tuesdayMenu = view.findViewById<LinearLayout>(R.id.tuesdayMenu)
        val wednesdayMenu = view.findViewById<LinearLayout>(R.id.wednesdayMenu)

        // Set OnClickListener for each header
        thursdayHeader.setOnClickListener {
            toggleMenuVisibility(thursdayMenu)
        }

        fridayHeader.setOnClickListener {
            toggleMenuVisibility(fridayMenu)
        }

        saturdayHeader.setOnClickListener {
            toggleMenuVisibility(saturdayMenu)
        }

        sundayHeader.setOnClickListener {
            toggleMenuVisibility(sundayMenu)
        }

        mondayHeader.setOnClickListener {
            toggleMenuVisibility(mondayMenu)
        }
        tuesdayHeader.setOnClickListener {
            toggleMenuVisibility(tuesdayMenu)
        }

        wednesdayHeader.setOnClickListener {
            toggleMenuVisibility(wednesdayMenu)
        }


        return view
    }

    // Function to toggle visibility of menu items
    private fun toggleMenuVisibility(menu: LinearLayout) {
        if (menu.visibility == View.VISIBLE) {
            menu.visibility = View.GONE
        } else {
            menu.visibility = View.VISIBLE
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            JonesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

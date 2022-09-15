package com.example.myapplication.ui.platinum_tier

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.example.myapplication.GridRVAdapter
import com.example.myapplication.GridViewModal
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNotificationsBinding
import com.example.myapplication.databinding.FragmentPlatinumTierBinding

class Platinum_tier : Fragment() {

    companion object {
        fun newInstance() = Platinum_tier()
    }
    private var _binding: FragmentPlatinumTierBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: PlatinumTierViewModel
    lateinit var original_tier_grid: GridView
    lateinit var courseList: List<GridViewModal>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlatinumTierBinding.inflate(inflater, container, false)
        val root: View = binding.root

        original_tier_grid = _binding!!.GridPlatinumTier
        courseList = ArrayList<GridViewModal>()
        courseList = courseList + GridViewModal(
            "Melbourne – Chelsea",
            "● CASE MATERIAL - 316L Stainless Steel\n" +
                    "● CASE DIAMETER - 40mm\n" +
                    "● CASE THICKNESS - 12mm\n" +
                    "● MOVEMENT - Miyota 9015 Automatic Japanese movement\n" +
                    "● CRYSTAL - Anti-Reflective Sapphire\n" +
                    "● BRACELET - 20mm Stainless Steel\n" +
                    "● WATER RESISTANCE - 200m/20ATM",
            "https://content.watchgang.com/wp-content/uploads/2021/11/chelsea.jpg"
        )
        courseList = courseList + GridViewModal(
            "Stewart Dawson – Voyager",
            "● Automatic Japanese Movement\n" +
                    "● Screw case back\n" +
                    "● Bezel for second time zone with 12 hr scale\n" +
                    "● Case material: Stainless Steel\n" +
                    "● Case Diameter: 41 mm\n" +
                    "● Thickness: 14.6 mm\n" +
                    "● Lugs: 22 mm\n" +
                    "● Power-reserve in hours: 42 Hours\n" +
                    "● Jewels: 21\n" +
                    "● Dial Type: Shiny finishing with index in SuperLuminova\n" +
                    "● Sapphire crystal\n" +
                    "● Water-Resistance: 10 ATM / 100 mt",
            "https://content.watchgang.com/wp-content/uploads/2021/11/voyager.jpg"
        )
        courseList = courseList + GridViewModal(
            "Nautis – Commander",
            "● 316L stainless steel case\n" +
                    "● 316L stainless steel bracelet\n" +
                    "● Interchangeable rubber strap\n" +
                    "● Unidirectional bezel\n" +
                    "● Seiko NH35 Automatic\n" +
                    "● Sapphire Crystal with Anti-Reflective Coating\n" +
                    "● 200 ATM Water-Resistant\n" +
                    "● Swiss Super-LumiNova hands and markers\n" +
                    "● 45mm case\n" +
                    "● Limited Edition - 200 pieces",
            "https://content.watchgang.com/wp-content/uploads/2021/08/nautis-commander.jpg"
        )
        courseList = courseList + GridViewModal(
            "Tsovet – JMT-DW42 Global Explorer",
            "● JAPANESE AUTOMATIC\n" +
                    "● MOVEMENT - CALIBER NH35\n" +
                    "● CASE - 316L STAINLESS STEEL\n" +
                    "● THICKNESS - 14.00MM\n" +
                    "● BAND WIDTH - 22MM\n" +
                    "● BAND LENGTH - 130 / 75MM\n" +
                    "● CRYSTAL - SAPPHIRE",
            "https://content.watchgang.com/wp-content/uploads/2021/11/whatsapp-image-2021-11-29-at-17.51.09.jpeg"
        )
        courseList =
            courseList + GridViewModal(
                "Wolbrook – X-15 1969 Limited Edition Skindiver",
                "● The most faithful re-edition to-date of the tool-watch once owned and worn by Neil Armstrong\n" +
                        "● Hands and dial:\n" +
                        "○ DOUGLAS signature logo on the dial\n" +
                        "○ Special red on white date disk\n" +
                        "○ Green C7 Super-Luminova® on hands and indices\n" +
                        "● 120 click Unidirectional rotatable bezel, 316L stainless steel with black PVD treatment\n" +
                        "● Case:\n" +
                        "○ Hand finished brushed 316L stainless steel\n" +
                        "○ Hesalite glass box with an inside “cyclops” magnifier above the date window\n" +
                        "○ Drilled lugs for easy strap changes\n" +
                        "○ Water resistance: 10 ATM / 100m\n" +
                        "○ Screwed caseback strictly numbered to 1969 pieces\n" +
                        "● Dimensions:\n" +
                        "○ 40mm diameter x 48mm lugs to lugs x 13.55mm thickness\n" +
                        "○ 20mm lug width",
                "https://content.watchgang.com/wp-content/uploads/2021/10/wolbrook.jpg"
            )
        courseList =
            courseList + GridViewModal(
                "Chronofixe – Flight 1952",
                "● Case: Stainless steel silver color case\n" +
                        "● Strap: Stainless steel bracelet\n" +
                        "● Case size: 40 MM\n" +
                        "● Case thickness: 12 MM\n" +
                        "● Case material: Stainless steel\n" +
                        "● Case finish: Brushed and polished case\n" +
                        "● Strap width: 20 x 18 MM\n" +
                        "● Glass: Sapphire glass with Anti-reflective coating\n" +
                        "● Water resistance: 200M/660FT",
                "https://content.watchgang.com/wp-content/uploads/2021/09/chronofixe-flight-1952.jpg"
            )
        courseList = courseList + GridViewModal(
            "West End – Impermeable",
            "● Stainless Steel case and bracelet with double-security clasp\n" +
                    "● Rotating bezel\n" +
                    "● Diameter 42mm\n" +
                    "● Sapphire crystal\n" +
                    "● Water Resistant 20 ATM\n" +
                    "● Swiss automatic movement with date calendar",
            "https://content.watchgang.com/wp-content/uploads/2021/09/west-end-impermeable.jpg"
        )

        courseList = courseList + GridViewModal(
            "West End – Secundus",
            "● Stainless Steel case and bracelet\n" +
                    "● Diameter 40mm\n" +
                    "● Water Resistant to 30m\n" +
                    "● Double-curved sapphire crystal\n" +
                    "● Swiss automatic movement with Day-Date calendar",
            "https://content.watchgang.com/wp-content/uploads/2021/09/west-end-secundus.jpg"
        )
        courseList = courseList + GridViewModal(
            "West End – 8457",
            "● Stainless Steel case and bracelet\n" +
                    "● Diameter 40mm\n" +
                    "● Water Resistant 10 ATM\n" +
                    "● Sapphire crystal\n" +
                    "● Automatic movement with day and date calendar",
            "https://content.watchgang.com/wp-content/uploads/2021/09/west-end-8457.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Archon – Iron Lung",
                "● Movement: Automatic\n" +
                        "● Crown: Screw-down\n" +
                        "● Clasp: Double locking push button clasp",
                "https://content.watchgang.com/wp-content/uploads/2021/08/archon-iron-lung.jpg"
            )
        courseList = courseList + GridViewModal(
            "Dufa – Flugbahn",
            "● Movement: Automatic\n" +
                    "● Clasp: Diver clasp\"" +
                    "",
            "https://content.watchgang.com/wp-content/uploads/2021/08/dufa-flugbahn.jpg"
        )
        courseList = courseList + GridViewModal(
            "Selhor – Vintage Diver",
            "● Movement: Automatic\n" +
                    "● Crown: Screw-down\n" +
                    "● Clasp: Double locking push button clasp",
            "https://content.watchgang.com/wp-content/uploads/2021/08/selhor-vintage-diver.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Le Jour – Coral Diver",
                "● Movement: Swiss Automatic\n" +
                        "● Clasp: Push-button diver clasp",
                "https://content.watchgang.com/wp-content/uploads/2021/08/le-jour-coral-diver.jpg"
            )
        courseList =
            courseList + GridViewModal(
                "Le Jour – Hammerhead",
                "● Movement: Swiss Automatic\n" +
                        "● Crown: Screw-down\n" +
                        "● Clasp: Fold Over Buckle with Push Button",
                "https://content.watchgang.com/wp-content/uploads/2021/08/hammerhead.jpg"
            )

        courseList =
            courseList + GridViewModal(
                "Le Jour – Flieger",
                "● Movement: Swiss Automatic\n" +
                        "● Crown: Screw-down\n" +
                        "● Clasp: Buckle",
                "https://content.watchgang.com/wp-content/uploads/2021/08/lj-fl-001_front_2000x.jpg"
            )
        // on below line we are initializing our course adapter
        // and passing course list and context.
        val courseAdapter = GridRVAdapter(courseList = courseList, this.requireActivity())

        // on below line we are setting adapter to our grid view.
        original_tier_grid.adapter = courseAdapter
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlatinumTierViewModel::class.java)
        // TODO: Use the ViewModel

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
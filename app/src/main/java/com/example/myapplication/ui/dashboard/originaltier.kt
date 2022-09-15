package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.GridRVAdapter
import com.example.myapplication.GridViewModal
import com.example.myapplication.Home_screen
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentOriginaltierBinding

class originaltier : Fragment() {

    private var _binding: FragmentOriginaltierBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    lateinit var original_tier_grid: GridView
    lateinit var courseList: List<GridViewModal>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentOriginaltierBinding.inflate(inflater, container, false)
        val root: View = binding.root
        original_tier_grid = _binding!!.GridOriginalTier

        courseList = ArrayList<GridViewModal>()
        courseList = courseList + GridViewModal(
            "Jacques Monnat – Lavezzi",
            "● CASE : Stainless Steel\n" +
                    "● DIAL : Sapphire Coated Mineral Lens\n" +
                    "● CASE SIZE : 42mm\n" +
                    "● LENS : Sapphire Coated Mineral Lens\n" +
                    "● WATER RESISTANCE : 10 ATM",
            "https://content.watchgang.com/wp-content/uploads/2022/01/lavezzi.jpg"
        )
        courseList = courseList + GridViewModal(
            "Invicta • Pro Diver",
            "● Case: Stainless Steel\n" +
                    "● Band: Stainless Steel\n" +
                    "● Movement: Japanese Automatic NH35A\n" +
                    "● Glass: Mineral",
            "https://content.watchgang.com/wp-content/uploads/2021/01/invicta_prodiver.jpg"
        )
        courseList = courseList + GridViewModal(
            "Tayroc – Lydgate",
            "● Case - 40mm Stainless Steel\n" +
                    "● Sapphire Coated Lens\n" +
                    "● 20mm Mesh Strap\n" +
                    "● Water Resistance - 5 ATM\n" +
                    "● Miyota 2035 Quartz",
            "https://content.watchgang.com/wp-content/uploads/2021/09/tayroc-lydgate.jpg"
        )
        courseList = courseList + GridViewModal(
            "Axwell – Marauder",
            "● 304L Surgical-Quality Stainless Steel Case\n" +
                    "● Japanese Miyota 2115 Quartz Movement\n" +
                    "● Non-Glare Scratch-Resistant Mineral Crystal\n" +
                    "● Logo-Engraved Stainless Steel Caseback\n" +
                    "● 304L Surgical-Quality Stainless Steel Bracelet\n" +
                    "● Logo-Engraved Stainless Steel Clasp\n" +
                    "● Luminous Hands\n" +
                    "● Date Display\n" +
                    "● 43mm Case Diameter\n" +
                    "● 20ATM Water Resistance (Professional Deep Diving Approved)",
            "https://content.watchgang.com/wp-content/uploads/2021/10/axwell.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Giordano – Frederic",
                "● Case: Stainless Steel\n" +
                        "● Band:Folded Buckle on steel / Buckle on leather\n" +
                        "● Movement: Japan Quartz 2 Hands with Small Second",
                "https://content.watchgang.com/wp-content/uploads/2021/06/original-giordano-frederic.jpg"
            )
        courseList =
            courseList + GridViewModal(
                "Voiage – Montagne",
                "● Case: Stainless Steel\n" +
                        "● Band: Canvas / Fabric -or- Stainless Steel\n" +
                        "● Movement: Quartz\n" +
                        "● Glass: Mineral Lens with Sapphire Coating",
                "https://content.watchgang.com/wp-content/uploads/2021/03/voiage-montage.jpg"
            )
        courseList = courseList + GridViewModal(
            "Invicta • Pro Diver",
            "● Case: Stainless Steel\n" +
                    "● Band: Stainless Steel\n" +
                    "● Movement: Japanese Automatic NH35A\n" +
                    "● Glass: Mineral",
            "https://content.watchgang.com/wp-content/uploads/2021/01/invicta_prodiver.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "DDM – Maestrale and Lerici",
                "● Case: Stainless Steel\n" +
                        "● Band: Leather / Stainless Steel\n" +
                        "● Movement: Quartz\n" +
                        "● Glass: Sapphire Coated Mineral Lens",
                "https://content.watchgang.com/wp-content/uploads/2021/03/ddm-maestrale-and-lerici2.jpg"
            )
        courseList = courseList + GridViewModal(
            "Lucien Piccard • LP-28025",
            "● Case: Stainless Steel\n" +
                    "● Band: Genuine Leather\n" +
                    "● Movement: Japan Quartz 3 Hands\n" +
                    "● Glass: Mineral Glass\n" +
                    "",
            "https://content.watchgang.com/wp-content/uploads/2020/08/lucien_piccard-lp-28025.jpg"
        )
        courseList = courseList + GridViewModal(
            "Elevon • Hughes",
            "● Case: Stainless Steel\n" +
                    "● Band: Stainless Steel\n" +
                    "● Movement: Japanese Quartz\n" +
                    "● Glass: Mineral Crystal",
            "https://content.watchgang.com/wp-content/uploads/2020/08/elevon-hughes.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Breda • Phase",
                "● Case: Rose Gold-Plated\n" +
                        "● Band: Italian Leather\n" +
                        "● Movement: Swiss Ronda Quartz\n" +
                        "● Glass: Curved Edge Glass",
                "https://content.watchgang.com/wp-content/uploads/2020/08/breda-phase.jpg"
            )
        courseList = courseList + GridViewModal(
            "PureDial • Square Legacy",
            "● Case: Stainless Steel (Various Colors)\n" +
                    "● Band: Leather\n" +
                    "● Movement: Japanese Miyota Quartz Movement\n" +
                    "● Glass: Sapphire Coated Glass",
            "https://content.watchgang.com/wp-content/uploads/2020/07/puredial-square_legacy.jpg"
        )
        courseList = courseList + GridViewModal(
            "Joshua & Sons • JX103",
            "● Case: Alloy\n" +
                    "● Band: Alloy\n" +
                    "● Movement: Miyota Quartz",
            "https://content.watchgang.com/wp-content/uploads/2020/07/joshua_and_sons-jx103.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Joshua & Sons • JX120",
                "● Case: Alloy\n" +
                        "● Band: Leather\n" +
                        "● Movement: Quartz",
                "https://content.watchgang.com/wp-content/uploads/2020/07/joshua_and_sons-jx120.jpg"
            )
        courseList =
            courseList + GridViewModal(
                "Joshua & Sons • JX135",
                "● Case: Alloy\n" +
                        "● Band: Leather\n" +
                        "● Movement: Quartz",
                "https://content.watchgang.com/wp-content/uploads/2020/07/joshua_and_sons-jx135.jpg"
            )


        // on below line we are initializing our course adapter
        // and passing course list and context.
        val courseAdapter = GridRVAdapter(courseList = courseList, this.requireActivity())

        // on below line we are setting adapter to our grid view.
        original_tier_grid.adapter = courseAdapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.example.myapplication.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.GridRVAdapter
import com.example.myapplication.GridViewModal
import com.example.myapplication.databinding.FragmentNotificationsBinding

class blacktier_fragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

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
        val notificationsViewModel =
            ViewModelProvider(this).get(blacktierViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        original_tier_grid = _binding!!.GridBlackTier
        courseList = ArrayList<GridViewModal>()
        courseList = courseList + GridViewModal(
            "Grant Brown Conquest",
            "● Case Material: Stainless Steel\n" +
                    "● Case Size: 44mm\n" +
                    "● Crystal Type: Mineral Crystal\n" +
                    "● Bracelet/Strap Material: Nylon\n" +
                    "● Water Resistance: 10ATM\n" +
                    "● Movement: Miyota 0S21",
            "https://content.watchgang.com/wp-content/uploads/2022/06/grant-brown-copy.jpg"
        )
        courseList = courseList + GridViewModal(
            "Chronofixe – Sous Marine",
            "● Case: Stainless Steel\n" +
                    "● Bezel: Stainless Steel Rotating Bezel with Black & Aluminum Color and with White & Black\n" +
                    "Print\n" +
                    "● Crown: Shiny Crown with Etched Logo\n" +
                    "● Case Size: 42 MM\n" +
                    "● Case thickness: 12.5 MM\n" +
                    "● Case material: Stainless Steel\n" +
                    "● Case finish: Vertical Brushed\n" +
                    "● Lug/strap width: 20 * 18 MM\n" +
                    "● Movement: RONDA 515.24H QUARTZ Movt | 3 Hands | Date | GMT\n" +
                    "● Glass: Sapphire Glass with Anti Reflective Coating\n" +
                    "● Water resistance: 100 M",
            "https://content.watchgang.com/wp-content/uploads/2022/06/chronofixe-copy.jpg"
        )
        courseList = courseList + GridViewModal(
            "Charles Hutton – Newport-Pagnell",
            "● Case: Stainless steel silver case with an embossed caseback, fixed bezel and plastic\n" +
                    "movement holder\n" +
                    "● Bezel: Fixed bezel\n" +
                    "● Crown: Polished T-crown etched with the Charles Hutton logo\n" +
                    "● Hands: 3 shiny silver hands with luminous red second hands and silver subdials with white\n" +
                    "luminescence\n" +
                    "● CASE SIZE - 42mm\n" +
                    "● CASE THICKNESS - 11.5 mm\n" +
                    "● CASE MATERIAL - Stainless steel\n" +
                    "● CASE FINISH - Polished with Circular Brush\n" +
                    "● LUG/STRAP WIDTH - 24 mm\n" +
                    "● MOVEMENT - VH64\n" +
                    "● GLASS - Mineral Glass with Sapphire Coating\n" +
                    "● WATER RESISTANCE - 10 ATM / 330 ft.",
            "https://content.watchgang.com/wp-content/uploads/2022/02/charles-hutton-newport-pagnell.jpg"
        )
        courseList = courseList + GridViewModal(
            "Heritor • Becker",
            "● 316L Surgical-Quality Stainless Steel Case\n" +
                    "● Jeweled Seiko NH35 Automatic Movement\n" +
                    "● Jewel Bearings: 24 Jewels\n" +
                    "● 28-Hour Power Reserve\n" +
                    "● Beats per Hour (BPH): 21600/Hour\n" +
                    "● Non-Glare Scratch Resistant Mineral Crystal\n" +
                    "● Observation Caseback to View Movement\n" +
                    "● Genuine Leather Strap\n" +
                    "● Logo-Engraved Stainless Steel Clasp\n" +
                    "● Luminous Hands\n" +
                    "● Date Indicator\n" +
                    "● 43mm Case Diameter\n" +
                    "● 10 ATM Water Resistance",
            "https://content.watchgang.com/wp-content/uploads/2020/05/heritor-becker.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Earnshaw – Maudslay",
                "● Case: Stainless Steel\n" +
                        "● Case Size : 43mm\n" +
                        "● Movement: Mechanical Automatic 3 Hands with Date\n" +
                        "● Water Resistance : 5 ATM",
                "https://content.watchgang.com/wp-content/uploads/2021/12/maudslay.jpg"
            )
        courseList =
            courseList + GridViewModal(
                "Blackwell – Grandeur",
                "● Case: Stainless steel with fixed bezel\n" +
                        "● Crown: Round polished T crown with etching logo\n" +
                        "● Hands: Shiny silver color hands",
                "https://content.watchgang.com/wp-content/uploads/2021/11/grandeur.jpg"
            )
        courseList = courseList + GridViewModal(
            "Carrero – Avatar",
            "● Case Measurements: L-44.0 mm W-44.0 mm H - 13.50 mm\n" +
                    "● Case Material: 316-L Solid Stainless Steel (Silver tone)\n" +
                    "● Crown: Silver tone, Long Post, Water proof, Screw-down.\n" +
                    "● Crystal: Sapphire Coated\n" +
                    "● Back Case: Screw-Down Case back\n" +
                    "● Bracelet Measurement: W - 20.0 mm L- 8. In\n" +
                    "○ Maximum Wrist Size: 9.75 in\n" +
                    "● Bracelet Material: Stainless Steel , Silver tone polished.\n" +
                    "● Caliber: TMI - VD53\n" +
                    "● Water Resistance: 10 ATM - 100 meters - 330 feet",
            "https://content.watchgang.com/wp-content/uploads/2021/11/avatar.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Chronologia – Trailer",
                "● Movement: Meca-Quartz\n" +
                        "● Crown: Pull-out\n" +
                        "● Clasp: Buckle on rubber / Diver on Polycarbonate",
                "https://content.watchgang.com/wp-content/uploads/2021/08/chronologia-trailer.jpg"
            )
        courseList = courseList + GridViewModal(
            "HLA (Hawaiian Lifeguard Association) – Dive Collection",
            "● Movement: Quartz\n" +
                    "● Crown: Screw-down\n" +
                    "● Clasp: Buckle\n",
            "https://content.watchgang.com/wp-content/uploads/2021/08/hla-dive-collection.jpg"
        )
        courseList = courseList + GridViewModal(
            "Momentum – Steelix Eclipse",
            "● Movement: Solar\n" +
                    "● Crown: Screw-down\n" +
                    "● Clasp: Diver clasp\n" +
                    "● Manual: Physical manual included with watch",
            "https://content.watchgang.com/wp-content/uploads/2021/09/momentum-steelix-eclipse.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Cortebert – Clipper",
                "● Case: Stainless Steel\n" +
                        "● Band: Stainless Steel\n" +
                        "● Movement: Japan Quartz Chronograph\n" +
                        "● Glass: Mineral Lens with Sapphire Coating",
                "https://content.watchgang.com/wp-content/uploads/2021/06/black-cortebert-clipper.jpg"
            )
        courseList = courseList + GridViewModal(
            "Cortebert – Potez",
            "● Case: Stainless Steel\n" +
                    "● Band: Stainless Steel / Leather\n" +
                    "● Movement: Japan Quartz Chronograph\n" +
                    "● Glass: Sapphire Coated Mineral\n" +
                    "",
            "https://content.watchgang.com/wp-content/uploads/2021/06/black-cortebert-potez.jpg"
        )
        courseList = courseList + GridViewModal(
            "Cadola – Intrepid",
            "● Case: Stainless Steel\n" +
                    "● Band: Solid Stainless Steel Bracelet with Fold Over Buckle with Push Button\n" +
                    "● Movement: Japan Quartz Chronograph with Date and 24 hours\n" +
                    "● Glass: Mineral Lens with Sapphire Coating",
            "https://content.watchgang.com/wp-content/uploads/2021/04/cadola-intrepid.jpg"
        )
        courseList =
            courseList + GridViewModal(
                "Cadola – Testa Ditoro",
                "● Case: Stainless Steel\n" +
                        "● Band: Leather/Stainless Steel\n" +
                        "● Movement: Japan Quartz Chronograph with Date and 24 hours\n" +
                        "● Glass: Mineral Lens with Sapphire Coating",
                "https://content.watchgang.com/wp-content/uploads/2021/04/cadola-testa-ditoro.jpg"
            )
        courseList =
            courseList + GridViewModal(
                "Aquinus – Hydrautica",
                "● Case: Stainless Steel\n" +
                        "● Band: Stainless Steel\n" +
                        "● Movement: Ronda 763 Swiss Made Quartz\n" +
                        "● Glass: Flat mineral glass with sapphire coating",
                "https://content.watchgang.com/wp-content/uploads/2021/02/aquinus_hydrautica.jpg"
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
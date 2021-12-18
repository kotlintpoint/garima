package minfotech.garima.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import minfotech.garima.R

/**
 * A simple [Fragment] subclass.
 * Use the [SearchByFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchByFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_by, container, false)
    }

}
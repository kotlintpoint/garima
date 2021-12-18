package minfotech.garima.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import minfotech.garima.R
import minfotech.garima.databinding.FragmentPhotosBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PhotosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PhotosFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding:FragmentPhotosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentPhotosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)

        binding.apply {
            recyclerView.layoutManager=LinearLayoutManager(requireContext())

        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.photos_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_new->{
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_photosFragment_to_photosFormFragment)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }



}
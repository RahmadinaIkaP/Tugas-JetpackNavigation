package binar.academy.chapter3_topik4.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import binar.academy.chapter3_topik4.R
import binar.academy.chapter3_topik4.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private var _binding : FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private val args : ProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBackProfile.setOnClickListener {
            Navigation.findNavController(view).navigateUp()
        }

        binding.btnKeluar.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_loginFragment)
        }

        val args = args.dataprofile

        binding.tvNamaUserProfile.text = "$args"
    }
}
package binar.academy.chapter3_topik4.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import binar.academy.chapter3_topik4.R
import binar.academy.chapter3_topik4.databinding.FragmentUmurBinding

class UmurFragment : Fragment() {
    private var _binding : FragmentUmurBinding? = null
    private val binding get() =  _binding!!

    private val args : UmurFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUmurBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBackUmur.setOnClickListener {
            Navigation.findNavController(view).navigateUp()
        }

        val args = args.dataumur

        binding.tvNamaUserUmur.text = "Halo, ${args.username}"
        binding.tvUmurUser.text = "Umur kamu ${args.umur} tahun"
    }
}
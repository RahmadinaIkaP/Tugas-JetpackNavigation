package binar.academy.chapter3_topik4.latihan

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import binar.academy.chapter3_topik4.databinding.FragmentHomeBinding
import java.time.LocalDateTime

class HomeFragment : Fragment() {
    private var  _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val args : HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = args.datauser

        binding.tvNamaUser.text = "Halo, ${user.username}"

        binding.btnHitungUmur.setOnClickListener {
            if (binding.etTahunLahir.text!!.isNotEmpty()){
                val umur = binding.etTahunLahir.text.toString().toInt()
                val hitungUmur = LocalDateTime.now().year - umur

                val dataUserLengkap = User(user.username, user.password, hitungUmur)

                val action = HomeFragmentDirections.actionHomeFragmentToUmurFragment(dataUserLengkap)
                Navigation.findNavController(requireView()).navigate(action)
            }else
                Toast.makeText(context, "Umur tidak boleh kosong!!", Toast.LENGTH_SHORT).show()
        }


        binding.btnProfile.setOnClickListener {
            val username = user.username

            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(username)
            Navigation.findNavController(requireView()).navigate(action)
        }

    }
    
}
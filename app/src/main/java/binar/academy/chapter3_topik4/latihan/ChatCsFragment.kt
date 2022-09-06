package binar.academy.chapter3_topik4.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import binar.academy.chapter3_topik4.R
import binar.academy.chapter3_topik4.databinding.FragmentChatCsBinding

class ChatCsFragment : Fragment() {
    private var  _binding : FragmentChatCsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChatCsBinding.inflate(inflater, container, false)
        return binding.root
    }

}
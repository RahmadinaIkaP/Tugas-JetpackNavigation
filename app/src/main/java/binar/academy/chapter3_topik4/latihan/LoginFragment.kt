package binar.academy.chapter3_topik4.latihan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import binar.academy.chapter3_topik4.R
import binar.academy.chapter3_topik4.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding : FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            if (binding.etLoginUsername.text!!.isNotEmpty() && binding.etLoginPassword.text!!.isNotEmpty()){
                var username = binding.etLoginUsername.text.toString()
                var password = binding.etLoginPassword.text.toString()

                var dataUser = User(username, password)
                val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(dataUser)

                Navigation.findNavController(view).navigate(action)
            }else{
                Toast.makeText(context, "Tidak boleh kosong!!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnLupaPass.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_lupaPassFragment)
        }

        binding.btnRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }

        binding.btnChat.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_chatCsFragment)
        }

        binding.btnHelp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_helpFragment)
        }
    }
}
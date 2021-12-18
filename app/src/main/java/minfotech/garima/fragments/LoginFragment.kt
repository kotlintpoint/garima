package minfotech.garima.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import minfotech.garima.R
import minfotech.garima.databinding.FragmentLoginBinding
import minfotech.garima.model.User
import minfotech.garima.other.GarimaClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
private const val TAG = "LoginFragment"
class LoginFragment : Fragment() {
    private lateinit var binding:FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnSubmit.setOnClickListener {
                val username=etUsername.text.toString()
                val password=etPassword.text.toString()
                if(username==""){
                    inputUsername.error="Required"
                    return@setOnClickListener
                }
                if(password==""){
                    inputPassword.error="Required"
                    return@setOnClickListener
                }
                validateLogin(username,password)
            }
        }
    }

    private fun validateLogin(username: String, password: String) {
        val service = GarimaClient.getClient()
        val fields= hashMapOf(
            "Username" to username,
            "Password" to password
        )
        service.Login(fields).enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                val user= response.body()?.get(0)
                if(user!=null){
                    Navigation.findNavController(requireView())
                        .navigate(R.id.action_loginFragment_to_searchByFragment)

                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.i(TAG, t.toString())
            }

        })
    }

}
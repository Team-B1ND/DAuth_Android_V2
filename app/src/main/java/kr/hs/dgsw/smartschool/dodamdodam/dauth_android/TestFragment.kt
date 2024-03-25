package kr.hs.dgsw.smartschool.dodamdodam.dauth_android

import android.content.Context
import android.content.ContextWrapper
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth.loginWithDodam
import kotlin.text.Typography.dagger

class TestFragment: Fragment(), OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_test, container, false)
        view.findViewById<Button>(R.id.btn_login).setOnClickListener(this)

        return view
    }

    override fun onClick(p0: View?) {
        loginWithDodam(requireContext(), {
            Toast.makeText(requireContext(), it.accessToken, Toast.LENGTH_SHORT).show()
        }, {
            Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
        })
    }
}
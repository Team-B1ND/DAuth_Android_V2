package kr.hs.dgsw.smartschool.dodamdodam.dauth_android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth.exitDAuth
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth.getCode
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth.getUserInfo
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth.loginWithDodam
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth.settingDAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clientId = "b3a8bb2bb65548938938c2e8274efe27df669bb1a8704c2c9098fa51583e0ba2"
        val redirectUrl = "http://localhost:3000/callback"
        val clientSecret = "2a291946c9b14858bebc301c0ba2376bedf27b44e2d142d980909365c6892084"

        settingDAuth(clientId, clientSecret, redirectUrl)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            startActivity(Intent(this, SubActivity::class.java))
            finishAffinity()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        exitDAuth()
    }
}

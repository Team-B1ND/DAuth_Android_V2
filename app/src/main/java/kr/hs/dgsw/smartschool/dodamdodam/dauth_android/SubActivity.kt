package kr.hs.dgsw.smartschool.dodamdodam.dauth_android

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth
import kr.hs.dgsw.smartschool.dodamdodam.dauth.DAuth.settingDAuth

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clientId = "b3a8bb2bb65548938938c2e8274efe27df669bb1a8704c2c9098fa51583e0ba2"
        val redirectUrl = "http://localhost:3000/callback"
        val clientSecret = "2a291946c9b14858bebc301c0ba2376bedf27b44e2d142d980909365c6892084"

//        settingDAuth(clientId, clientSecret, redirectUrl)

//        findViewById<Button>(R.id.btn_login).setOnClickListener {
//            DAuth.loginWithDodam(this, {
//                Toast.makeText(this, it.accessToken, Toast.LENGTH_SHORT).show()
//            }, {
//                Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
//            })
//        }
    }
}

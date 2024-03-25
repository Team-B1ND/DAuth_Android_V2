package kr.hs.dgsw.smartschool.dodamdodam.dauth_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            startActivity(Intent(this, SubActivity::class.java))
            finishAffinity()
        }
    }
}

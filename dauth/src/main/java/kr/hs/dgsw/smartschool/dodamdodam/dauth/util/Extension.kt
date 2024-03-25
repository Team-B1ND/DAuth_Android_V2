package kr.hs.dgsw.smartschool.dodamdodam.dauth.util

import android.content.Context
import android.content.ContextWrapper
import androidx.appcompat.app.AppCompatActivity

fun Context?.getLifeCycleOwner() : AppCompatActivity? = when {
    this is ContextWrapper -> if (this is AppCompatActivity) this else this.baseContext.getLifeCycleOwner()
    else -> null
}
package com.max.def.firebaseapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.firebase.ui.auth.AuthUI
import com.google.android.gms.tasks.OnCompleteListener

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SignOut(view: View)
    {
        AuthUI.getInstance().signOut(this).addOnCompleteListener {
                Toast.makeText(this,"Successfully signed out",Toast.LENGTH_SHORT).show()
            val mainIntent = Intent(this,LoginActivity::class.java)
            mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(mainIntent)
            }

    }

    fun Delete(view : View)
    {
        AuthUI.getInstance().delete(this).addOnCompleteListener{
                Toast.makeText(this,"Successfully account has been deleted",Toast.LENGTH_SHORT).show()
            val mainIntent = Intent(this,LoginActivity::class.java)
            mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(mainIntent)
            }

    }

}

package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setNickName(editText)


    }

    private fun setNickName(view: EditText) {

        val nickName = view.text

        doneButton.setOnClickListener {

            editText.visibility = View.GONE
            doneButton.visibility = View.GONE

            nicknameText.text = nickName
            updateNickName(nicknameText)
            nicknameText.visibility = View.VISIBLE

        }
    }

    private fun updateNickName(view: View) {

        view.setOnClickListener {
            editText.visibility = View.VISIBLE
            doneButton.visibility = View.VISIBLE
            nicknameText.visibility = View.GONE

            setNickName(editText)
        }

    }
}
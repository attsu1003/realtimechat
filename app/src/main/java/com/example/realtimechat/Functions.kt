package com.example.realtimechat

import android.content.Context
import android.widget.Toast

fun makeToast(context: Context,message: String){
    Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
}
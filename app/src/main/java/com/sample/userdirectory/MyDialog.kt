package com.sample.userdirectory

import android.app.Dialog
import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.TextView

class MyDialog(context: Context, private val onConfirm: () -> Unit) {
    private val dialog: Dialog = Dialog(context)

    init {
        dialog.setContentView(R.layout.dialog_confirm)
        dialog.setCancelable(true)

        val yesButton = dialog.findViewById<Button>(R.id.btnYes)
        val noButton = dialog.findViewById<Button>(R.id.btnNo)

        yesButton.setOnClickListener {
            onConfirm()
            dialog.dismiss()
        }

        noButton.setOnClickListener {
            dialog.dismiss()
        }
    }

    fun show() {
        dialog.show()
    }
}
package com.example.ganeshtikone.kotlincomponets

import android.content.DialogInterface
import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatButton
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var coordinateLayout: CoordinatorLayout

    private lateinit var buttonShowToast: AppCompatButton
    private lateinit var buttonShowSnack: AppCompatButton
    private lateinit var buttonShowExitAlert: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        setOnClickListenerOnButtons()

    }

    /**
     * Handle Event on Button
     */
    private fun setOnClickListenerOnButtons() {

        buttonShowToast.setOnClickListener(this)
        buttonShowSnack.setOnClickListener(this)
        buttonShowExitAlert.setOnClickListener(this)
    }

    /**
     * Init User Interface
     */
    private fun initUI() {

        coordinateLayout = findViewById(R.id.parentCoordinateLayout)

        buttonShowToast = findViewById(R.id.buttonShowToast)
        buttonShowSnack = findViewById(R.id.buttonShowSnack)
        buttonShowExitAlert = findViewById(R.id.buttonShowExitAlert)
    }


    /**
     * Extension function to MainActivity
     * to show Toast
     */
    private fun MainActivity.toast(message: String) {
        Toast.makeText(
                this,
                message,
                Toast.LENGTH_SHORT
        ).show()
    }

    /**
     * Extension function to MainActivity to show
     * material design component SnackBar
     */
    private fun MainActivity.snack(message: String) {

        val snack = Snackbar.make(coordinateLayout, message, Snackbar.LENGTH_SHORT)
        snack.show()
    }

    override fun onClick(view: View?) {
        when {
            view?.id == R.id.buttonShowToast -> {
                toast("Hello !! I am toast")
            }
            view?.id == R.id.buttonShowSnack -> {
                snack("Hello !! I am Snack")
            }
            view?.id == R.id.buttonShowExitAlert -> {
                showExitAlert("Exit", "Do you want to close application ?")
            }
        }
    }

    /**
     * Create exit alert dialog
     */
    private fun showExitAlert(title: String, message: String) {

        val builder = AlertDialog.Builder(this)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, index -> finish() })
        builder.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, index -> dialogInterface.dismiss() })

        val exitAlertDialog = builder.create()
        exitAlertDialog?.show()
    }


}

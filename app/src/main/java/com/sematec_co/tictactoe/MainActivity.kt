package com.sematec_co.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.transition.ChangeBounds
import android.support.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.title)
        title.setMinimumHeight(100)

        val root = findViewById<ViewGroup>(android.R.id.content)

        title.setOnClickListener(View.OnClickListener {
            TransitionManager.beginDelayedTransition(root)

        })

        val transition = ChangeBounds()
        transition.interpolator =
                AnticipateOvershootInterpolator(1.0f)
        TransitionManager.beginDelayedTransition(root, transition)




    }
}

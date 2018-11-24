package com.belavia.fare.fare

import android.os.Bundle
import android.app.Activity

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        rangeSeekbar1.setOnRangeSeekbarChangeListener { minValue, maxValue ->
            //            tvMax.setText(String.valueOf(maxValue));
            /* tvMin.setText(String.valueOf(minValue));
             tvMax.setText(String.valueOf(maxValue));*/
        }

        rangeSeekbar1.setOnRangeSeekbarFinalValueListener { minValue, maxValue ->
            //            tvMax.setText(String.valueOf(maxValue));
            /*      tvMin.setText(String.valueOf(minValue));
                  tvMax.setText(String.valueOf(maxValue));*/
        }

    }

}

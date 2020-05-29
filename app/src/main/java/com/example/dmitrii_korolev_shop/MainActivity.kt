package com.example.dmitrii_korolev_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        formLayout()
    }

    private fun formLayout()
    {
        var basket = BasketPresenter()
        totalPriceValue.text = basket.totalPrice().toString()
        discountValue.text = basket.totalDiscount().toString()+'%'
        resultPriceValue.text = basket.totalPriceWithDiscount().toString()
    }
}

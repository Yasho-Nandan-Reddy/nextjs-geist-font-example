package com.example.propertymanagement.ui.payment

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.propertymanagement.R

class PaymentReceiptDialog(context: Context) : Dialog(context) {

    private lateinit var tvPaymentAmount: TextView
    private lateinit var tvPaymentDate: TextView
    private lateinit var tvPaymentMethod: TextView
    private lateinit var btnCloseReceipt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_payment_receipt)

        tvPaymentAmount = findViewById(R.id.tvPaymentAmount)
        tvPaymentDate = findViewById(R.id.tvPaymentDate)
        tvPaymentMethod = findViewById(R.id.tvPaymentMethod)
        btnCloseReceipt = findViewById(R.id.btnCloseReceipt)

        btnCloseReceipt.setOnClickListener {
            dismiss()
        }
    }

    fun setPaymentDetails(amount: String, date: String, method: String) {
        tvPaymentAmount.text = "Amount: $amount"
        tvPaymentDate.text = "Date: $date"
        tvPaymentMethod.text = "Payment Method: $method"
    }
}

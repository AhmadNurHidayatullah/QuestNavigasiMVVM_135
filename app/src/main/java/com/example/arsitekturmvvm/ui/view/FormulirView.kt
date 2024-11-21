package com.example.arsitekturmvvm.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable
fun FormulirView(
    modifier: Modifier = Modifier,
    listJK: List<String>,
    onSubmitClicked: (MutableList<String>) -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var notelepon by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(nama, nim, gender, alamat, email, notelepon)


    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {







    }
}
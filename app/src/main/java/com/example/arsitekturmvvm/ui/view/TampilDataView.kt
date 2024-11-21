package com.example.arsitekturmvvm.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.arsitekturmvvm.model.DataSiswa

@Composable
fun TampilDataView(uiState: DataSiswa, onBackButton : () -> Unit){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp))
    {
        TampilData(x = "Nama", y = uiState.Nama)
        TampilData(x = "NIM", y = uiState.Nim)
        TampilData(x = "Jenis Kelamin", y = uiState.Gender)
        TampilData(x = "Alamat", y = uiState.Alamat)
        TampilData(x = "Gmail", y = uiState.Email)
        TampilData(x = "NoTelepon", y = uiState.NoTelepon)
        Button(onClick = onBackButton) {
            Text(text = "kembali")
        }
    }
}

@Composable
fun TampilData(x : String, y :String){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Text(text = x,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = y,
                modifier = Modifier.weight(2f))
        }
    }
}

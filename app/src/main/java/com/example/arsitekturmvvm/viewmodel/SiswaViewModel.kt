package com.example.arsitekturmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.arsitekturmvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {

    //request
    private val _statusUI = MutableStateFlow(DataSiswa())

    //Response
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                Nama = ls[0],
                Nim = ls[1],
                Gender = ls[2],
                Alamat = ls[3],
                Email = ls[4],
                NoTelepon = ls[5]
            )
        }
    }
}
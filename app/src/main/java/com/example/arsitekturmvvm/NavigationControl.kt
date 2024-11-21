package com.example.arsitekturmvvm

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.arsitekturmvvm.model.JenisKelamin.JenisJK
import com.example.arsitekturmvvm.ui.view.FormulirView
import com.example.arsitekturmvvm.ui.view.TampilDataView
import com.example.arsitekturmvvm.viewmodel.SiswaViewModel


enum class Halaman{
    FORMULIR,
    TAMPILDATA
}


@Composable
fun NavigationControl(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
) {
    val uiState by viewModel.statusUI.collectAsState()
    NavHost(navController = navHost, startDestination = Halaman.FORMULIR.name) {
        composable(
            route = Halaman.FORMULIR.name
        ) {
            val konteks = LocalContext.current
            FormulirView(
                listJK = JenisJK.map { id ->
                    konteks.resources.getString(id)
                },
                onSubmitClicked = {
                    viewModel.saveDataSiswa(it)
                    navHost.navigate(Halaman.TAMPILDATA.name)
                },
                modifier = modifier
            )
        }
        composable(
            route = Halaman.TAMPILDATA.name
        ) {
            TampilDataView(
                uiState = uiState,
                onBackButton = {
                    navHost.popBackStack()
                },
            )
        }
    }
}

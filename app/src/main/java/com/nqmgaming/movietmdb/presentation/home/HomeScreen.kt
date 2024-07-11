package com.nqmgaming.movietmdb.presentation.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph

@Composable
@Destination<RootGraph>(start = true)
fun HomeScreen() {
    Text(text = "Home")
}
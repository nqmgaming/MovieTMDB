package com.nqmgaming.movietmdb.presentation

import android.content.ClipData.Item
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun StandardScaffold(
    navController: NavController,
    showBottomBar: Boolean = true,
    items: List<BottomNavItem> = listOf(
        BottomNavItem.Home
    )
) {

}
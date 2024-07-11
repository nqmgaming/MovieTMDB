package com.nqmgaming.movietmdb.presentation

import com.nqmgaming.movietmdb.R
import com.ramcosta.composedestinations.generated.destinations.HomeScreenDestination

sealed class BottomNavItem(
    val title: String,
    val icon: Int,
    val route: String
) {
    data object Home : BottomNavItem(
        title = "Home",
        icon = R.drawable.ic_home,
        route = HomeScreenDestination.route
    )
}
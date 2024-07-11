package com.nqmgaming.movietmdb.presentation

import com.nqmgaming.movietmdb.R
import com.ramcosta.composedestinations.generated.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.generated.destinations.SearchScreenDestination

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
    data object Search : BottomNavItem(
        title = "Search",
        icon = R.drawable.ic_search,
        route = SearchScreenDestination.route
    )
}
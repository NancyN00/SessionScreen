package com.example.onesessionscreen.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PersonAddAlt1
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItems(
    val label : String,
    val icon : ImageVector,
    val route : String
)

val listOfItems:List<BottomNavItems> = listOf(
    BottomNavItems(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),

    BottomNavItems(
        label = "1:1 Sessions",
        icon = Icons.Default.CalendarToday,
        route = Screens.OneOneSession.name
    ),

    BottomNavItems(
        label = "Search",
        icon = Icons.Default.Search,
        route = Screens.SearchScreen.name
    ),

    BottomNavItems(
        label = "Group Sessions",
        icon = Icons.Default.PersonAddAlt1,
        route = Screens.GroupScreen.name
    ),


)






package the.commute.medmate.navigation.utils.bottombarUtils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Home
import androidx.compose.ui.graphics.vector.ImageVector
import the.commute.medmate.R

data class BottombarNavItems(
    val label:String ="",
    val icon:Int = R.drawable.home,
    val route:String =""
){
    companion object{
        fun bottomNavItems():List<BottombarNavItems>{
            return listOf(
                BottombarNavItems(
                    label="Home",
                    icon = R.drawable.home,
                    route = "HomeScreen"
                ),
                BottombarNavItems(
                    label ="Doctor",
                    icon = R.drawable.stethoscope,
                    route ="DoctorScreen"
                ),
                BottombarNavItems(
                    label="Profile",
                    icon= R.drawable.user,
                    route ="EditProfileScreen"
                ),
                BottombarNavItems(
                    label ="Settings",
                    icon = R.drawable.setting,
                    route ="SettingsScreen"
                )
            )
        }

    }
}

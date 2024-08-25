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
                    label=Routes.Home.name,
                    icon = R.drawable.home,
                    route = Routes.Home.name
                ),
                BottombarNavItems(
                    label =Routes.Doctor.name,
                    icon = R.drawable.stethoscope,
                    route =Routes.Doctor.name
                ),
                BottombarNavItems(
                    label=Routes.Profile.name,
                    icon= R.drawable.user,
                    route =Routes.Profile.name
                ),
                BottombarNavItems(
                    label =Routes.Settings.name,
                    icon = R.drawable.setting,
                    route =Routes.Settings.name
                )
            )
        }

    }
}

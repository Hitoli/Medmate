package the.commute.medmate.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import the.commute.medmate.features.bottomscreens.doctor_feature.Doctor
import the.commute.medmate.features.bottomscreens.medicine_feature.Medicine
import the.commute.medmate.features.bottomscreens.medicine_feature.utils.MedicineCard
import the.commute.medmate.features.bottomscreens.profile_feature.Profile
import the.commute.medmate.features.bottomscreens.settings_feature.Settings
import the.commute.medmate.navigation.utils.BottomBar
import the.commute.medmate.navigation.utils.FABbutton
import the.commute.medmate.navigation.utils.Topbar
import the.commute.medmate.navigation.utils.bottombarUtils.BottombarNavItems
import the.commute.medmate.navigation.utils.bottombarUtils.Routes

@Composable
fun NavMap(navController:NavHostController = rememberNavController()) {
    var navItemSelected by remember {
        mutableIntStateOf(0)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(bottomBar = {
            BottomBar(getNavIndex =navItemSelected, onNavIndexSelected = {
                navItemSelected = it
                when(navItemSelected){
                    Routes.Home.index -> navController.navigate(Routes.Home.name)
                    Routes.Doctor.index -> navController.navigate(Routes.Doctor.name)
                    Routes.Profile.index -> navController.navigate(Routes.Profile.name)
                    Routes.Settings.index -> navController.navigate(Routes.Settings.name)
                }
            } )
        }, topBar = {
            Topbar()
        }, floatingActionButton = {
            if (navItemSelected==Routes.Home.index){
                FABbutton()
            }

        }) {
            NavHost(navController = navController, startDestination =Routes.Home.name ){
                val pad = it

                composable(route = Routes.Home.name){
                    Medicine(pad)
                }
                composable(route = Routes.Settings.name){
                    Settings(pad)
                }
                composable(route= Routes.Profile.name){
                    Profile(pad)
                }
                composable(route = Routes.Doctor.name){
                    Doctor(pad)
                }
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewNavMap() {
    NavMap()
}
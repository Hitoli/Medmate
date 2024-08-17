package the.commute.medmate.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import the.commute.medmate.features.bottomscreens.doctor_feature.Doctor
import the.commute.medmate.features.bottomscreens.medicine_feature.Medicine
import the.commute.medmate.features.bottomscreens.medicine_feature.utils.MedicineCard
import the.commute.medmate.features.bottomscreens.profile_feature.Profile
import the.commute.medmate.features.bottomscreens.settings_feature.Settings
import the.commute.medmate.navigation.utils.BottomBar
import the.commute.medmate.navigation.utils.FABbutton
import the.commute.medmate.navigation.utils.Topbar

@Composable
fun NavMap() {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(bottomBar = {
            BottomBar()
        }, topBar = {
            Topbar()
        }, floatingActionButton = {
            FABbutton()
        }) {
            val pad = it
            Settings()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewNavMap() {
    NavMap()
}
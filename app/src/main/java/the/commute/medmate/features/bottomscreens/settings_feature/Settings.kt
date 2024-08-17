package the.commute.medmate.features.bottomscreens.settings_feature

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import the.commute.medmate.features.bottomscreens.settings_feature.utils.SettingHeading
import the.commute.medmate.features.bottomscreens.settings_feature.utils.SettingToggle

@Composable
fun Settings() {
    Box(modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp)){
        LazyColumn {
            item {
                SettingHeading()
            }
            item {
                SettingToggle()
            }
            item {
                SettingToggle()
            }
            item {
                SettingHeading()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettings() {
    Settings()
}
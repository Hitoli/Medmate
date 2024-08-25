package the.commute.medmate.features.bottomscreens.settings_feature

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import the.commute.medmate.features.bottomscreens.settings_feature.utils.SettingHeading
import the.commute.medmate.features.bottomscreens.settings_feature.utils.SettingLogout
import the.commute.medmate.features.bottomscreens.settings_feature.utils.SettingMore
import the.commute.medmate.features.bottomscreens.settings_feature.utils.SettingToggle

@Composable
fun Settings(getPaddingValues: PaddingValues) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(top = getPaddingValues.calculateTopPadding(), bottom = getPaddingValues.calculateBottomPadding(), start = 20.dp, end = 20.dp)){
        LazyColumn {
            item {
                SettingHeading()
                Spacer(modifier = Modifier.height(12.dp))
            }
            item {
                SettingToggle()
            }
            item {
                SettingToggle()
                Spacer(modifier = Modifier.height(12.dp))

            }
            item {
                SettingHeading()
                Spacer(modifier = Modifier.height(12.dp))

            }
            item {
                SettingMore()
            }
            item{
                SettingMore()
                Spacer(modifier = Modifier.height(12.dp))

            }
            item{
                SettingHeading()
                Spacer(modifier = Modifier.height(12.dp))

            }
            item{
                SettingMore()
            }
            item{
                SettingMore()
            }
            item{
                SettingMore()
            }
            item{
                SettingMore()
            }
            item{
                SettingMore()
            }
            item {
                SettingLogout()
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettings() {
    Settings(getPaddingValues = PaddingValues(50.dp))
}
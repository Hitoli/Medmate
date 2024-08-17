package the.commute.medmate.features.bottomscreens.settings_feature.utils

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.IconToggleButtonColors
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import the.commute.medmate.ui.theme.BaseColor
import the.commute.medmate.ui.theme.fontFamilyRethink

@Composable
fun SettingToggle() {

    Row(
        modifier = Modifier.fillMaxWidth().height(50.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Notification",
            style = TextStyle(
                fontSize = 16.sp, color = Color.Black,
                fontFamily = fontFamilyRethink,
                letterSpacing = TextUnit(
                    0.5f,
                    TextUnitType.Sp
                )
            )
        )
        Switch(checked = true, onCheckedChange = {}, colors = SwitchDefaults.colors(checkedTrackColor = BaseColor))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettingToggle() {
    SettingToggle()
}
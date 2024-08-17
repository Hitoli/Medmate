package the.commute.medmate.features.bottomscreens.settings_feature.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.Icon
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
import the.commute.medmate.ui.theme.fontFamilyRethink

@Composable
fun SettingLogout() {
    Box(modifier = Modifier.fillMaxWidth().height(50.dp)){
        Row(modifier= Modifier, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start) {
            Icon(imageVector = Icons.Outlined.KeyboardArrowRight, contentDescription ="Logout")
            Text(
                text = "Logout",
                style = TextStyle(
                    fontSize = 16.sp, color = Color.Black,
                    fontFamily = fontFamilyRethink,
                    letterSpacing = TextUnit(
                        0.5f,
                        TextUnitType.Sp
                    )
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettingLogout() {
    SettingLogout()
}
package the.commute.medmate.features.bottomscreens.settings_feature.utils

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun SettingHeading() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
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
            Spacer(modifier = Modifier.width(16.dp))
            Box(modifier = Modifier
                .background(Color.Black.copy(alpha = 0.5f))
                .fillMaxWidth()
                .height(1.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettingsHead() {
    SettingHeading()
}
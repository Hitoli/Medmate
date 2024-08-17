package the.commute.medmate.features.bottomscreens.profile_feature.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
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
fun MenuItems() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Your Name",
            style = TextStyle(fontSize = 16.sp, color = Color.Black.copy(alpha = 0.7f)),
            fontFamily = fontFamilyRethink,
            letterSpacing = TextUnit(
                0.5f,
                TextUnitType.Sp
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = "", onValueChange = {}, maxLines = 1, placeholder = {
            Text(
                text = "Ex - Hitesh Kohli",
                style = TextStyle(fontSize = 16.sp, color = Color.Black.copy(alpha = 0.7f)),
                fontFamily = fontFamilyRethink,
                letterSpacing = TextUnit(
                    0.5f,
                    TextUnitType.Sp
                )
            )
        }, modifier = Modifier.fillMaxWidth())

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMenuItems() {
    MenuItems()
}
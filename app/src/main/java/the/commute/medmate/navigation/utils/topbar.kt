package the.commute.medmate.navigation.utils

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import the.commute.medmate.R
import the.commute.medmate.ui.theme.BaseColor
import the.commute.medmate.ui.theme.fontFamilyRethink

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar() {
    CenterAlignedTopAppBar(
        title = { Text(
        text = "Medicines",
        style = MaterialTheme.typography.titleSmall,
        fontFamily = fontFamilyRethink,
        letterSpacing = TextUnit(
            0.5f,
            TextUnitType.Sp
        )

    ) }, navigationIcon = {

            Row(modifier = Modifier.width(100.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = ImageVector.vectorResource(R.drawable.medmatelogo), contentDescription ="medmate", tint = BaseColor )

            }
                Text(
                    text = "Med Mate",
                    style = TextStyle(fontSize = 8.sp, color = Color.Black),
                    fontFamily = fontFamilyRethink,
                    letterSpacing = TextUnit(
                        0.5f,
                        TextUnitType.Sp
                    ))
        }
        }, actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.Notifications, contentDescription ="medmate",tint = BaseColor  )
            }
        })
}

@Preview(showBackground = true)
@Composable
fun PreviewTopbar() {
    Topbar()
}
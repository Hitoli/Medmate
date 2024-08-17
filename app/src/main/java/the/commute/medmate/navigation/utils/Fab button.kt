package the.commute.medmate.navigation.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import the.commute.medmate.R
import the.commute.medmate.ui.theme.BaseColor
import the.commute.medmate.ui.theme.fontFamilyRethink

@Composable
fun FABbutton() {
    FloatingActionButton(
        containerColor = BaseColor,
        modifier = Modifier
            .padding(10.dp)
            .width(200.dp),
        onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp)
    ) {
        Row(modifier = Modifier.padding(1.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
            Icon(imageVector = ImageVector.vectorResource(R.drawable.medmatelogo), contentDescription ="medmate", tint = Color.White)
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = " Add Medicine",
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.White,
                    fontFamily = fontFamilyRethink
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FABbuttonPreview() {
    FABbutton()
}
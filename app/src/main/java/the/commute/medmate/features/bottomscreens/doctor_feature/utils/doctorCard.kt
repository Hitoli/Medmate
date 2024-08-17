package the.commute.medmate.features.bottomscreens.doctor_feature.utils

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import the.commute.medmate.R
import the.commute.medmate.ui.theme.BaseColor
import the.commute.medmate.ui.theme.Snow
import the.commute.medmate.ui.theme.fontFamilyRethink

@Composable
fun DoctorCard() {

    Column(
        modifier = Modifier
            .padding(10.dp)
            .background(
                Brush.linearGradient(
                    start = Offset.Zero, end = Offset.Infinite,
                    colors = listOf(Snow, BaseColor.copy(alpha = 0.06f))
                ),
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                width = 0.1.dp,
                color = Color.Black.copy(alpha = 0.1f),
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(id = R.drawable.doctor),
                contentDescription = "Doctor Image",
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
            )
            Column(modifier = Modifier.padding(10.dp)) {
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Name",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.Black.copy(alpha = 0.5f),
                            fontFamily = fontFamilyRethink
                        )
                    )
                    Text(
                        text = "Hitesh Kohli", style = TextStyle(
                            fontSize = 16.sp, color = Color.Black, letterSpacing = TextUnit(
                                0.5f,
                                TextUnitType.Sp
                            )
                        ), fontFamily = fontFamilyRethink
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Label",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.Black.copy(alpha = 0.5f),
                            fontFamily = fontFamilyRethink,
                        )
                    )
                    Text(
                        text = "Neurosurgeon",
                        style = TextStyle(fontSize = 16.sp, color = Color.Black),
                        fontFamily = fontFamilyRethink,
                        letterSpacing = TextUnit(
                            0.5f,
                            TextUnitType.Sp
                        )
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Appointment Available",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.Black.copy(alpha = 0.5f),
                            fontFamily = fontFamilyRethink
                        )
                    )
                    Text(
                        text = "5 PM | Wed 24 July",
                        style = TextStyle(fontSize = 16.sp, color = Color.Black),
                        fontFamily = fontFamilyRethink,
                        letterSpacing = TextUnit(
                            0.5f,
                            TextUnitType.Sp
                        )
                    )
                }
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Button( colors = ButtonDefaults.buttonColors(containerColor = BaseColor),
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f),
                onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp)
            ) {
                Row(modifier = Modifier.padding(1.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
                    Icon(imageVector = Icons.Outlined.Create, contentDescription ="medmate", tint = Color.White)
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Add Prescription",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.White,
                            fontFamily = fontFamilyRethink
                        )
                    )
                }
            }

            OutlinedButton(modifier = Modifier
                .padding(10.dp)
                .weight(1f),
                onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp), border = BorderStroke(1.dp, color= BaseColor)
            ) {
                Row(modifier = Modifier.padding(1.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Book Appointment",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = BaseColor,
                            fontFamily = fontFamilyRethink
                        )
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewDoctorHeader() {
    DoctorCard()
}
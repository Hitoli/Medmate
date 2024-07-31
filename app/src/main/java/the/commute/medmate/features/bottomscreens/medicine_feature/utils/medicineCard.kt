package the.commute.medmate.features.bottomscreens.medicine_feature.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun MedicineCard() {
    Box(
        modifier = Modifier
            .padding(10.dp)
            .background(
                Brush.linearGradient(
                    start = Offset.Zero, end = Offset.Infinite,
                    colors = listOf(Snow, BaseColor.copy(alpha = 0.06f))
                ),
                shape = RoundedCornerShape(2.dp)
            )
            .border(
                width = 0.1.dp,
                color = Color.Black.copy(alpha = 0.1f),
                shape = RoundedCornerShape(2.dp)
            )
    ) {
        Row(
            modifier = Modifier
                .width(150.dp)
                .height(80.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(id = R.drawable.medicineexample),
                contentDescription = "medicine",
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )
            Column {
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Name",
                        style = TextStyle(
                            fontSize = 6.sp,
                            color = Color.Black.copy(alpha = 0.5f),
                            fontFamily = fontFamilyRethink
                        )
                    )
                    Text(
                        text = "Strepcilis", style = TextStyle(
                            fontSize = 6.sp, color = Color.Black, letterSpacing = TextUnit(
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
                            fontSize = 6.sp,
                            color = Color.Black.copy(alpha = 0.5f),
                            fontFamily = fontFamilyRethink,
                        )
                    )
                    Text(
                        text = "Cough tablet",
                        style = TextStyle(fontSize = 6.sp, color = Color.Black),
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
                        text = "Next Dose",
                        style = TextStyle(
                            fontSize = 6.sp,
                            color = Color.Black.copy(alpha = 0.5f),
                            fontFamily = fontFamilyRethink
                        )
                    )
                    Text(
                        text = "5 PM",
                        style = TextStyle(fontSize = 6.sp, color = Color.Black),
                        fontFamily = fontFamilyRethink,
                        letterSpacing = TextUnit(
                            0.5f,
                            TextUnitType.Sp
                        )
                    )
                }
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun MedicineCardPreview() {
    MedicineCard()
}
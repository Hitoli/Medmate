package the.commute.medmate.features.bottomscreens.medicine_feature.utils

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
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.ButtonColors
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
                painter = painterResource(id = R.drawable.medicineexample),
                contentDescription = "medicine",
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
                        text = "Strepsils", style = TextStyle(
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
                        text = "Cough tablet",
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
                        text = "Next Dose",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = Color.Black.copy(alpha = 0.5f),
                            fontFamily = fontFamilyRethink
                        )
                    )
                    Text(
                        text = "5 PM",
                        style = TextStyle(fontSize = 16.sp, color = Color.Black),
                        fontFamily = fontFamilyRethink,
                        letterSpacing = TextUnit(
                            0.5f,
                            TextUnitType.Sp
                        )
                    )
                }
            }

            Column(modifier = Modifier, horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.SpaceEvenly) {
                OutlinedButton(onClick = { /*TODO*/ }, border = BorderStroke(1.dp, color = Color.Black), modifier = Modifier.padding(1.dp), shape = RoundedCornerShape(10.dp)) {
                    Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
                        Text(
                            text = "Learn more", style = TextStyle(
                                fontSize = 10.sp, color = Color.Black
                            ), fontFamily = fontFamilyRethink
                        )
                        Icon(imageVector = Icons.Outlined.KeyboardArrowRight, contentDescription ="Learn more", tint = Color.Black, modifier = Modifier.size(16.dp))
                    }

                }
              OutlinedButton(onClick = { /*TODO*/ }, border = BorderStroke(1.dp, color = Color.Black), modifier = Modifier.padding(1.dp), shape = RoundedCornerShape(10.dp)) {
                  Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
                      Text(
                          text = "Schedule", style = TextStyle(
                              fontSize = 10.sp, color = Color.Black
                          ), fontFamily = fontFamilyRethink
                      )
                      Icon(imageVector = Icons.Outlined.KeyboardArrowRight, contentDescription ="Learn more", tint = Color.Black, modifier = Modifier.size(16.dp))
                  }

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
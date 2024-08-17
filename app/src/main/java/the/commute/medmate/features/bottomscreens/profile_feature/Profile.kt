package the.commute.medmate.features.bottomscreens.profile_feature

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import the.commute.medmate.features.bottomscreens.profile_feature.utils.MenuItems
import the.commute.medmate.ui.theme.BaseColor
import the.commute.medmate.ui.theme.fontFamilyRethink

@Composable
fun Profile() {
    Box(modifier = Modifier.fillMaxSize()) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 40.dp, vertical = 50.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start
        ) {
            item {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.doctor),
                        contentDescription = "ProfileImage",
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(200.dp)
                            .clip(shape = RoundedCornerShape(500.dp))
                            .aspectRatio(1f)
                            .background(color = Color.Black)
                            .fillMaxSize()
                    )
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(color = BaseColor,RoundedCornerShape(50.dp)).align(Alignment.BottomEnd)
                    ) {
                        Image(
                            imageVector = ImageVector.vectorResource(R.drawable.editprofilepic),
                            contentDescription = "editProfile",
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
            item {
                MenuItems()
            }
            item {
                MenuItems()
            }
            item {
                MenuItems()
            }
            item {
                MenuItems()
            }
            item {
                Text(
                    text = "Change Password ?",
                    style = TextStyle(
                        fontSize = 16.sp, color = BaseColor,
                        fontFamily = fontFamilyRethink,
                        letterSpacing = TextUnit(
                            0.5f,
                            TextUnitType.Sp
                        )
                    )
                )
            }
            item {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Button(
                        modifier = Modifier
                            .padding(10.dp)
                            .height(50.dp)
                            .width(250.dp)
                            .align(Alignment.Center),
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            BaseColor
                        )
                    ) {

                        Text(
                            text = " Update",
                            style = TextStyle(
                                fontSize = 12.sp,
                                color = Color.White,
                                fontFamily = fontFamilyRethink
                            )
                        )

                    }
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfile() {
    Profile()
}
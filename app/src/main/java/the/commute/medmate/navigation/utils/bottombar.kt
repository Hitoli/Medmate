package the.commute.medmate.navigation.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import the.commute.medmate.navigation.utils.bottombarUtils.BottombarNavItems
import the.commute.medmate.ui.theme.BaseColor
import the.commute.medmate.ui.theme.fontFamilyRethink
import the.commute.medmate.ui.theme.navColor

@Composable
fun BottomBar(onNavIndexSelected:(Int)->Unit,getNavIndex:Int) {
    val interactionSource  = remember {
        MutableInteractionSource()
    }

    NavigationBar(containerColor = Color.White) {
        BottombarNavItems.bottomNavItems().forEachIndexed { navIndex, bottomBarItems ->
            NavigationBarItem(
                selected = navIndex == getNavIndex,
                onClick = {
                    onNavIndexSelected(navIndex)
                },
                icon = {
                    Column(modifier = Modifier
                        .background(
                            color = if (navIndex == getNavIndex) navColor else Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Icon(
                            painter = painterResource(id = bottomBarItems.icon),
                            contentDescription = bottomBarItems.label
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = bottomBarItems.label,
                            style = TextStyle(fontSize = 12.sp, color = if (navIndex==getNavIndex) BaseColor else Color.Black),
                            fontFamily = fontFamilyRethink,
                            letterSpacing = TextUnit(
                                0.5f,
                                TextUnitType.Sp
                            )

                        )
                    }

                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = BaseColor,
                    indicatorColor = Color.White,
                ), modifier = Modifier.indication(interactionSource,null)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomBar() {
    BottomBar(onNavIndexSelected = {}, getNavIndex = 1)
}
package the.commute.medmate.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import the.commute.medmate.navigation.utils.BottomBar

@Composable
fun NavMap() {
    Box(modifier = Modifier.fillMaxSize()){
        Scaffold(bottomBar = {
            BottomBar()
        }) {
            val pad = it
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNavMap() {
    NavMap()
}
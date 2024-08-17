package the.commute.medmate.features.bottomscreens.medicine_feature

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
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
import the.commute.medmate.features.bottomscreens.medicine_feature.utils.MedicineCard
import the.commute.medmate.ui.theme.BaseColor
import the.commute.medmate.ui.theme.Snow
import the.commute.medmate.ui.theme.fontFamilyRethink

@Composable
fun Medicine() {
    Box(
        modifier = Modifier.background(Color.White).fillMaxSize()
    ) {
        LazyColumn(
            contentPadding = PaddingValues(
                top = 50.dp,
                bottom = 50.dp
            )
        ) {
            items(10) {
                MedicineCard()
            }
        }

    }
}




@Preview(showBackground = true)
@Composable
fun MedicinePreview() {
    Medicine()
}
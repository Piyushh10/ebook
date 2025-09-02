package com.example.bookapp.presentation.UIcomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.SubcomposeAsyncImage

@Composable
fun Bookcart(
    imageUrl : String,
    title : String,
    author : String = null.toString(),
    description : String,
    navHostController: NavHostController,
    bookUrl : String
) {
    Card(
        modifier=Modifier.fillMaxWidth()
            .padding(8.dp)
            .clickable {
                navHostController.navigate(
                    TODO()
                )
            }
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
                .height(150.dp)
                .padding(8.dp)
        ) {
            SubcomposeAsyncImage(
                model= imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
                    .clip(RoundedCornerShape(8.dp)),
                loading = {
                    TODO()
                },
                error = {
                    Text(
                        "Error loading image"
                    )
                }
            )

            Spacer(modifier=Modifier.size(8.dp))

            Column(){

            }
        }
    }
}
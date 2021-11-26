package com.example.androidhomework


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import com.example.androidhomework.R.drawable.*
import java.time.format.TextStyle


@OptIn(ExperimentalUnitApi::class)
@Composable

internal fun CorpseBrideScreen() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {

      Box(
          modifier = Modifier.fillMaxWidth(),
          contentAlignment = Alignment.BottomStart

      ) {
          Image(
              painter = painterResource(id = ic_header_image),
              contentDescription = ""
          )

          Text(
              text = stringResource(id = R.string.movie_title),
              color = Color.White,
              fontSize = TextUnit(24f, TextUnitType.Sp),
              fontWeight = FontWeight.Bold,
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(
                      start = dimensionResource(id = R.dimen.default_margin),
                      end = dimensionResource(id = R.dimen.default_margin),
                      bottom = dimensionResource(id = R.dimen.default_margin)
                  )

          )
      }
        Row(
            horizontalArrangement =  Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabelView(
                    modifier = Modifier.padding(start = 16.dp),
                    text = "Animation"
                )
                LabelView(
                    modifier = Modifier.padding(start = 8.dp),
                    text = "Drama"
                )
                LabelView(
                    modifier = Modifier.padding(start = 8.dp),
                    text = "Family"
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(end = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "7/10",
                        color = Color.LightGray,
                        modifier = Modifier
                            .padding(
                                start = 20.dp
                            )

                    )
                    Image(
                        painter = painterResource(id = ic_star_image),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(end = 12.dp)
                    )
                }
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 19.dp,
                    top = 25.dp
                )
        ) {
            Text(
                text = "Directors",
                color = Color.DarkGray
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 8.dp
                    )
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    text = "Tim Burton",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    text = "Mike Johnson",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 19.dp,
                    top = 6.dp
                )
        ) {
            Text(
                text = "Stars",
                color = Color.DarkGray
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp)

            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    text = "Johnny Depp",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,

                )
                Text(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    text = "Helena Bonham Carter",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    text = "Emily Watson",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

            }

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = dimensionResource(id = R.dimen.default_margin),
                    top = dimensionResource(id = R.dimen.default_margin),
                    end = dimensionResource(id = R.dimen.default_margin),
                    bottom = dimensionResource(id = R.dimen.default_margin)
                )
        ) {
            Text(
                text = MovieDescription,
                fontSize = 16.sp,
            )
        }
        Button(onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(PastelBlue)
                .clip(RoundedCornerShape(dimensionResource(id = R.dimen.corner_radius)))
                .padding(
                    start = dimensionResource(id = R.dimen.default_margin),
                    bottom = dimensionResource(id = R.dimen.default_margin),
                    end = dimensionResource(id = R.dimen.default_margin),
                )
            ) {
                Text(
                    text = "Play movie",
                    fontSize = 16.sp,
                    color = Color.White
                )
        }
    }
}


@Preview()
@Composable

fun CorpseBrideScreenPreview() {
    CorpseBrideScreen()
}

@Composable
fun LabelView(
    modifier: Modifier = Modifier,
    text: String,
) {
    Box(
        modifier = modifier
            .defaultMinSize(minWidth = 70.dp)
            .background(PastelBlue)
            .clip(RoundedCornerShape(dimensionResource(id = R.dimen.corner_radius)))
    ) {
        Text(
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 12.dp),
            text = text,
        )
    }
}
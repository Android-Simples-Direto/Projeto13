package com.projeto.projeto13

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout


class IntroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            perfil()
        }

    }

    @Preview
    @Composable
    fun perfil() {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White)
        ) {
            val (img, img2, logo, today, text) = createRefs()

            Image(painter = painterResource(id = R.drawable.top_tight),
                contentDescription = "",
                modifier = Modifier

                    .constrainAs(img) {
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                    })

            Text(
                text = "Agenda \n" + "Pessoal",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#32357a")),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .constrainAs(text) {
                        top.linkTo(logo.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(img.bottom)
                    }
            )

            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .padding(64.dp)
                    .constrainAs(logo) {
                        end.linkTo(parent.end)
                        start.linkTo(parent.start)
                        top.linkTo(logo.bottom)
                        bottom.linkTo(img2.top)
                    })

            Image(painter = painterResource(id = R.drawable.bottom_left),
                contentDescription = "",
                modifier = Modifier
                    .constrainAs(img2)
                    {
                        start.linkTo(parent.start)
                        bottom.linkTo(parent.bottom)
                    })

            Image(painter = painterResource(id = R.drawable.today), contentDescription = "",
                modifier = Modifier
                    .padding(top = 16.dp)
                    .constrainAs(today) {
                        end.linkTo(parent.end)
                        start.linkTo(parent.start)
                        top.linkTo(logo.bottom)
                        bottom.linkTo(img2.top)
                    }
            )
        }
    }
}
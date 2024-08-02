package com.projeto.projeto13

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        setContent {
            perfil()
        }
    }

    @Preview
    @Composable
    fun perfil() {
        Column(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ConstraintLayout(
                Modifier
                    .height(250.dp)
                    .background(color = Color(android.graphics.Color.parseColor("#314486")))
            ) {

                val (topImg, perfil, titulo, voltar, caneta) = createRefs()

                Image(painterResource(id = R.drawable.arc_3), null,
                    Modifier
                        .fillMaxWidth()
                        .constrainAs(topImg) { //Modificador
                            bottom.linkTo(parent.bottom) //Link para
                        })

                Text(
                    text = "Perfil",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    ),

                    modifier = Modifier
                        .constrainAs(titulo) {
                            top.linkTo(parent.top, margin = 80.dp)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                )

                Image(painterResource(id = R.drawable.user_2), null,
                    Modifier
                        .fillMaxWidth()
                        .constrainAs(perfil) {
                            bottom.linkTo(topImg.bottom)
                        }
                )

                Image(painterResource(id = R.drawable.back), null,
                    Modifier
                        .constrainAs(voltar) {
                            top.linkTo(parent.top, margin = 24.dp)
                            start.linkTo(parent.start, margin = 24.dp)
                        }
                        .clickable { }
                )
                Image(painterResource(id = R.drawable.write), null,
                    Modifier
                        .constrainAs(caneta) {
                            top.linkTo(parent.top, margin = 160.dp)
                            start.linkTo(parent.start, margin = 230.dp)
                        }
                        .clickable { }
                )
            }

            Text(
                text = "Socorro Almeida",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp),
                color = Color(android.graphics.Color.parseColor("#32357a"))
            )

            Text(
                text = "socorroalmeida@gmail.com",
                fontSize = 18.sp,
                color = Color(android.graphics.Color.parseColor("#747679"))
            )

            //Início da Linha
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp, top = 32.dp, bottom = 10.dp)
                    .height(55.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.btn_1),
                        null,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f) //Espaçamento total da coluna
                        .clickable { }
                ) {
                    Text(
                        text = "Notificação",
                        color = Color(android.graphics.Color.parseColor("#635F5F")),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.arrow),
                        null,
                        Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }
            } //Fim da Linha

            //Início da Linha
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                    .height(55.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.btn_2),
                        null,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f) //Espaçamento total da coluna
                        .clickable { }
                ) {
                    Text(
                        text = "Calendário",
                        color = Color(android.graphics.Color.parseColor("#635F5F")),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.arrow),
                        null,
                        Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }
            } //Fim da Linha

            //Início da Linha
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                    .height(55.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.btn_1),
                        null,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f) //Espaçamento total da coluna
                        .clickable { }
                ) {
                    Text(
                        text = "Galeria",
                        color = Color(android.graphics.Color.parseColor("#635F5F")),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.arrow),
                        null,
                        Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }
            } //Fim da Linha

            //Início da Linha
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                    .height(55.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.btn_3),
                        null,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f) //Espaçamento total da coluna
                        .clickable { }
                ) {
                    Text(
                        text = "Minha Lista",
                        color = Color(android.graphics.Color.parseColor("#635F5F")),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.arrow),
                        null,
                        Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }
            } //Fim da Linha

            //Início da Linha
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                    .height(55.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.btn_4),
                        null,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f) //Espaçamento total da coluna
                        .clickable { }
                ) {
                    Text(
                        text = "Compartilhar",
                        color = Color(android.graphics.Color.parseColor("#635F5F")),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.arrow),
                        null,
                        Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }
            } //Fim da Linha

            //Início da Linha
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                    .height(55.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(painterResource(id = R.drawable.btn_5),
                        null,
                        modifier = Modifier
                            .padding(end = 5.dp)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .weight(1f)
                        .clickable { }
                ) {
                    Text(
                        text = "Sair",
                        color = Color(android.graphics.Color.parseColor("#635F5F")),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                } //Fim da Linha
            }
        }
    }
}
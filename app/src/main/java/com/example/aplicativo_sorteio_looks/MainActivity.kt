package com.example.aplicativo_sorteio_looks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
/*import androidx.compose.foundation.layout.padding*/
//import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
import com.example.aplicativo_sorteio_looks.ui.theme.AplicativoSorteioLooksTheme

import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat

//import kotlin.random.Random
//import kotlin.random.nextInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        // enableEdgeToEdge()
        setContent {
            AplicativoSorteioLooksTheme {
                SorteioLook()
            }
        }
    }
}

@Composable
fun SorteioLook(modifier: Modifier = Modifier) {

    var acessorio by remember { mutableIntStateOf(0) }
    var camisa by remember { mutableIntStateOf(0) }
    var calca by remember { mutableIntStateOf(0) }
    var casaco by remember { mutableIntStateOf(0) }
    var tenis by remember { mutableIntStateOf(0) }

    // Listas de imagens
    val acessorios = listOf(
        R.drawable.acessorio1,
        R.drawable.acessorio2,
        R.drawable.acessorio3,
        R.drawable.acessorio4,
        R.drawable.acessorio5,
        R.drawable.acessorio6,
        R.drawable.acessorio7,
        R.drawable.acessorio8,
        R.drawable.acessorio9,
        R.drawable.acessorio10,
        R.drawable.acessorio11,
        R.drawable.acessorio12
    )
    val camisas = listOf(
        R.drawable.camisa1,
        R.drawable.camisa2,
        R.drawable.camisa3,
        R.drawable.camisa4,
        R.drawable.camisa5,
        R.drawable.camisa6,
        R.drawable.camisa7,
        R.drawable.camisa8,
        R.drawable.camisa9,
        R.drawable.camisa10,
        R.drawable.camisa11,
        R.drawable.camisa12,
        R.drawable.camisa13
    )
    val calcas = listOf(
        R.drawable.cal_a_1,
        R.drawable.cal_a_2,
        R.drawable.cal_a_3,
        R.drawable.cal_a_4
    )
    val casacos = listOf(
        R.drawable.casaco_2,
        R.drawable.casaco_3,
        R.drawable.casaco_4,
        R.drawable.casaco_5,
        R.drawable.casaco_6,
        R.drawable.casaco_7,
        R.drawable.casaco_8,
        R.drawable.casaco_9,
        R.drawable.casaco_10,
        R.drawable.casaco_11,
        R.drawable.casaco_12,
        R.drawable.casaco_13
    )
    val tenisList = listOf(
        R.drawable.tenis_1,
        R.drawable.tenis_2,
        R.drawable.tenis_3,
        R.drawable.tenis_4,
        R.drawable.tenis_5,
        R.drawable.tenis_6,
        R.drawable.tenis_7,
        R.drawable.tenis_8,
        R.drawable.tenis_2
    )

    val imageModifier = Modifier
        .width(156.dp)
        .height(156.dp)

    Column(
        modifier = modifier
            .background(Color(0xFF2F1D30))
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        Button(
            onClick = {
                acessorio = (acessorios.indices).random()
                camisa = (camisas.indices).random()
                calca = (calcas.indices).random()
                casaco = (casacos.indices).random()
                tenis = (tenisList.indices).random()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFA36A37), // fundo estilo retro
                contentColor = Color(color = 0xFFf9de8e)
            ),
            border = BorderStroke(3.dp, Color.Black), // borda preta grossa estilo pixel
            shape = RectangleShape, // sem arredondamento -> mais "retrô"
            contentPadding = PaddingValues(4.dp), // pouco padding para ficar compacto
            modifier = Modifier
                .width(100.dp)
                .height(50.dp) // tamanho fixo, quadradinho
        ) {
            Text("SORTEAR")
        }

        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFF2F1D30)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Mostrando as 5 imagens sorteadas
            Image(
                painter = painterResource(acessorios[acessorio]),
                contentDescription = "Acessório",
                modifier = Modifier
                    .fillMaxWidth(0.6f)  // 60% da largura
                    .weight(1f)
            )

            Image(
                painter = painterResource(camisas[camisa]),
                contentDescription = "Camisa",
                modifier = Modifier
                    .fillMaxWidth(0.6f)  // 60% da largura
                    .weight(1f)
            )

            Image(
                painter = painterResource(casacos[casaco]),
                contentDescription = "Casaco",
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .weight(1f)
            )

            Image(
                painter = painterResource(calcas[calca]),
                contentDescription = "Calça",
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .weight(1f)
            )

            Image(
                painter = painterResource(tenisList[tenis]),
                contentDescription = "Tênis",
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .weight(1f)
            )
        }
    }
}

/*@Preview(showBackground = true)*/
@Preview(showSystemUi = true)
@Composable
fun PreviewImagemBotao() {
    SorteioLook()
}

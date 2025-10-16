package com.example.questbasiccomposable_056

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataLetakColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 20.dp, start = 20.dp, end = 20.dp)
            .background(Color.LightGray)
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataLetakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataLetakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Ini adalah Box",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun TataLetakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        // Baris 1
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Baris 2
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataLetakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // Kolom 1
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }

        // Kolom 2
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TataLetakBoxColumnRow(modifier: Modifier = Modifier) {
    val gambar = painterResource(id = R.drawable.notasibalok)

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Bagian atas: kombinasi kolom dan row
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1_Row1_Komponen1")
                Text(text = "Col1_Row1_Komponen2")
                Text(text = "Col1_Row1_Komponen3")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1_Row2_Komponen1")
                Text(text = "Col1_Row2_Komponen2")
                Text(text = "Col1_Row2_Komponen3")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Bagian bawah: Box dengan gambar dan teks
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = "Gambar Musik",
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize()
            )

            Text(
                text = "My Music",
                fontSize = 40.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )
        }
    }
}

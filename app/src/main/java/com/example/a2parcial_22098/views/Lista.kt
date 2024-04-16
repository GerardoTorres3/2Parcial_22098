package com.example.a2parcial_22098.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.a2parcial_22098.R
import com.example.a2parcial_22098.Componentes.DataCard
import com.example.a2parcial_22098.viewmodels.PersonaView


@Composable
fun ListView(navController: NavHostController) {

    val viewModel = PersonaView()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "¿Eres Chico o Chica?")
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.oak),
                contentDescription = "Profesor",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
        }

        LazyColumn {
            items(viewModel.getPersonList()) {
                    person ->
                DataCard(navController, person.img, person.trabajo, person.genero, person.edad)
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview_List() {
    ListView(navController = rememberNavController())
}
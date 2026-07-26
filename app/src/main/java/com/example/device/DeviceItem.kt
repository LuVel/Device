package com.example.device

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.device.ui.theme.DeviceTheme
import com.example.device.ui.theme.Typography

@Composable
fun DeviceItemView(device: Device){

    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(end = 16.dp, top = 8.dp, bottom = 8.dp)){

        //Es necesario definir una propiedad a los iconos
        Icon(
            imageVector = Icons.Default.Phone,
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Column {
            Text( text =  device.name,
                style = Typography.headlineMedium
            )
            //Para mostrar o no un null 
            Text( text =  device.data?.color ?: "nullColor",
                style = Typography.bodyMedium)

            if (device.data?.capacity != null){
                Text( text =  device.data.capacity,
                    style = Typography.bodyMedium)
            }
            HorizontalDivider()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DeviceItemViewPreview(){
    DeviceTheme{
        DeviceItemView(
            device = Device(
                1,
                "Pixel 4a",
                Specs(
                    "Black",
                    "64GB"
                )
            )
        )
    }
}
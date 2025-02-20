package com.example.tasks.example

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier


class Text(

){

    fun foo(){}

    companion object{

        var s = "sdf"


    }


}




object Test{

    fun foo1() : Test{
        return Test
    }

    fun foo2() : Test{
        return Test
    }
    fun foo3() : Test{
        return Test
    }
}


fun example(){

    Test
        .foo1()
        .foo2()
        .foo3()

}
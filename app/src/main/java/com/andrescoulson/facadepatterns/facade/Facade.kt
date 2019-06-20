package com.andrescoulson.facadepatterns.facade

import com.andrescoulson.facadepatterns.flavors.Apple
import com.andrescoulson.facadepatterns.flavors.Juice
import com.andrescoulson.facadepatterns.flavors.Orange
import com.andrescoulson.facadepatterns.flavors.Soda

class Facade() {
    private var apple: Product = Apple()
    private var juice: Product = Juice()
    private var soda: Product = Soda()
    private var orange: Product = Orange()


    fun dispenseApple(): Int {
        return this.apple.dispose()
    }

    fun dispenseJuice(): Int {
        return this.juice.dispose()
    }

    fun dispenseOrange(): Int {
        return this.orange.dispose()
    }

    fun dispenseSoda(): Int {
        return this.soda.dispose()
    }
}
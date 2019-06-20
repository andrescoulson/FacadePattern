package com.andrescoulson.facadepatterns.flavors

import com.andrescoulson.facadepatterns.R
import com.andrescoulson.facadepatterns.facade.Product

class Apple: Product {
    override fun dispose(): Int {
        return R.string.apple
    }
}


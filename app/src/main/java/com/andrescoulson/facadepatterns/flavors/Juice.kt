package com.andrescoulson.facadepatterns.flavors

import com.andrescoulson.facadepatterns.R
import com.andrescoulson.facadepatterns.facade.Product

class Juice : Product {
    override fun dispose(): Int {
        return R.string.juice
    }
}


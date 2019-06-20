package com.andrescoulson.facadepatterns.flavors

import com.andrescoulson.facadepatterns.R
import com.andrescoulson.facadepatterns.facade.Product

class Soda : Product {
    override fun dispose(): Int {
        return R.string.soda
    }

}
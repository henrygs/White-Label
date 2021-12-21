package br.com.douglasmotta.whitelabeltutorial.data

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product

class ProductRepository(private val dataSource: ProductDataSource) {

    suspend fun getProduct(): List<Product> = dataSource.getProduct()

    suspend fun uploadProductImage(imageuUri: Uri): String =
        dataSource.uploadProductImage(imageuUri)

    suspend fun createProduct(product: Product): String =
        dataSource.createProduct(product)
}
package br.com.douglasmotta.whitelabeltutorial.data

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val dataSource: ProductDataSource
) {

    suspend fun getProduct(): List<Product> = dataSource.getProduct()

    suspend fun uploadProductImage(imageuUri: Uri): String =
        dataSource.uploadProductImage(imageuUri)

    suspend fun createProduct(product: Product): Product =
        dataSource.createProduct(product)
}
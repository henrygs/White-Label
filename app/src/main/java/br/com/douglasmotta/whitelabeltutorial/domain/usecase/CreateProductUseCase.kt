package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product
import java.io.FileDescriptor

interface CreateProductUseCase {
    suspend operator fun invoke(descriptor: String, prince: Double, imageUri: Uri): Product
}
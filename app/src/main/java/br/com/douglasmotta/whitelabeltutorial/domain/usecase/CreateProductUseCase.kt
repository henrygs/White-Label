package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri
import java.io.FileDescriptor

interface CreateProductUseCase {
    suspend operator fun invoke(descriptor: String, prince: Double, imageUri: Uri): String
}
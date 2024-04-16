package com.example.catsMVI.domain.usecases

import com.example.catsMVI.domain.models.CatFactStates
import kotlinx.coroutines.flow.Flow

interface GetCatRandomFactUseCase {
    suspend operator fun invoke(): Flow<CatFactStates>
}
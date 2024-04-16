package com.example.catsMVI.domain.usecases

import com.example.catsMVI.domain.models.CatFactStates
import com.example.catsMVI.domain.repositories.CatFactRepository
import kotlinx.coroutines.flow.Flow


class GetCatRandomFactUseCaseImpl(
    private val catFactRepository: CatFactRepository
): GetCatRandomFactUseCase {
    override suspend fun invoke(): Flow<CatFactStates> = catFactRepository.getCatRandomFact()
}

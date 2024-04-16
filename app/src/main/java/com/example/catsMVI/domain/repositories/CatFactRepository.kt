package com.example.catsMVI.domain.repositories

import com.example.catsMVI.domain.models.CatFactStates
import kotlinx.coroutines.flow.Flow

/*interface CatFactRepository {
    suspend fun getCatRandomFact(): Flow<CatFactStates>
}*/

interface CatFactRepository {
    suspend fun getCatRandomFact(): Flow<CatFactStates>
}


package com.igluesmik.sopt.network.repository

import androidx.lifecycle.LiveData
import com.igluesmik.sopt.model.Profile
import io.reactivex.Completable
import io.reactivex.Single

interface ProfileRepo {
    fun getProfileById(id : Int) : Single<Profile>

    fun getAll() : LiveData<List<Profile>>

    fun insert(profile : Profile) : Completable

    fun delete(id : Int) : Completable

    fun deleteAll() : Completable
}
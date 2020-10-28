package com.igluesmik.sopt.network.repository

import androidx.lifecycle.LiveData
import com.igluesmik.sopt.model.Profile
import com.igluesmik.sopt.network.local.ProfileDao
import io.reactivex.Completable
import io.reactivex.Single

class ProfileRepoImpl(private val dao: ProfileDao) : ProfileRepo{
    override fun getProfileById(id: Int): Single<Profile>
            = dao.getProfileById(id)

    override fun getAll(): LiveData<List<Profile>>
            = dao.getAll()

    override fun insert(profile: Profile): Completable
            = dao.insert(profile)

    override fun delete(id: Int): Completable
            = dao.delete(id)

    override fun deleteAll(): Completable
            = dao.deleteAll()
}
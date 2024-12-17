package com.example.p10_.ui.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.p10_.repository.RepositoryMhs
import com.example.p10_.ui.navigation.DestinasiDetail

class DetailMhsViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoryMhs: RepositoryMhs,
): ViewModel()
{
    private val _nim: String = checkNotNull(savedStateHandle[DestinasiDetail.NIM])
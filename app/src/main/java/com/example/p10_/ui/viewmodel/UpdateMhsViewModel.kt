package com.example.p10_.ui.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.p10_.repository.RepositoryMhs


class UpdateMhsViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoryMhs: RepositoryMhs
) : ViewModel()

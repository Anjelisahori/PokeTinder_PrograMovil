package com.verastigue.anjeli.poketinder_2025_01

data class PokemonListResponse (
    val count: Int,
    val next: String,
    val results: List<PokemonResponse>
)
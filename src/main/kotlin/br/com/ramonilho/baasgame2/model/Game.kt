package br.com.ramonilho.games.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Game(@Id val id: String? = null,
                var name: String,
                var imageUrl: String,
                var publishYear: Int)
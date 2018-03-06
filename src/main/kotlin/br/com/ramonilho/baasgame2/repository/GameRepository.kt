package br.com.ramonilho.games.repository

import br.com.ramonilho.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : MongoRepository<Game, String> {

    fun findByNameIgnoreCaseContaining(name: String) : List<Game>

}
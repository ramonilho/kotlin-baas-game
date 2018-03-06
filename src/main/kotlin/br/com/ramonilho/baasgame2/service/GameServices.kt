package br.com.ramonilho.games.service

import br.com.ramonilho.games.model.Game
import br.com.ramonilho.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameServices {

    @Autowired
    lateinit var gameRepository : GameRepository

    fun fetchAll() : List<Game> {
        return gameRepository.findAll()
    }

    fun save(game: Game) {
        gameRepository.save(game)
    }

    fun findByName(name: String) : List<Game> {
        return gameRepository.findByNameIgnoreCaseContaining(name)
    }

    fun delete(id: String) {
        gameRepository.deleteById(id)
    }

}
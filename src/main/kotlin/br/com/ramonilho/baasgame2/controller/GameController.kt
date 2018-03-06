package br.com.ramonilho.games.controller

import br.com.ramonilho.games.model.Game
import br.com.ramonilho.games.service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/game")
class GameController {

    @Autowired
    lateinit var gameServices: GameServices

    @GetMapping
    fun fetchAll(): List<Game> {
        return gameServices.fetchAll()
    }

    @GetMapping(value = "/name/{name}")
    fun findByName(@PathVariable(value = "name") name: String) : List<Game> {
        return gameServices.findByName(name = name)
    }

    @PostMapping
    fun save(@RequestBody game: Game) {
        gameServices.save(game)
    }

    @DeleteMapping("id")
    fun remove(@PathVariable("id") id: String) {
        gameServices.delete(id)
    }

}
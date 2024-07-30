package com.example.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.player.PlayerService;

import java.util.ArrayList;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/{playerId}")
    public Player getPlayerById(@PathVariable int playerId) {
        return playerService.getPlayerById(playerId);
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/{playerId}")
    public Player updatePlayer(@PathVariable int playerId, @RequestBody Player player) {
        return playerService.updatePlayer(playerId, player);
    }

    @DeleteMapping("/{playerId}")
    public void deletePlayer(@PathVariable int playerId) {
        playerService.deletePlayer(playerId);
    }
}

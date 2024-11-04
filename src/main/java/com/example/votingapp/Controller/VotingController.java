package com.example.votingapp.Controller;


import com.example.votingapp.Service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VotingController {

    @Autowired
    private VotingService votingService;

    @PostMapping("/entercandidate")
    public String enterCandidate(@RequestParam String name) {
        return votingService.addCandidate(name) ?
                "Candidate added successfully" :
                "Candidate already exists";
    }

    @PostMapping("/castvote")
    public String castVote(@RequestParam String name) {
        return votingService.castVote(name) ?
                "Vote cast successfully" :
                "Candidate not found";
    }

    @GetMapping("/countvote")
    public String countVote(@RequestParam String name) {
        Integer voteCount = votingService.getVoteCount(name);
        return (voteCount != null) ?
                "Vote count for " + name + " is " + voteCount :
                "Candidate not found";
    }

    @GetMapping("/listvote")
    public Map<String, Integer> listVote() {
        return votingService.getAllVotes();
    }

    @GetMapping("/getwinner")
    public String getWinner() {
        Optional<String> winner = votingService.getWinner();
        return ((Optional<?>) winner).map(name -> "The winner is " + name)
                .orElse("No candidates have received votes");
    }
}

package com.example.votingapp.Service;


import com.example.votingapp.Model.Candidate;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class VotingService {
    private final Map<String, Candidate> candidates = new ConcurrentHashMap<>();

    public boolean addCandidate(String name) {
        if (candidates.containsKey(name)) return false;
        candidates.put(name, new Candidate(name));
        return true;
    }

    public boolean castVote(String name) {
        Candidate candidate = candidates.get(name);
        if (candidate == null) return false;
        candidate.incrementVote();
        return true;
    }

    public Integer getVoteCount(String name) {
        Candidate candidate = candidates.get(name);
        return (candidate != null) ? candidate.getVoteCount() : null;
    }

    public Map<String, Integer> getAllVotes() {
        Map<String, Integer> result = new ConcurrentHashMap<>();
        candidates.forEach((name, candidate) -> result.put(name, candidate.getVoteCount()));
        return result;
    }

    public Optional<String> getWinner() {
        return candidates.values().stream()
                .max(Comparator.comparingInt(Candidate::getVoteCount))
                .map(Candidate::getName);
    }
}

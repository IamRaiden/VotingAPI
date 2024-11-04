# Voting Application API

## Overview

The Voting Application API allows users to create, manage, and participate in voting sessions. This API provides endpoints to register candidates, cast votes, count votes, list all candidates with their vote counts, and determine the winner, all managed in memory using `ConcurrentHashMap`.

## Features

- Register candidates with an initial vote count of 0
- Cast votes for valid candidates
- Retrieve the latest vote count for candidates
- List all candidates and their vote counts in JSON format
- Get the name of the candidate with the highest number of votes
- Thread-safe operations for simultaneous execution by multiple users

## Technologies Used

- **Backend:** Java, Spring Boot
- **Data Storage:** In-memory storage using `ConcurrentHashMap`
- **Build Tool:** Maven

## Getting Started

### Prerequisites

- Java JDK 17+
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/voting-application-api.git
   cd voting-application-api

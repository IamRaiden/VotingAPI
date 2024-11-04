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

### Working

- Enter Candidate name

![Enter Candidate](https://github.com/user-attachments/assets/cf5edda0-237f-4984-bd55-ddc1c3d97fb6)

- Cast Vote

![Cast Vote](https://github.com/user-attachments/assets/79bbd8ca-8cd1-49c3-8f31-616a9fecf4c6)

- Count Vote

![Count Vote](https://github.com/user-attachments/assets/4bb1062d-3496-46ea-8be2-d064fe4e80fe)

- List vote

![List Vote](https://github.com/user-attachments/assets/f496dcea-bb9f-4995-af5c-54802c2dc26d)

- Winner 

![Winner](https://github.com/user-attachments/assets/a20a58ef-6b7e-4c0a-952e-ecef5a06cad2)


  







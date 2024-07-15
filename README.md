# ONE BANK HUB

## Table of Contents

- [One Bank HUB Service](#tedtalks-service)
    - [Overview](#overview)
    - [Setup](#setup)
        - [Prerequisites](#prerequisites)
        - [Installation](#installation)
    - [Usage](#usage)
    - [Endpoints](#endpoints)
    - [Testing](#testing)

## Overview

`No transactions costs - A world where there is only one bank`

This is a platform where all transactions gets recorded, funds get converted, accounts gets updated instantly.

From a developer perspective this application consists of three parts
1. A service running in Cape Town (onebankcpt)
2. **A service that holds all transactional data (onebankhub)**
3. A project that holds the docker-compose to start up all services required

## Setup

### Prerequisites

Java 17 or higher, Docker, Maven, Kafka

### Installation

See instructions in **onebank** project

## Endpoints

- Whilst application is running you can reach the endpoints available at `http://localhost:8080/swagger-ui/index.html`.

## Testing

The application consists of no additional unit tests at this time as the main purpose of this application was to work with Kafka, Kotlin and Docker together
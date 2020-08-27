# Ports and Adapters Project

## Background

Domain-Driven-Design (DDD) is an architectural design principle of complex enterprise software that aims at seperating a complex problem into components, aka. domains. DDD has other advantages as well and was popularised by Eric Evans' ["blue book"](https://www.amazon.co.uk/Domain-Driven-Design-Tackling-Complexity-Software/dp/0321125215/) back in 2004. 

To implement a Domain-Driven-Design the so called "hexagonal" pattern (aka "Ports and Adapters" pattern) was [proposed by Alistair Cockburn](https://alistair.cockburn.us/hexagonal-architecture/).

Another source I was relying on so far was [this](https://subscription.packtpub.com/book/programming/9781839211966) more recent book.

## Motivation of this repo

This repo wants to experiment with the design based on a Java Spring implementation. It is meant to be something like a sketch, so please excuse that it has weaknesses (e.g. very limited test cases at this time)

## Stack

* Spring Boot
* Maven
* IDE agnostic (I use IntelliJ Ultimate)

## Testing the app

run the spring boot application (e.g. with maven spring plugin) and post the following JSON to http://localhost:8080/endpoint1

{
  "name": "Max"
}

The response will be an entity object of type Spring, that has done the roundtrip to the database as you can observe in the h2 console. the action is happening in the service class "UC001Service" without delegating to domain functionality. This is still enough since accessing a domain POJO is no problem and the domain design was not the center of this little demonstration.

## Remaining tasks

* Implement a Messaging Port and adapter(s) to handle domain events - an important concept in DDD
* Add unit tests, at the time there are none
* get more realistic in the domain model
* do something useful with the decorators in the Command abstraction
* implement a query in such a way, that a state change is impossible for the query (strategy is to separate the PersistenceAbstraction interface into read and write parts)

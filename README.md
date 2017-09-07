# A Taste of Scala

This repo is merely some notes for a 2 hour intro to Scala that I've run a few times.

## Quick Intro
- Scalable language
- Statically typed language (with type inference)
- Both functional and object oriented
- Fully interoperable with Java
- 2.0 released (and written in Scala) in 2005
- Currently at 2.13
- Has a REPL, but use ammonite.io
- Has been used by LinkedIn, Twitter
- Is being used here in the city by PagerDuty, MDialog (bought by Twitter)

## The basics
- val vs var
- type inference/static typing
- _primitive_ types (String, Int, Long, Float, Boolean, Unit)
- operators vs functions (1 + 1), which one is +
- functions (expressions vs statements (:Unit))
- how to _return_ from a function

## Collections
- collections (Arrays, Seq, List, Map)
- List(1,2,3)
- Map(1 -> “don”, 2 -> “suresh”, 3 -> “colin”)
val xs = scala.collection.mutable.Seq(1,2,3)
xs(2) = 4
- ranges
- Collection functions: map, foreach, filter, take, flatmap - List(List(1,2), List(3,4)).flatMap(x => x.map(_ * 2))

## The mysterious underscore
- What the heck is _

## Code - Project Euler
- Sum the positive numbers less than 1000 that are evenly divisible by 3 or 5.
For instance, the positive numbers less than 10 that are evenly divisible by 3 or 5 are 3, 5, 6, 9 and their sum is 23.
Sum for the exercise is 233168

## Some interesting language features 
- Option!
- Tuples

## OO Features
### Classes
- Classes, Companion Objects, Traits, Case (fields, don't need `new`, impls toString, equals, hashCode and copy)
- Pattern matching

## Code - FizzBuzz
### Use pattern matching in your solution
FizzBuzz

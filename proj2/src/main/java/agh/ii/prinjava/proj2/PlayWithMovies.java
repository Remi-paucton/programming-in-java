package agh.ii.prinjava.proj2;

import agh.ii.prinjava.proj2.dal.ImdbTop250;
import agh.ii.prinjava.proj2.model.Movie;
import agh.ii.prinjava.proj2.utils.Utils;

import java.util.*;
import java.util.stream.Collectors;

interface PlayWithMovies {

    /**
     * Returns the movies (only titles) directed (or co-directed) by a given director
     * sorting of directors
     *
     * Collection the movie
     *
     */
    static Set<String> ex01(String directorName) {

        final Optional<List<Movie>> optMovies = ImdbTop250.movies();

        final Set<String> listOfFilmForDirector = optMovies.orElseThrow().stream()
                .filter(m -> m.directors().contains(directorName))
                .map(Movie::title) // same as using lambda : m -> m.title()
                .collect(Collectors.toSet());

        return listOfFilmForDirector;
    }



    /**
     * Returns the movies (only titles) in which an actor played
     */
    static Set<String> ex02(String actorName) {

        final Optional<List<Movie>> optMovies = ImdbTop250.movies();

        final Set<String> listOfFilmForActor = optMovies.orElseThrow().stream()
                .filter(m -> m.actors().contains(actorName))
                .map(Movie::title) // same as using lambda : m -> m.title()
                .collect(Collectors.toSet());

        return listOfFilmForActor;
    }

    /**
     * Returns the number of movies per director (as a map)
     */
    static Map<String, Long> ex03() {throw new RuntimeException("ex03 is not implemented!");}


    /**
     * Returns the 10 directors with the most films on the list
     */
    static Map<String, Long> ex04() {
        throw new RuntimeException("ex04 is not implemented!");
    }

    /**
     * Returns the movies (only titles) made by each of the 10 directors found in {@link PlayWithMovies#ex04 ex04}
     */
    static Map<String, Set<String>> ex05() {
        throw new RuntimeException("ex05 is not implemented!");
    }

    /**
     * Returns the number of movies per actor (as a map)
     */
    static Map<String, Long> ex06() {
        throw new RuntimeException("ex06 is not implemented!");
    }

    /**
     * Returns the 9 actors with the most films on the list
     */
    static Map<String, Long> ex07() {
        throw new RuntimeException("ex07 is not implemented!");
    }

    /**
     * Returns the movies (only titles) of each of the 9 actors from {@link PlayWithMovies#ex07 ex07}
     */
    static Map<String, Set<String>> ex08() {
        throw new RuntimeException("ex08 is not implemented!");
    }

    /**
     * Returns the 5 most frequent actor partnerships (i.e., appearing together most often)
     */
    static Map<String, Long> ex09() {
        throw new RuntimeException("ex08 is not implemented!");
    }

    /**
     * Returns the movies (only titles) of each of the 5 most frequent actor partnerships
     */
    static Map<String, Set<String>> ex10() {
        throw new RuntimeException("ex10 is not implemented!");
    }
}


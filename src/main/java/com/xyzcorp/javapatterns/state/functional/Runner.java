package com.xyzcorp.javapatterns.state.functional;


public class Runner {
    public static void main(String[] args) {

        TennisGame tennisGame = TennisGame.start(new Player("Salvador"),
            new Player("Rafael"));

        TennisGame tied = tennisGame
            .nextTurn((sal1, rafael1) -> rafael1)
            .nextTurn((sal1, rafael1) -> sal1);


        TennisGame resultGame =
            tied
                .nextTurn((sal, rafael) -> rafael)
                .nextTurn((sal, rafael) -> rafael)
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael) //Game already won, Sal
                // fifteen, Ray Won
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael);

        System.out.println(tied.score());
        System.out.println(resultGame.score());
    }
}

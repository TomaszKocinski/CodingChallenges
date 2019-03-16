package com.company.codewars;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;

import static org.junit.Assert.assertEquals;

public class SnakesLaddersTest {


    @Test
    public void exampleTests() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 25", game.play(1, 1));
    }

    @Test
    public void testMap() {
        SnakesLadders game = new SnakesLadders();
        AtomicInteger snakes = new AtomicInteger(0);
        AtomicInteger ladders = new AtomicInteger(0);

        game.specialSquares.forEach(incrementSnakeOrLadder(snakes, ladders));

        assertEquals(10, snakes.get());
        assertEquals(11, ladders.get());

    }

    private BiConsumer<Integer, Integer> incrementSnakeOrLadder(AtomicInteger snakes, AtomicInteger ladders) {
        return (Integer entry, Integer value) -> {
            if (entry > value) {
                System.out.println("Entry: " + entry + " Value: " + value + " Variable Snakes: " + snakes.incrementAndGet());
            } else {
                System.out.println("Entry: " + entry + " Value: " + value + " Variable Ladders: " + ladders.incrementAndGet());
            }
        };
    }
}














package com.company.codewars;


import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {
    private static final int WINPOSITION = 100;
    final Map<Integer, Integer> specialSquares = new HashMap<>();
    Integer playerOnePosition = 0;
    Integer playerTwoPosition = 0;
    boolean playerOneTurn = true;
    boolean additionalTurn = false;

    public SnakesLadders() {
        specialSquares.put(2, 38);
        specialSquares.put(7, 14);
        specialSquares.put(8, 31);
        specialSquares.put(15, 26);
        specialSquares.put(16, 6);
        specialSquares.put(21, 42);
        specialSquares.put(28, 84);
        specialSquares.put(36, 44);
        specialSquares.put(46, 25);
        specialSquares.put(49, 11);
        specialSquares.put(51, 67);
        specialSquares.put(62, 19);
        specialSquares.put(64, 60);
        specialSquares.put(71, 91);
        specialSquares.put(74, 53);
        specialSquares.put(78, 98);
        specialSquares.put(87, 94);
        specialSquares.put(89, 68);
        specialSquares.put(92, 88);
        specialSquares.put(95, 75);
        specialSquares.put(99, 80);
    }

    public String play(int die1, int die2) {
        if (checkIfSomebodyWonLastTime()) {
            return "Game over!";
        }
        Integer currentPlayerPosition = playerOneTurn ? playerOnePosition : playerTwoPosition;
        if (doDicesHaveSameValues(die1, die2)) {
            additionalTurn = true;
        }
        currentPlayerPosition = move(die1, die2, currentPlayerPosition);
        currentPlayerPosition = bounceBackIfMovedToFar(currentPlayerPosition);
        currentPlayerPosition = onSpecialSquare(currentPlayerPosition);
        assignTempValueToFields(currentPlayerPosition);
        if (checkIfPlayerWon(currentPlayerPosition)) {
            return getPlayerString() + " Wins!";
        }
        return getReturnStringAndChangeTurn(currentPlayerPosition);
    }

    private void assignTempValueToFields(Integer currentPlayerPosition) {
        if (playerOneTurn){
            playerOnePosition = currentPlayerPosition;
        } else{
            playerTwoPosition = currentPlayerPosition;
        }
    }

    private boolean checkIfPlayerWon(Integer currentPlayerPosition) {
        return currentPlayerPosition.equals(WINPOSITION);
    }

    private boolean checkIfSomebodyWonLastTime() {
        return checkIfPlayerWon(playerOnePosition) || checkIfPlayerWon(playerTwoPosition);
    }

    private Integer bounceBackIfMovedToFar(Integer currentPlayerPosition) {
        if (currentPlayerPosition > WINPOSITION) {
            currentPlayerPosition = WINPOSITION - (currentPlayerPosition - WINPOSITION);
        }
        return currentPlayerPosition;
    }

    private Integer onSpecialSquare(Integer playerPosition) {
        if (specialSquares.containsKey(playerPosition)) {
            playerPosition = specialSquares.get(playerPosition);
        }
        return playerPosition;
    }

    private boolean doDicesHaveSameValues(int die1, int die2) {
        return die1 == die2;
    }

    private Integer move(int die1, int die2, Integer playerPosition) {
        return playerPosition + die1 + die2;
    }

    private String getReturnStringAndChangeTurn(Integer playerPosition) {
        String playerString = getPlayerString();
        if (additionalTurn) {
            additionalTurn = false;
        } else {
            playerOneTurn = !playerOneTurn;
        }

        return playerString +
                " is on square " +
                playerPosition;
    }

    private String getPlayerString() {
        return "Player " +
                (playerOneTurn ? "1" : "2");
    }
}

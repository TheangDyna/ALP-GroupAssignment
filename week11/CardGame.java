import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

class CardGame {

    public static void main(String[] args) {

        // initial player
        ArrayList<String> computer = new ArrayList<>();
        ArrayList<String> user = new ArrayList<>();

        // genarate cards for a deck
        ArrayList<String> deck = generateDeck();

        // shuffle cards
        Collections.shuffle(deck);

        // dealing card
        for (int i = 0; i < 2; ++i) {
            computer.add(deck.remove(0));
            user.add(deck.remove(0));
        }

        // display for user once
        System.out.println("you: " + user);

        // isBoom
        if (isBoom(totalRanks(computer)) || isBoom(totalRanks(user))) {

            // display
            System.out.println("computer: " + computer);
            System.out.println(winner(totalRanks(computer), totalRanks(user)));

        } else {

            // computer pull
            if (isComputerPull(totalRanks(computer))) {
                computer.add(deck.remove(deck.size() - 1));
            }

            // ask user to pull
            if (isUserPull()) {
                user.add(deck.remove(deck.size() - 1));
            }

            // display final cards of player and result
            System.out.println("you: " + user);
            System.out.println("computer: " + computer);
            System.out.println(winner(totalRanks(computer), totalRanks(user)));
        }

    }

    public static ArrayList<String> generateDeck() {
        ArrayList<String> suits = new ArrayList<>(
                Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades"));

        ArrayList<String> ranks = new ArrayList<>(
                Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"));

        ArrayList<String> deck = new ArrayList<String>();

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(rank + " of " + suit);
            }
        }

        return deck;
    }

    public static int totalRanks(ArrayList<String> playerCards) {
        int totalRanks = 0;
        String totalStr;

        // on 3 cards check 3 pic
        if (playerCards.size() > 2) {
            if (isThreePic(playerCards)) {
                totalRanks = 10;
                return totalRanks;
            }
        }

        // calculate player cards
        for (int i = 0; i < playerCards.size(); i++) {
            totalRanks += getRank(playerCards.get(i));
        }

        // count scores
        totalStr = totalRanks + "";
        totalRanks = Integer.parseInt(totalStr.charAt(totalStr.length() - 1) + "");

        return totalRanks;
    }

    // change to arraylist
    // get rank only one card
    public static int getRank(String card) {
        int rank = 0;

        if (card.split(" ")[0].equals("Ace")) {
            rank += 1;
        } else if (card.split(" ")[0].equals("10") || card.split(" ")[0].equals("Jack")
                || card.split(" ")[0].equals("Queen") || card.split(" ")[0].equals("King")) {
            rank += 0;
        } else {
            rank += Integer.parseInt(card.split(" ")[0]);
        }

        return rank;
    }

    public static boolean isBoom(int totalRanks) {

        if (totalRanks > 7) {
            return true;
        }

        return false;
    }

    public static String winner(int computerScores, int userScores) {

        if (computerScores == userScores) {
            return "draw";
        }
        if (computerScores > userScores) {
            return "computer win";
        }

        return "user win";
    }

    public static boolean isComputerPull(int computerScores) {
        Random rand = new Random();
        int value = rand.nextInt(100); // 0 -> 99

        // less than 4 100%
        if (computerScores < 4) {
            return true;
        }

        // 4 -> 80%
        if (computerScores < 5 && value < 80) {
            return true;
        }

        // 5 -> 40%
        if (computerScores < 6 && value < 40) {
            return true;
        }

        // 6 -> 10%
        if (computerScores < 7 && value < 10) {
            return true;
        }

        return false;
    }

    public static boolean isUserPull() {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.print("Do you want to pull a card? y/n: ");
        userInput = input.next();
        input.close();

        if (userInput.toLowerCase().charAt(0) == 'y') {
            return true;
        }

        return false;
    }

    public static boolean isThreePic(ArrayList<String> playerCards) {

        for (int i = 0; i < playerCards.size(); i++) {
            if (!(playerCards.get(i).split(" ")[0].equals("Jack")
                    || playerCards.get(i).split(" ")[0].equals("Queen")
                    || playerCards.get(i).split(" ")[0].equals("King"))) {
                return false;
            }
        }

        return true;
    }
}

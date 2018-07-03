package chapter9udemy.data_structure.stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
        Stack (stos) is LIFO type - Last In, First Out.
        We have some specific methods:
        -empty() - boolean, check if stack is empty,
        -peek() - return element on top of the stack.
        -pop() - this method remove the last item of the stack.
        -push() - add some item to the stack.
        -search(element) - to find out how many items are stacked on the top of searching element
         */

        Stack<String> deckOfCards = new Stack<>();
        deckOfCards.push("Ace of clubs");
        deckOfCards.push("Ace of spades");
        deckOfCards.push("Ace of diamonds");
        deckOfCards.push("Ace of hearts");

        System.out.println(deckOfCards);
        System.out.println(deckOfCards.peek());
        System.out.println(deckOfCards.search("Ace of spades"));
        System.out.println("Is stack empty? "+deckOfCards.empty());

        //clear stack with pop():

        while (!deckOfCards.empty()){
            System.out.println("You've picked up the "+deckOfCards.pop());
        }
        System.out.println("Is stack empty? "+deckOfCards.empty());

    }
}

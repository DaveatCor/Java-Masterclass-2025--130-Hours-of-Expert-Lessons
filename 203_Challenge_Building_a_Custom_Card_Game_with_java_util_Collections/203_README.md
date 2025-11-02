## The Card Game Challenge
In the last few videos, I introduced you to quite a few methods on the java.util.Collections class, showing you examples using a deck of cards.

Now, it's your turn.

Think for a moment about a card game that you'd enjoy building, and one you know some of the rules for.

1. <b>Create a deck of cards</b>, either a standard deck, or a deck that's specialized to the card game you want to create.
2. <b>Shuffle your deck.</b>
3. <b>Deal your players' hands.</b> Pick the number of players playing, and figure out how you'll deal the cards, one at a time to each hand, or some other way.
4. <b>Evaluate your players' hands</b> for card combinations that are important to the game.  
5. <b>Use a combination</b> of java.util.Collections and List methods to achieve your results.

## Poker: Five Card Draw
This game usually has four or more players.
- The dealer shuffles the deck, and asks another player to cut the deck.
- The dealer deals the cards one at a time to each player, starting with the player on the dealer's left, until each player has 5 cards.
- Each player evaluates his hand for certain card combinations, called card ranks.
- Each player can discard up to 3 cards.
- The dealer will replace discarded cards from the remaining pile, in the order they've been shuffled.
- Each player reevaluates his hand if he drew new cards, and bets on his hand.
- This gives us quite a bit of work to do, so let's get going.



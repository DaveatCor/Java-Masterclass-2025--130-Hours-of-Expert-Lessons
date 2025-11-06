## The Initializer Challenge, Pirate Invasion Game
This game will be a Pirate Game and should extend the Game class we created previously.

It should have a Pirate class that implements the Player interface.

Your game will have different levels. Each level will have a list of towns, which can be Strings for now.

Use an enum for the Weapon options.

Weapon should have two fields.
- Hit points that get deducted from a player hit by this weapon.
- Level, which is the minimum level needed to be able to use the weapon.
  Use an <b>enum</b> constructor to set this up.
  I also want you to think about how you could use instance or static initializers as you build these types.

## Class Diagram
This diagram shows a model of the main entities for my own implementation of the Pirate game.

I'm going to create Weapon as an enum as suggested on the previous slide.

The Pirate class will implement the Player interface, from the last video.

Finally, I'll create a PirateGame class that extends Game.

![image_1.png](image_1.png)
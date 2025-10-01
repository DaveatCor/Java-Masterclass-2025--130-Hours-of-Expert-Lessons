## The String
The String has <b>over 60 methods</b> available.

The String is a sequence of characters, meaning its characters are ordered  and indexed.

The index starts 0 and not 1.

| Index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
| - | - | - | - | - | - | - | - | - | - | - | - | 
| Character | H | e | l | l | o |  | W | o | r | l | d |

We can say the character "H" is at index 0, and "W" is at index 6.

The length of this String is 11, but its last index is 10.

## The Purpose of String methods
We can split String's methods up into three basic categories:
- String Inspection Methods.
- Method for Comparing String values.
- String Manipulation Methods
Let's start with a look at some of the String Inspection Methods.

## String Inspection Methods
| method | description |
| - | - |
| length | Returns the number of characters in the String. |
| charAt | Returns the character at the index that's passed. |
| indexOf\nlastIndexOf | Returns an integer, representing the index in the sequence where the String or character passed, can be located in the String. |
| isEmpty | Returns true if length is zero. |
| isBlank | Returns true if length is zero OR the string only contains whitespace characters, added in JDK 11. |

## String Comparison Methods
| method | description |
| - | - |
| contentEquals | Returns a boolean if the String's value is equal to the value of the argument passed. This method allows for argument other than String, for any type that is a character sequence. |
| equals | Return a boolean if the String's value is equal to the value of the argument passed. |
| equalsIgnoreCase | Return a boolean if the String's value is equal (ignoring case), to the value of argument passed. |
| contains | Returns a boolean if the String contains the argument passed. |
| endsWith\n\nstartsWith | These return a boolean, and are much like the contains method, but more specific to the placement of the argument in the String. |
| regionMatches | Returns a boolean, if defined sub-regions are matched. |
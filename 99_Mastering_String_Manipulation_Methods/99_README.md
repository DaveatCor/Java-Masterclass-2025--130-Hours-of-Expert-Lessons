## String comparision Methods
The first set of methods don't actually change the underlying meaning of the text value but performs some kind of clean up.
| method | description |
| - | - |
| indent | This method was added in JDK 15, and adds or removes spaces from the beginning of lines in multi-line text. |
| strip\nstripLeading\nstripLeading\ntrim | The different between the strip method and trim method is that the strip() supports a larger set of white space characters. It and the corresponding stripLeading and stripTrailing methods were added in JDK 11. ||
| toLowerCase\ntoUpperCase | Returns a new String, either in a lower case or in upper case. |

The second set of string manipulation methods transforms the String value and returns a String with a different meaning than the original String.
| method | description |
| - | - |
| concat | Similar to the plus operator for strings, it concatenates text to the String and returns a new String as the result. |
| join | Allows multiple strings to be concatenated together in a single method, specifying a delimiter. |
| repeat | Returns the String repeated by the number of times specified in the argument. |
| replace\nreplaceAll\nreplaceFirst | These methods replace characters or strings in the string, returning a new String with replacements made. |
| substring\nsubSequence | These return a part of the String, its range defined by the start and end index specified. |
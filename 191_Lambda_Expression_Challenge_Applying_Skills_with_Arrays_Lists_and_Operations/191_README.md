## Lambda Expression Challenge
This challenge is designed to exercise your skills with methods on Arrays and ArrayLists, that are targets for lambda expressions.

First, I want you to create an array of String, which is populated with first names, in mixed case.

Include at least one name, which is spelled the same backwards, and forwards, like Bob, or Anna.

Use <b>Arrays.setAll</b>, or <b>List.replaceAll</b>, to change the values in this array.

If you use List methods, you'll need <b>a list backed by the array</b>, so that changes get made to the initial array.

Using one of those two methods, perform the following functions on the elements in the array, with appropriate lambda expressions.  
- Transform names to all uppercase.
- Add a randomly generated middle initial and include a period.
- Add a last name that is the reverse of the first name.
Print your array or the array elements, after each change, <b>using the forEach method, at least once.</b>

Finally, create a new modifiable ArrayList from your names array, removing any names where the last name equals the first name.

Use removeIf with a lambda expression to perform this last operation.
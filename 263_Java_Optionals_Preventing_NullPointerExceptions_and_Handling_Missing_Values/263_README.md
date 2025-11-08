## What's the Optional Type?
Optional is a generic class, whose purpose is to be a container for a value which may or 
may not be null.

It was created by Java's engineers, to address the problem of the NullPointerException,
which is one of the most common errors in Java.

This type is <b>primary intended</b> for use as a </b>method return type</b>, under specific conditions.

## No Result is valid vs. No Result is a problem.
Optional tries to solve the problem of when no result, or no data, is a perfectly valid situation, vs. when no result 
might really be an error.

We can thnk of many situations where no data makes sense.

Not everyone has a middle initial in their name, or even a last name for that matter.

No data for a birthdate may or may not be an exception.

Optional is a way of indicating that a value may not be present and can therefore be safely ignored during processing.

## Creating an instance of Optional
Optional is just another generic class, so we declare it like any other type, which type arguments.

But we dont' construct an Optional.

Instead, we use one of the static factory methods as shown below.

| Factory Method                  | When to use                                                                                 | Best Practice Notes                                                                                                  
|---------------------------------|---------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Optional<T> empty()             | Use this method to create an Optional<br>that we know has no value.                         | Never return null form a method that has<br>Optional as a return type                                                |
| Optional<T> of(T value)         | Use this method to create an Optional<br>that we know has value.                            | Passing null to this method raise a<br>NullPointException. Ues ofNullable instead, if a possible value might be null. |
| Optional<T> ofNullable(T value) | Use this method to create an Optional<br>that we are uncertain if the value is null or not. | |

These methods are empty, of, and ofNullable.

## The downside of Optional
- Wrapping elements in Optional will consumer more memory and has the possibility of slowing down execution.
- Wrapping elements in Optional adds complexity and reduces readability of our code.
- Optional is not serializable.
- Using Optional for fields or method parameters is not recommanded.
StackExchange message, from the autor of Optional, if we want further reading.
  https://stackoverflow.com/questions/26327957/should-java-8-getters-return-optional-type/26328555#26328555
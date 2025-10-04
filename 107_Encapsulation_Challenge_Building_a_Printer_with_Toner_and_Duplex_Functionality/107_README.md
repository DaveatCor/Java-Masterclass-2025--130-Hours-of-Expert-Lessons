## Encapsulation Challenge
![image_1.png](image_1.png)
In this challenge, we need to create a class named Printer.

The fields on this class are as follows:

- <b>tonerLevel</b>, which is the percentage of toner left in the toner cartridge.
- <b>pagesPrinted</b>, which is the count of total pages printed.
- <b>duplex</b>, which is an indicator of whether the printer will print on both sides of a sheet of paper.  True means it can, False means it can only print on one side of paper.

We'll want to initialize your printer by specifying a starting toner amount and whether the printer has duplex capabilities, or not.

On the Printer class, you want to create two methods, which the calling code should be able to access.
These methods are:
- `addToner()` which takes a `tonerAmount` argument.
    - `tonerAmount` is added to the `tonerLevel` field.
    - The `tonerLevel` should never exceed 100 percent or ever get below 0 percent. 
    - If the amount being added makes the level fall outside that range, return a -1 from the method, otherwise return the actual toner level after adding the amount passed to the method.

- `printPages()` which should take pages to be printed as the argument.
        - It should determine how many sheets of paper will be printed. It should take into account the duplex value set for the printer. It should return the calculated number of sheets of paper.
        - The sheet number should also be added to the pagesPrinted field.
        - If it's a duplex printer, print a message that it's a duplex printer.



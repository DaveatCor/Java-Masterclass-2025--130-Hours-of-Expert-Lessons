## Record Constructors come in three flavors
The Canonical, or Long constructor is the implicitly generated constructor. We can explicitly declare our own, which 
means the implicit one won't get generated. If we do declare our own, then we must make sure fields all get assigned a value.

The Custom constructor is just an overloaded constructor. It must explicitly call the canonical constructor as it's first statement.

The Compact, or Short constructor is a special kind of constructor, used only on records. It's a succinct way of explicitly
declaring a canonical constructor.

## The compact constructor
The compact constructor is declared with no parentheses, so no argument.

However, it has access to all the arguments of the canonical constructor. Don't confuse the
arguments with the instance fields!

We cna't do assignments to the instance fields in the constructor.

The implicit canonical constructor's assignments occur after the execution of this code.

We can't have both a compact constructor and an explicit canonical constructor.

## The Java Class File Disassembler
This is <b>javap</b>.

It lists class members, by default just public and protected members in a class file.

This helps we see implicit code in the compiled class file.
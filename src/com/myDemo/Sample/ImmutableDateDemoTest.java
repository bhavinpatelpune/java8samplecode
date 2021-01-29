package com.myDemo.Sample;

import java.util.Date;

class ImmutableDateDemoTest
{
    public static void main(String[] args)
    {
    	ImmutableDateDemo im = ImmutableDateDemo.createNewInstance(100,"test", new Date());
        System.out.println(im);
        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
        System.out.println(im);
    }
 
    private static void tryModification(Integer immutableField1, 
    									String immutableField2,
    									Date mutableField)
    {
        immutableField1 = 10000;
        immutableField2 = "test changed";
        mutableField.setDate(10);
    }
}

/*

As it can be seen that even changing the instance variables using their references does not change their value, 
so the class is immutable.

Immutable classes in JDK
Apart from your written classes, JDK itself has lots of immutable classes. 
Given is such a list of immutable classes in Java.

1] String
2] Wrapper classes such as Integer, Long, Double etc.
3] Immutable collection classes such as Collections.singletonMap() etc.
4] java.lang.StackTraceElement
5] Java enums (ideally they should be)
6] java.util.Locale
7] java.util.UUID

3. Benefits of making a class immutable
Lets first identify advantages of immutable class. In Java, immutable classes are:

are simple to construct, test, and use
are automatically thread-safe and have no synchronization issues
do not need a copy constructor
do not need an implementation of clone
allow hashCode() to use lazy initialization, and to cache its return value
do not need to be copied defensively when used as a field
make good Map keys and Set elements (these objects must not change state while in the collection)
have their class invariant established once upon construction, and it never needs to be checked again
always have “failure atomicity” (a term used by Joshua Bloch) : if an immutable object throws an exception, 
it’s never left in an undesirable or indeterminate state

4. Summary
In this tutorial, we learned to create immutable java class with mutable objects as well as immutable fields as well. 
We also saw the benefits which immutable classes bring in an application.

As a design best practice, always aim to make your application Java classes to be immutable. 
In this way, you can always worry less about concurrency related defects in your program.

*/
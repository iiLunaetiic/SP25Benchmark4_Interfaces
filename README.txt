For this benchmark, you'll be tasked with three things:

1. Write the interface specification for models.IQueue.
2. determine which methods of models.IQueue are primary and which are secondary.
3. implement the secondary methods in models.IQueue, and then implement the primary methods in the two implementations of models.IQueue.

Currently, all methods are considered primary. Remember, all methods are primary until proven secondary, so look at each
method and determine if it is necessary for the interface to function. If it is not, then it is secondary. Be aware,
while we do traditionally organize methods by whether they're primary or secondary (traditionally primary first),
this might not be the case for this benchmark, so don't just assume that the primary ones are listed first.

In case you need them, here are the links to the list interface, which LinkedList and ArrayList implement:
https://docs.oracle.com/javase/8/docs/api/java/util/List.html

Requirements:

When writing the interface specification, your description should at least be 2-3 sentences. It should describe what the
queue is (fundamentally), some of the methods we have access to, and things like that. keep it simple. The other three
components of the interface specification shouldn't be too long either. AND DO NOT BREAK ABSTRACTION!!

I expect everything you write to compile. If it doesn't, it's an auto-zero. If you don't know how to implement something
in a way that does compile, just simply make the method return (either nothing or null) so that it's "implemented". There
will be an autograder that will check if your code compiles (among also checking if your primary vs secondary distinctions
are correct and whether your implementations are correct too). The autograder works very similar to Project 2's autograder,
meaning that if you see nothing after you submit, then it worked. If you see a message saying that the autograder failed
to execute, then something isn't compiling.

You must submit the following files (AND ONLY THE FOLLOWING FILES, DO NOT ZIP OR SUBMIT THE ENTIRE PROJECT):
    models.IQueue.java
    models.LinkedListQueue.java
    models.ArrayListQueue.java
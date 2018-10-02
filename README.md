# Kotlin-Calisthenics

This is a fantasy word (and possibly language) generator written as an exercise that will attempt to follow
the Object Calisthenics rules https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf
and also some of the Functional Calisthenics rules https://codurance.com/2017/10/12/functional-calisthenics/ 
(as much as the language limitations of Kotlin will allow.)

I will also challenge myself to follow TDD and BDD as much as possible.

For following the evolving direction of the of the project, see User-Stories.txt as I will try to follow and approach
of writing and then implementing them as I go along.

### Thoughts so far (Madness vs some useful takeaways):

1. The desire and push for perfection that the guides talk about really stunts my ability to think and get code down
that I can start refactoring and shaping and getting to work.

2. The 'wrap all primitives and strings' concept in the Object-Oriented guidelines makes it quite difficult to keep the
 'one dot per line' idea when working with a more functional style in data classes, as you use your one dot straight
  away simply unwrapping the value to work with it.

3. I'm working _much, much_ slower than I normally could, trying to follow along with all the guidelines and make sure I'm doing
 them correctly. This is in part because I'm adopting some of the 'evil coder' mentality with TDD by writing the kind of
  code that tries to make the tests pass without making the code do what I intend for it to do when I'm done.
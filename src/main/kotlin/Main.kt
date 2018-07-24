/*
    This is a fantasy language generator written as an excercise that will follow the Object Calisthenics rules
    https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf and also some of the
    Functional Calisthenics rules https://codurance.com/2017/10/12/functional-calisthenics/
    (as much as the language limitations of Kotlin will allow.)
 */

fun main(args: Array<String>) {
    val generatedWord = WordGenerator.generateWord(WordLength(5))
    println(generatedWord.value)
}

data class GeneratedWord(val value: String)
data class WordLength(val length: Int)

object WordGenerator {
    fun generateWord(length: WordLength): GeneratedWord {
        return GeneratedWord("asdfa")
    }
}
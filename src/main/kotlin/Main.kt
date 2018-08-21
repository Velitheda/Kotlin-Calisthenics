/*
    This is a fantasy language generator written as an excercise that will follow the Object Calisthenics rules
    https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf and also some of the
    Functional Calisthenics rules https://codurance.com/2017/10/12/functional-calisthenics/
    (as much as the language limitations of Kotlin will allow.)
 */

fun main(args: Array<String>) {
    val generatedWord = WordGenerator.generateWord(WordLength(5))
    println(generatedWord)
}

data class WordLength(val value: Int)

data class GeneratedWord(val value: List<FantasyLanguageCharacter>) {
    override fun toString(): String {
        return value.joinToString("")
    }
}

data class FantasyLanguageCharacter(val value: Char){
    override fun toString(): String {
        return value.toString()
    }
}

object WordGenerator {
    fun generateWord(length: WordLength): GeneratedWord {
        return GeneratedWord(
                (1..length.value).map{ generateLetter() }
        )
    }

    fun generateLetter(): FantasyLanguageCharacter {
        return FantasyLanguageCharacter('a')
    }
}
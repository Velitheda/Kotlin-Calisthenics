import java.util.*

/*
    This is a fantasy language generator written as an excercise that will follow the Object Calisthenics rules
    https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf and also some of the
    Functional Calisthenics rules https://codurance.com/2017/10/12/functional-calisthenics/
    (as much as the language limitations of Kotlin will allow.)
 */

fun main(args: Array<String>) {
    val seed = System.currentTimeMillis()
    val generatedWord = WordGenerator.generateWord(WordLength(5), seed)
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
    // This can be changed depending on what set of characters make up the language
    val alphabet: List<Char> = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

    fun generateWord(length: WordLength, seed: Long): GeneratedWord {
        val random = Random(seed)
        return GeneratedWord(
            (1..length.value).map{
                 FantasyLanguageCharacter(alphabet[random.nextInt(alphabet.size - 1)])
            }
        )
    }
}
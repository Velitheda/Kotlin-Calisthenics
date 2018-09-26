import org.junit.Assert.*
import org.junit.BeforeClass
import org.junit.Test
import java.util.*

data class TestSeed(val value: Long)

class Test {

    companion object {
        lateinit var generator: Random

        @BeforeClass @JvmStatic fun setup() {
            val seed: TestSeed = TestSeed(Random().nextLong())
            generator = Random(seed.value)
            println("Random seed for test run: $seed")
        }
    }

    @Test
    fun wordIsGeneratedToGivenLength() {
        // Given a word value of 5
        val wordLength = WordLength(5)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a value equal to 5
        assertEquals(generatedWord.value.size, 5)
    }

    @Test fun wordWithLengthZeroIsEmptyString() {
        // Given a word value of 0
        val wordLength = WordLength(0)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a value equal to 0
        assert(generatedWord.value.isEmpty())
    }

    @Test fun wordWithRandomLengthIsSameLength() {
        // Given a random word value
        val randomInt = Math.abs(generator.nextInt(100))
        val wordLength = WordLength(randomInt)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a value equal to the random value
        assertEquals(generatedWord.value.size, randomInt)
    }

    @Test fun wordsAreDifferentEachTime() {
        val wordLength = WordLength(generator.nextInt(100))
        val generatedWord = WordGenerator.generateWord(wordLength)

        val wordLength1 = WordLength(generator.nextInt(100))
        val generatedWord1 = WordGenerator.generateWord(wordLength1)

        assertNotEquals(generatedWord.toString(), generatedWord1.toString())
    }
}
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.*

class Test {
    @Test fun wordIsGeneratedToGivenLength() {
        // Given a word value of 5
        val wordLength = WordLength(5)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a value equal to 5
        assertEquals(generatedWord.value.length, 5)
    }

    @Test fun wordWithLengthZeroIsEmptyString() {
        // Given a word value of 0
        val wordLength = WordLength(0)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a value equal to 0
        assertTrue(generatedWord.value.isEmpty())
    }

    @Test fun wordWithRandomLengthIsSameLength() {
        // Given a random word value
        val randomInt = Math.abs(Random().nextInt()) % 100;
        val wordLength = WordLength(randomInt)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a value equal to the random value
        assertEquals(generatedWord.value.length, randomInt)

    }
}
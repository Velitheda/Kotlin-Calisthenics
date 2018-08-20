import org.junit.Test
import java.util.*

class Test {
    @Test fun wordIsGeneratedToGivenLength() {
        // Given a word length of 5
        val wordLength = WordLength(5)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a length equal to 5
        assert(generatedWord.value.length == 5)
    }

    @Test fun wordWithLengthZeroIsEmptyString() {
        // Given a word length of 0
        val wordLength = WordLength(0)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a length equal to 0
        assert(generatedWord.value.isEmpty())
    }

    @Test fun withWithRandomLengthIsSameLength() {
        // Given a random word length
        val randomInt = Math.abs(Random().nextInt());
        val wordLength = WordLength(randomInt)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a length equal to the random length
        assert(generatedWord.value.length == randomInt)

    }
}
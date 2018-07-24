import org.junit.Test

class Test {
    @Test fun wordIsGeneratedToGivenLength() {
        // Given a word length of 5
        val wordLength = WordLength(5)
        // When a word is generated
        val generatedWord = WordGenerator.generateWord(wordLength)
        // Then it has a length equal to 5
        assert(generatedWord.value.length == 5)
    }
}
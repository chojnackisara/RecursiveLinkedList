import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit test class for Sentence.
 */
public class SentenceTest {
  private Sentence emptySentence;
  private Sentence partialSentence;
  private Sentence fullSentence;

  @Before
  public void setup() {
    emptySentence = new EmptyNode();

    partialSentence = new WordNode("how",
            new WordNode("are", new WordNode("you",
                    new PunctuationNode('?', new EmptyNode()))));
    fullSentence = new WordNode("Hi", new PunctuationNode(',',
            partialSentence));

  }

  /**
   * Tests the getNumberofWords method for each sentence.
   */
  @Test
  public void testNumWords() {
    assertEquals(0, emptySentence.getNumberofWords());
    assertEquals(3, partialSentence.getNumberofWords());
    assertEquals(4, fullSentence.getNumberofWords());
  }

  /**
   * Tests the merge method.
   */
  @Test
  public void testMerge() {
    Sentence partialSentence2 = new WordNode("Hello",
            new PunctuationNode(',', new EmptyNode()));
    Sentence merged = partialSentence2.merge(partialSentence);
    assertEquals("Hello, how are you?", merged.toString());
  }

  /**
   * Tests sentence toString when sentence doesn't have punctuation at the end.
   */
  @Test
  public void testNoPunct() {
    Sentence noPunct = new WordNode("how",
            new WordNode("are", new WordNode("you",
                    new EmptyNode())));
    assertEquals("how are you.", noPunct.toString());
  }

  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    Sentence cloned = fullSentence.clone();
    assertEquals("Hi, how are you?", cloned.toString());
  }

  /**
   * Tests longest word method.
   */
  @Test
  public void testLongestWord() {
    Sentence randomSentence = new WordNode("Jane", new PunctuationNode(',',
            new WordNode("how", new WordNode("are",
                    new WordNode("you", new PunctuationNode('?',
                            new EmptyNode()))))));
    assertEquals("Jane", randomSentence.longestWord());

    Sentence randomSentence2 = new WordNode("Jane", new PunctuationNode(',',
            new WordNode("how", new WordNode("are",
                    new WordNode("you", new WordNode("doing",
                            new PunctuationNode('?', new EmptyNode())))))));
    assertEquals("doing", randomSentence2.longestWord());
  }
}


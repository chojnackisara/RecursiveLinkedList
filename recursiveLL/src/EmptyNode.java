/**
 * Represents an empty node at the end of the sentence.
 */

public class EmptyNode implements Sentence {

  @Override
  public int getNumberofWords() {
    return 0;
  }

  public int getWordLength() {
    return 0;
  }

  @Override
  public String longestWord() {
    return null;
  }

  @Override
  public Sentence clone() {
    return new EmptyNode();
  }

  @Override
  public Sentence merge(Sentence other) {
    return other;
  }

  @Override
  public String toString() {
    return "";
  }
}

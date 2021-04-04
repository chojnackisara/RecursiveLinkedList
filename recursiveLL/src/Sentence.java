/**
 * Interface that represents a sentence.
 */

public interface Sentence {

  /**
   * Returns the number of words in the sentence.
   */
  int getNumberofWords();

  /**
   * Returns the longest word in the sentence.
   */
  String longestWord();

  /**
   * Returns a copy of the sentence.
   */
  Sentence clone();

  /**
   * Merges two sentences together.
   */
  Sentence merge(Sentence other);


  /**
   * Returns sentence as a String.
   */
  String toString();

  /**
   * Returns length of the current word.
   */
  int getWordLength();
}

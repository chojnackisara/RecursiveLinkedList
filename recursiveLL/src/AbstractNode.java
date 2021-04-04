/**
 * Abstract class that represents a node in a sentence.
 */

public abstract class AbstractNode implements Sentence {
  protected Sentence rest;

  /**
   * Constructs a generic node for a sentence.
   *
   * @param rest the rest of the sentence, a Sentence object.
   */
  public AbstractNode(Sentence rest) {
    this.rest = rest;
  }

}

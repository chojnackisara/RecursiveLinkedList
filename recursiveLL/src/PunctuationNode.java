/**
 * Represents a node that contains a punctuation mark.
 */

public class PunctuationNode extends AbstractNode {
  private char contents;


  public PunctuationNode(char contents, Sentence rest) {
    super(rest);
    this.contents = contents;
  }

  @Override
  public int getNumberofWords() {
    return this.rest.getNumberofWords();
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
    return new PunctuationNode(this.contents, this.rest.clone());
  }

  @Override
  public Sentence merge(Sentence other) {
    return new PunctuationNode(this.contents, this.rest.merge(other));
  }


  @Override
  public String toString() {
    if (rest instanceof EmptyNode) {
      return (this.contents + rest.toString());
    }
    else {
      return (this.contents + " " + rest.toString());
    }
  }

}

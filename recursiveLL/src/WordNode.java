
/**
 * Represents a node that contains a word.
 */


public class WordNode extends AbstractNode {
  private String contents;

  public WordNode(String contents, Sentence rest) {
    super(rest);
    this.contents = contents;
  }

  @Override
  public int getNumberofWords() {
    return 1 + this.rest.getNumberofWords();
  }

  public int getWordLength() {
    return contents.length();
  }

  @Override
  public String longestWord() {
    if (Math.max(this.getWordLength(), rest.getWordLength()) == this.getWordLength()) {
      return this.contents;
    }
    else {
      return rest.longestWord();
    }
  }

  @Override
  public Sentence clone() {
    return new WordNode(this.contents, this.rest.clone());
  }

  @Override
  public Sentence merge(Sentence other) {
    return new WordNode(this.contents, this.rest.merge(other));
  }

  @Override
  public String toString() {
    if (rest instanceof EmptyNode) {
      return (this.contents + "." + rest.toString());
    }
    if (rest instanceof PunctuationNode) {
      return (this.contents + rest.toString());
    }
    else {
      return (this.contents + " " + rest.toString());
    }
  }
}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class HighScores {
  private List<Integer> scores;

  public HighScores(List<Integer> highScores) {
    scores = new ArrayList<>(highScores);
  }

  List<Integer> scores() {
    return new ArrayList<>(scores);
  }

  Integer latest() {
    return scores.getLast();
  }

  Integer personalBest() {
    return scores.stream().max(Integer::compareTo).orElse(0);
  }

  List<Integer> personalTopThree() {
    return scores.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
  }
}

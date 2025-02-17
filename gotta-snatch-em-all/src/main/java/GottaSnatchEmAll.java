import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GottaSnatchEmAll {
  static Set<String> newCollection(List<String> cards) {
    return new HashSet<>(cards);
  }

  static boolean addCard(String card, Set<String> collection) {
    return collection.add(card);
  }

  static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
    return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
  }

  static Set<String> commonCards(List<Set<String>> collections) {
    if (collections.isEmpty()) {
      return new HashSet<String>();
    }
    return new HashSet<>(collections.getFirst())
        .stream()
            .filter(
                card ->
                    collections.subList(1, collections.size()).stream()
                        .allMatch(collection -> collection.contains(card)))
            .collect(Collectors.toSet());
  }

  static Set<String> allCards(List<Set<String>> collections) {
    return collections.stream().collect(HashSet::new, Set::addAll, Set::addAll);
  }
}

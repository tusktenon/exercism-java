public class GameMaster {

  public String describe(Character character) {
    return "You're a level %d %s with %d hit points."
        .formatted(character.getLevel(), character.getCharacterClass(), character.getHitPoints());
  }

  public String describe(Destination destination) {
    return "You've arrived at %s, which has %d inhabitants."
        .formatted(destination.getName(), destination.getInhabitants());
  }

  public String describe(TravelMethod travelMethod) {
    String methodPhrase =
        switch (travelMethod) {
          case WALKING -> "by walking";
          case HORSEBACK -> "on horseback";
        };
    return "You're traveling to your destination " + methodPhrase + ".";
  }

  public String describe(Character character, Destination destination, TravelMethod travelMethod) {
    return String.join(" ", describe(character), describe(travelMethod), describe(destination));
  }

  public String describe(Character character, Destination destination) {
    return describe(character, destination, TravelMethod.WALKING);
  }
}

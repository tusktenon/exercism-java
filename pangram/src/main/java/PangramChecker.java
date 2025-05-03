import java.util.EnumSet;

public class PangramChecker {

    enum Alphabet {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
    }

    public boolean isPangram(String input) {
        EnumSet<Alphabet> missingLetters = EnumSet.allOf(Alphabet.class);
        for (String token : input.toUpperCase().split("")) {
            try {
                missingLetters.remove(Alphabet.valueOf(token));
            } catch (IllegalArgumentException ignored) {
            }
        }
        return missingLetters.isEmpty();
    }
}

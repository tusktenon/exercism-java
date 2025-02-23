import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class HandshakeCalculator {

  List<Signal> calculateHandshake(int number) {
    // Select an implementation
    return calculateHandshakeStreamReverseFirst(number);
  }

  /*
   * My first (and still favourite) solution. We use an Intstream to build the list of handshake
   * signals, then reverse the list at the end if needed.
   */
  @SuppressWarnings("unused")
  private List<Signal> calculateHandshakeStreamReverseLast(int number) {
    Signal[] signals = Signal.values();
    List<Signal> handshake =
        IntStream.range(0, signals.length)
            .filter(i -> (number & 1 << i) != 0)
            .mapToObj(i -> signals[i])
            .collect(Collectors.toList());

    return (number & 1 << signals.length) != 0 ? handshake.reversed() : handshake;
  }

  /*
   * Since this implementation does not reverse the list, it may be slightly faster (though I find
   * it much less readable).
   */
  @SuppressWarnings("unused")
  private List<Signal> calculateHandshakeLoop(int number) {
    List<Signal> handshake = new ArrayList<>();
    Signal[] signals = Signal.values();
    boolean reverse = (number & 1 << signals.length) != 0;
    int start = reverse ? signals.length - 1 : 0;
    int end = reverse ? -1 : signals.length;
    int update = reverse ? -1 : 1;

    for (int i = start; i != end; i += update) {
      if ((number & 1 << i) != 0) {
        handshake.add(signals[i]);
      }
    }

    return handshake;
  }

  /*
   * Combining the two previous implementations, we can use an IntStream without having to reverse
   * the list at the end. I still find this less readable than the first solution, and of course,
   * it's overkill for such a short list, but it's worth keeping in mind when processing longer
   * lists.
   */
  @SuppressWarnings("unused")
  private List<Signal> calculateHandshakeStreamReverseFirst(int number) {
    Signal[] signals = Signal.values();
    IntStream stream =
        (number & 1 << signals.length) != 0
            ? IntStream.iterate(signals.length - 1, i -> i >= 0, i -> i - 1)
            : IntStream.range(0, signals.length);
    return stream
        .filter(i -> (number & 1 << i) != 0)
        .mapToObj(i -> signals[i])
        .collect(Collectors.toList());
  }
}

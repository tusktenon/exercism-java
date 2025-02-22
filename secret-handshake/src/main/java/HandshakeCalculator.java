import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class HandshakeCalculator {

  List<Signal> calculateHandshake(int number) {
    Signal[] signals = Signal.values();
    List<Signal> handshake =
        IntStream.range(0, signals.length)
            .filter(i -> (number & 1 << i) != 0)
            .mapToObj(i -> signals[i])
            .collect(Collectors.toList());

    return (number & 1 << signals.length) != 0 ? handshake.reversed() : handshake;
  }

  // Since this implementation does not reverse the list, it may be slightly faster (though I find
  // it much less readable).
  List<Signal> calculateHandshakeLoop(int number) {
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
}

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
}

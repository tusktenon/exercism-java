import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

  List<Signal> calculateHandshake(int number) {
    List<Signal> handshake = new ArrayList<>();
    Signal[] signals = Signal.values();
    for (int i = 0; i < signals.length; i++) {
      if ((number & 1 << i) != 0) {
        handshake.add(signals[i]);
      }
    }
    return (number & 1 << signals.length) != 0 ? handshake.reversed() : handshake;
  }
}

class RnaTranscription {
  String transcribe(String dnaStrand) {
    return dnaStrand
        .chars()
        .map(
            n ->
                switch (n) {
                  case 'A' -> 'U';
                  case 'C' -> 'G';
                  case 'G' -> 'C';
                  default -> 'A'; // case 'T'
                })
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}

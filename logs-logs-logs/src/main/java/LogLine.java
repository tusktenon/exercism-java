public class LogLine {
  private String line;

  public LogLine(String logLine) {
    line = logLine;
  }

  public LogLevel getLogLevel() {
    String level = line.substring(1, line.indexOf(']'));
    return switch (level) {
      case "TRC" -> LogLevel.TRACE;
      case "DBG" -> LogLevel.DEBUG;
      case "INF" -> LogLevel.INFO;
      case "WRN" -> LogLevel.WARNING;
      case "ERR" -> LogLevel.ERROR;
      case "FTL" -> LogLevel.FATAL;
      default -> LogLevel.UNKNOWN;
    };
  }

  public String getOutputForShortLog() {
    String message = line.substring(line.indexOf(':') + 1).trim();
    return getLogLevel().shortForm() + ":" + message;
  }
}

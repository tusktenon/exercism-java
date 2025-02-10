import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
  public LocalDateTime schedule(String appointmentDateDescription) {
    var parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    return LocalDateTime.parse(appointmentDateDescription, parser);
  }

  public boolean hasPassed(LocalDateTime appointmentDate) {
    return appointmentDate.isBefore(LocalDateTime.now());
  }

  public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
    int hour = appointmentDate.getHour();
    return 12 <= hour && hour < 18;
  }

  public String getDescription(LocalDateTime appointmentDate) {
    // Need to specify Locale.US for "AM" and "PM"; Locale.CANADA produces "a.m." and "p.m."
    var formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", Locale.US);
    return "You have an appointment on " + formatter.format(appointmentDate) + ".";
  }

  public LocalDate getAnniversaryDate() {
    return LocalDate.of(LocalDate.now().getYear(), 9, 15);
  }
}

class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    return new int[] {0, 2, 5, 3, 7, 8, 4};
  }

  public int getToday() {
    return birdsPerDay[birdsPerDay.length - 1];
  }

  public void incrementTodaysCount() {
    birdsPerDay[birdsPerDay.length - 1]++;
  }

  public boolean hasDayWithoutBirds() {
    for (int count : birdsPerDay) {
      if (count == 0) {
        return true;
      }
    }
    return false;
  }

  public int getCountForFirstDays(int numberOfDays) {
    int count = 0;
    for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
      count += birdsPerDay[i];
    }
    return count;
  }

  public int getBusyDays() {
    final int busyMinimum = 5;
    int busyDays = 0;
    for (int count : birdsPerDay) {
      if (count >= busyMinimum) {
        busyDays++;
      }
    }
    return busyDays;
  }
}

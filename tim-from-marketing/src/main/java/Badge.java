class Badge {
  public String print(Integer id, String name, String department) {
    if (department == null) {
      department = "Owner";
    }
    if (id == null) {
      return String.format("%s - %S", name, department);
    }
    return String.format("[%d] - %s - %S", id, name, department);
  }
}

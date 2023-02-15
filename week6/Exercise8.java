public class Exercise8 {

  public static void main(String[] args) {
    int[][] workHours = new int[][] {
      { 2, 4, 3, 4, 5, 8, 8 },
      { 7, 3, 4, 3, 3, 4, 4 },
      { 3, 3, 4, 3, 3, 2, 2 },
      { 9, 3, 4, 7, 3, 4, 1 },
      { 3, 5, 4, 3, 6, 3, 8 },
      { 3, 4, 4, 6, 3, 4, 4 },
      { 3, 7, 4, 8, 3, 8, 4 },
      { 6, 3, 5, 9, 2, 7, 9 },
    };
    // Create an array of employee which its index match with the employee's working hours
    String[] employeeNames = new String[] {
      "Employee 1",
      "Employee 2",
      "Employee 3",
      "Employee 4",
      "Employee 5",
      "Employee 6",
      "Employee 7",
      "Employee 8",
    };

    // Create an empty array with the size of how many employee we have
    int[] totalHours = new int[workHours.length];

    for (int i = 0; i < workHours.length; i++) {
      int employeeTotalHours = 0; // set this as local variable help reset each employee's work to 0 hour
      for (int j = 0; j < workHours[i].length; j++) {
        employeeTotalHours += workHours[i][j];
      }
      totalHours[i] = employeeTotalHours;
    }

    // This is the Bubble Sort Algorithm
    for (int i = 0; i < workHours.length; i++) {
      for (int j = i + 1; j < workHours.length; j++) {
        // The element compare the element that next to it if true swap
        if (totalHours[i] < totalHours[j]) {
          int temp = totalHours[i];
          totalHours[i] = totalHours[j];
          totalHours[j] = temp;

          // We not swap only hour but the employee index as well
          String tempName = employeeNames[i];
          employeeNames[i] = employeeNames[j];
          employeeNames[j] = tempName;
        }
      }
    }
    // Print the output
    for (int i = 0; i < workHours.length; i++) {
      System.out.println(employeeNames[i] + " " + totalHours[i]);
    }
  }
}

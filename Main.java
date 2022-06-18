class Main {
  public static void main(String[] args) {
    // recursivecall(5);
    // System.out.println(" the factorial for 6 = " + fact(6));
    // System.out.println(" the sum of series for 5 terms is: " + sumSeries(5));
    towerOfHanoi(3, "start", "auxiliary", "destination");
  }

  public static void towerOfHanoi(int disk, String start, String aux, String dest) {
    if (disk == 1) {
      System.out.println("Disk " + disk + " moved from " + start + " to " + dest);
    } else {
      towerOfHanoi(disk - 1, start, dest, aux);
      System.out.println("Disk " + disk + " moved from " + start + " to " + dest);
      towerOfHanoi(disk - 1, aux, start, dest);
    }
  }

  // public static double sumSeries(int i) {
  // if (i == 1) {
  // return 1;
  // } else {
  // return sumSeries(i) + (1.0 / (2.0 * sumSeries(i - 1) + 1));
  // }
  // }

  // public static int fibonacci(int index) {
  // if (index >= 2) {
  // return (fibonacci(index - 2) + fibonacci(index - 1));
  // } else if (index == 1) {
  // return 1;
  // } else {
  // return 0;
  // }
  // }
}

// public static int fact(int n){
// //n*(n-1)!
// if (n==0){
// return 1;
// }else{
// return n * fact(n-1);

// }
// }
// public static double calculateSum(int n){
// if (n==1){
// return 1;
// }else{
// return (double)1/n+calculateSum(n-1);
// }}}
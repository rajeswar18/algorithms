package algs;

public class InsersionSort {

  public static void sort(Comparable[] a) {
    int N = a.length;
    for (int i = 1; i < N; i++) {
      for (int j = i; j > 0; j--) {
        if (less(a[j], a[j - 1]))
          exch(a, j, j - 1);
        else
          break;
      }
    }
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  private static void exch(Comparable[] a, int i, int j) {
    Comparable tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  public static void show(Comparable[] a) {
    int N = a.length;
    for (int i = 0; i < N; i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }

}

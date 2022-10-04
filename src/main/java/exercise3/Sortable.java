package exercise3;

/**
 *
 * @author Ananta D
 */
abstract class Sortable {
    public abstract int compare(Sortable b);
    
    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable key = a[i];
                int j = i;
                while (j >= gap && a[j - gap].compare(key) == 1) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = key;
            }
        }
    }
}

public class Addup {
    public int Sum(int a[], int n) {
        if (n <= 0) {
            return a[n]; 
        }
            else {
                return a[n] + Sum(a, n-1); 
            }
        }
    
}

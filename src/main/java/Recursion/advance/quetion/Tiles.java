package Recursion.advance.quetion;

public class Tiles {
    public static void main(String[] args) {
        int n =4, m=2;
        System.out.println(placeTiles(n,m));
    }

    private static int placeTiles(int n, int m) {
        if (n == m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        //Vertically
        int vertiPlacements = placeTiles(n-m,m);

        //horizantally
        int horPlacements = placeTiles(n-1,m);
        return vertiPlacements + horPlacements;
    }
}

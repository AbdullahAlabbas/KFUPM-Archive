package HW01;
public class Midterm {
    
    


    public void midTerm(int[] A, int n){
        if (n == 0){
            System.out.print(A[n]+ " ");
            return;
        }
        midTerm(A, n-1);
        System.out.print(A[n-1] + " ");
        midTerm(A, n-1);
    }

    public static void main(String[] args) {
        Midterm test = new Midterm();
        int[] A = {5,4,3,2,1};
        test.midTerm(A, 2);
    }
}



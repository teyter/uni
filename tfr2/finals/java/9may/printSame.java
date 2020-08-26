public class printSame {
	public static void main(String[] args) {
	    int[] a = {1,1,1,1,2};
	    int[] b = {1,2,3,4,5};
	    int N = 5;

	    int i = 0;
	    int j = 0;

	    while (i < N && j < N) {
		    if (a[i] > b[j]) {
			    j++;
		    }
		    else if (a[i] < b[j]) {
			    i++;
		    }
		    else {
			    StdOut.print(a[i] + " ");
			    i++;
			    j++;
		    }
	    }
	    System.out.println();
	}
}

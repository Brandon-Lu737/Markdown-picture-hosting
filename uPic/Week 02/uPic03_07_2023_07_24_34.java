public class Contains {
    
    public static boolean contains(int[] a, int element) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
	
	    int[] a = { 1, 2, 3, 4, 5, 6};
	    System.out.println(contains(a, 1));
	    System.out.println(contains(a, 5));
	    System.out.println(contains(a, 6));
	    System.out.println(contains(a, 10));
	
	}



}

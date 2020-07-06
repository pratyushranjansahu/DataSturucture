
public class UniquePath {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3,7));

	}
	
	 public static int uniquePaths(int n, int m) {
	        int[][] paths = new int[n][m];
	        for(int c = 0; c < m; ++c)
	            paths[n-1][c] = 1;
	        for(int r = 0; r < n; ++r)
	            paths[r][m-1] = 1;
	        for(int r = n-2; r >= 0; --r){
	            for(int c = m-2; c >= 0; --c){
	            	System.out.println(r+" "+(c+1) +" "+(r+1)+" "+ c);
	            	System.out.println(r +" "+c);
	                paths[r][c] = paths[r][c+1] + paths[r+1][c];
	            }
	        }
	        return paths[0][0];
	    }

}

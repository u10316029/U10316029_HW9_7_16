/*U10316029
 * 郭政慶
 */
public class ArraySort {
	
	/** Main method */ 
	public static void main(String[]args){
		int[][] a = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}}; //Initialize two-dimensional array "a"
		
		//Display the a before sorting
		System.out.print("The array :\n");
		System.out.print("{");
		for(int i =0;i<a.length;i++){
			System.out.print("{");
			for(int j =0;j<a[0].length;j++){
				if(j%2==1){
					System.out.print(",");
				}
				System.out.print(a[i][j]);
			}
			System.out.print("}");
		}
		System.out.print("}");
		System.out.print("\nwill be sorted\n");
		
		sort(a);//Invoke the method to sort the two-dimensional array
		
		//Display the a after sorting
		System.out.print("{");
		for(int i =0;i<a.length;i++){
			System.out.print("{");
			for(int j =0;j<a[0].length;j++){
				if(j%2==1){
					System.out.print(",");
				}
				System.out.print(a[i][j]);
			}
			System.out.print("}");
		}
		System.out.print("}");
	} 
	public static void sort(int m[][]){
		int a;//Initialize a to store the value
		for(int row = 0;row < m.length; row++){
			for(int newrow = row+1; newrow < m.length;newrow++){
				for(int col = 0;col < m[0].length;){
					if(m[row][col] > m[newrow][col]){
						for(int i =0;i<m[0].length;i++){
							a = m[row][i];
							m[row][i] = m[newrow][i];
							m[newrow][i] = a;
						}
						break;
					}
					else if(m[row][col]==m[newrow][col])//If the values are equal then judge the next value in next column
						col++;
					else 
						break;
				}
			}
		}
	}	
}

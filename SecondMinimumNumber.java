//2nd minimum number without changing the array 
public class SecondMinimumNumber {
	
	public static void main(String[] args) {
	
		int[] a = {100,120,80};
		int first_smallest =0 ;
		int second_smallest = 0;
		int temp=0;
		first_smallest = a[0];
		for(int i = 0;i<a.length;i++){
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j]){
					temp  = first_smallest;
					first_smallest = a[j];
					second_smallest = temp;
				}
			}
		}
		if(first_smallest > second_smallest){
			System.out.println(first_smallest);
		}
		else{
			System.out.println(second_smallest);
		}
			
}
}

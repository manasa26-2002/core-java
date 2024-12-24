class Delete{
	public static void main(String [] args){
	int [] arr = new int[1,2,3,4,5];
		int [] arr_new = new int[arr.lenth-1];
		int j=3;
		for(int i=0; k=0; i<arr.length; i++){
			if(i!=j){
				arr_new[k] = arr[i];
				k++;
			}
		}
		System.out.println("before deletion :" +Arrays.toString(arr));
		System.out.println("after deletion :" +Arrays.toString(arr_new));
	}
}
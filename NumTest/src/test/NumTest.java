package test;

public class NumTest {
	public static void main(String[] args) {
		int[] nums={57,5,10,7,63,9};
		sort(nums,1);
		sort(nums,2);
	} 
	  
	private static void sort(int[] nums,int orderby){
		//최댓값
		int tmp=0;
		int tmp1=0;
		if(orderby==1){
		for(int i=0; i<nums.length-1; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[i]>nums[j]){
					tmp=nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
		}System.out.println(tmp);
		}else{//최솟값
		
			for(int i=0; i<nums.length-1; i++){
			
				for(int j=i+1; j<nums.length; j++){
					if(nums[i]<nums[j]){
						tmp1=nums[i];
						nums[i]=nums[j];
						nums[j]=tmp1;
					}
				}
			}System.out.println(tmp1);
		}
	}
}

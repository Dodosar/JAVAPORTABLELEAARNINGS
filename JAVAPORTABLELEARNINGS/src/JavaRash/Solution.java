package JavaRash;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values = new String[] {"Мама","Мыла","Раму"};
		for(int i=0; i <3; i++){
			for(int j=0; j<3; j++){
				for(int k =0;k<3; k++){
					if((i!=j)&&(j!=k)&&(k!=i)){
						System.out.println(values[i] + values[j] + values[k]);
					}
				}
			}
		}
}
	}

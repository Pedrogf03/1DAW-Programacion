
public class ComparaArrays {

	public static void main(String[] args) {
		
		final int var = 20;
		int[] num = new int[var];

		for(int i = 0; i < var; i++) {
			num[i] = (int)(Math.random()*var+1);
			if (i > 0) {
				int j = 0;
				while(j < i) {
					while ((num[i] == num[j])) {
						num[i] = (int)(Math.random()*var+1);
						j = 0;
					}
					j++;
				}					
			}
			System.out.println(num[i]);
		}
		
	}
}
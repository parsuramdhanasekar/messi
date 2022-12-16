package Sun;

public class Planets {
	public static void main(String[] S) {
		
		String input = "moon sun\" jupiter is a largest planet\"pluto saturn";
		String temp = "";
		String array[] =new String[5];
		int arrayIndex = 0;
		int  doubleqoutescounter = 0;
		for (int i =0; i < input.length(); i++) {
			if (input.charAt(i)=='"'){
					temp = temp +input.charAt(i);
			doubleqoutescounter++;
		}else if (doubleqoutescounter % 2 == 0 && input.charAt(i) == ' ') {
			array[arrayIndex++]= temp;
			temp = "";
		}else {
			temp =temp + input.charAt(i);
		}
	}
	array[arrayIndex]= temp;
	for(int i =0; i< array.length; i++) {
		System.out.println(array[i]);
		
		
		
	}
}

}

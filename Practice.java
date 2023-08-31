package p0;

public class Practice {
	
	
	
	/**
	 * @param MyIntArray arr
	 * @return MyIntArray reversedArray: arr in reversed order
	 */
	public static MyIntArray reverseOrder(MyIntArray arr) {
		
		for (int i=0; i<arr.size;) {
			int val = arr.get(i);
			reversedArray.set(reversedArray.size-i, val);
			
		}
		
		return reversedArray;
		
	}
	
	
	
	/**
	 * @param MyIntArray arr
	 * @return int clumps : the number of clumps found
	 */
	public static int findClumps(MyIntArray arr) {
		
		int clumps;
		Boolean inClump;
		
		for (int i=0; i<arr.size; i++) {
			
			if (arr.get(i) == arr.get(i-1) && !inClump) {
				clumps += 1;
				inClump = true;
			}
			
			if (inClump) {
				inClump = false;
			}
			
			
		}
		
		return clumps;
				
	}
	
	
	/**
	 * 
	 * @param myString base: the original myString
	 * @param myString remove: the sequence to remove from myString
	 * @return base = base - remove
	 */
	public static MyString removeMyString(MyString base, MyString remove) {
		
		base.contents.replace(remove, "");
		System.out.println(base);
		
	}
	
	
	
	/**
	 * @param MyString base
	 * @param char c
	 * @return the number of times c appears in base
	 */
	public static int countChar(MyString base, char c) {
			
			String baseString = base.contents;
			return countCharHelper(baseString, c, 0);
		
	}
	
	
	/**
	 * @param String baseString
	 * @param char c
	 * @param int index
	 * @return the number of times c appears in base
	 */
	public static int countCharHelper(String baseString, char c, int index) {
		
		if(baseString.charAt(index) == c){
			return 1 + countCharHelper(baseString, c, index+1);
		}
		
		return countCharHelper(baseString, c, index+1);
		
	}

}

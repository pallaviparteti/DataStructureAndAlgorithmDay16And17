package com.datastructurealgorithm;

public class ToKnowThePermutation {
	// Function call
	public static void main(String[] args)
	{
		String str = "permutation";
		int n = str.length();
		ToKnowThePermutation permutation = new ToKnowThePermutation();
		permutation.permute(str, 0, n - 1);
	}

	/**
	      permutation function
	      @param str string to calculate permutation for
	      @param start starting index
	     @param end end index
	 */
	private void permute(String str, int startIndex , int endIndex)
	{
		if (startIndex == endIndex)
			System.out.println(str);
		else {
			for (int i = startIndex; i <= endIndex; i++) {
				str = swap(str, startIndex, i);
				permute(str, startIndex + 1, endIndex);
				str = swap(str, startIndex, i);
			}
		}
	}

	/**
	      Swap Characters at position
	      @param str string value
	      @param first position 1
	      @param second position 2
	      @return swapped string
	 */
	public String swap(String str, int first, int second)
	{
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[first];
		charArray[first] = charArray[second];
		charArray[second] = temp;
		return String.valueOf(charArray);
	}
}



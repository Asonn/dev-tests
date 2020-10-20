package findmaximum;

public class Answer {

	public static int findMax(int numbers[])
	{
		if (numbers == null || numbers.length == 0) {
			return -1;
		}

		int index = 0;
		int maxValue = numbers[0];

		for(int i=1;i < numbers.length;i++){
			if(numbers[i] > maxValue){
				maxValue = numbers[i];
				index = i;
			}
		}
		return index;
	}

}

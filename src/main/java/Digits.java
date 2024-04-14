import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		int listSize = 0;
		for(int i = num; i >= 10; i=i-10)
			listSize++;
		int [] digitList = new int [listSize];
		for(int j = listSize-1; j >= 0; j--){
			digitList[j] = (num % 10);
			num = num/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
		for(int k = 0; k < digitList.length-1; k++){
			if(digitList[k] >= digitList[k+1])
				return false;
		}
		rturn true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}

import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		int listSize = 0;
		ArrayList <Integer> digitList(); 
		for(int i = num; i >= 10; i=i/10)
			listSize++;
		for(int j = listSize-1; j >= 0; j--){
			digitList.add(0, new Integer(num % 10));
			num = num/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
		for(int k = 0; k < digitList.size()-1; k++){
			if(digitList.get(k) >= digitList.get(k+1))
				return false;
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}

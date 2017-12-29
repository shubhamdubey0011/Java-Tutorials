package net.valtech.Arrays;

class OverridingTostringDerrivedArrays 
{
	
	int i=90;
public String toString()
{
	return "i="+i;
	

}
	 

public static void main(String[] args) 
{

OverridingTostringDerrivedArrays[] arrays = new OverridingTostringDerrivedArrays[5];
	arrays[0]=new OverridingTostringDerrivedArrays();
	arrays[1]=new OverridingTostringDerrivedArrays();
	arrays[2]=new OverridingTostringDerrivedArrays();
	arrays[3]=new OverridingTostringDerrivedArrays();
	arrays[4]=new OverridingTostringDerrivedArrays();
	
	
	
	for (OverridingTostringDerrivedArrays overridingTostringDerrivedArrays : arrays) 
	{
		System.out.println(overridingTostringDerrivedArrays);
	}

	 
	
}
}

import java.lang.*;

class gun
{
	public boolean fun(int no)
	{
		int sum = 0,temp = no,digit = 0,mul = 1,icnt = 0;
		while(temp > 0)
		{	
			icnt++;
			temp = temp/10;
		}
		temp = no;
		while(temp > 0)
		{
			mul = 1;
			digit = temp %10;
			for(int i = 0; i < icnt;i++)
			{
				mul = mul * digit;
			}
			sum = sum + mul;	
			temp = temp / 10;
		}
		if(sum == no)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
}
class Armstrong
{
        public static void main(String arg[])
        {
	int value = 140;
	boolean iret = false;
	
	gun gobj = new gun();

	iret = gobj.fun(value);
	if(iret == true)
	{
		System.out.println("140 is armstrong number");	
	}
	else
	{
		System.out.println("140 is not armstrong number");
	}	
        }
}
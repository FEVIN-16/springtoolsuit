package com.hexaware.functionalinterface;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		//lambda Expression
		Addition ad=()->{
			int res=5+2;
			System.out.println("Addition="+res);
		};
		ad.add();
		//lambda Expression
		Division dv=(x,y)->{
			if(x>y)
				return x/y;
			else
				return y/x;
		};
		float val=dv.div(6, 3);
		System.out.println("Division="+val);
		//lambda Expression
		Subtraction sb=(x,y)->{
			int ans=0;
			if(x>y)
				ans=x-y;
			else
				ans=y-4;
			System.out.println("Substraction = "+ans);
		};
		sb.sub(8, 4);
	}

}

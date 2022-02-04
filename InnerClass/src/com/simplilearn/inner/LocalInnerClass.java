package com.simplilearn.inner;

public class LocalInnerClass {
	
	void validate(int age)
	{
		if(age>18)
		{
			class Inner{
				void test()
				{
					System.out.println("now  authenticaticate user using adhar");
				}
			}
			
			Inner inner=new Inner();
			inner.test();
		}
		else {
			System.out.println("no need to authenticate");
		}
	}
	

	public static void main(String[] args) {
		LocalInnerClass local=new LocalInnerClass();
		local.validate(45);
		
	}

}
//here mam didnt give else part so we dont get o/p less than 18 only greater than 18 we get o/p if u want else part to then we get < o/p
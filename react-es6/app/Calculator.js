// Q7. Write a program to implement a class having static functions

class Calculator{

	static add(a, b){
		return a+b;
	}

	static multiply(a, b){
		return a*b;
	}

	static divide(a, b){
		if(b==0)
			return null;
		return a/b;
	}

	static modulus(a, b){
		return a%b;
	}

	static subtract(a, b){
		return a-b;
	}
}

export {Calculator};
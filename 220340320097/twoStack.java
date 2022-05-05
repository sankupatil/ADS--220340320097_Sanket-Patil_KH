class twoStack{
	int size;
	int top1, top2;
	int a1[];
	
	twoStack(int n){
		a1= new int[n];
		size= n;
		top1= -1;
		top2= size;
	}
	
	void push1(int p){
		if(top1 < top2-1){
			top1++;
			a1[top1]= p;
		}
		else{
			System.out.println("Stack overflow!");
			System.exit(1);
		}
	}
	
	void push2(int p){
		if(top1 < top2-1){
			top2--;
			a1[top2]=p;
		}
		else{
			System.out.println("Stack overflow!");
			System.exit(1);
		}
	}
	
	int pop1(){
		if(top1 >=0){
			int p= a1[top1];
			top1--;
			return p;
		}
		else{
			System.out.println("Stack underflow!");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		if(top2 < size){
			int p= a1[top2];
			top2++;
			return p;
		}
		else{
			System.out.println("Stack underflow!");
			System.exit(1);
		}
		return 0;
	}
	
	
	public static void main(String[] args){
		twoStack tk= new twoStack(6);
		
		tk.push1(5);
		tk.push2(10);
		tk.push2(15);
		tk.push1(11);
		tk.push2(7);
		tk.push2(40);
		
		System.out.println("Popped element from stack1 is "+tk.pop1());
		
		System.out.println("Popped element from stack2 is "+tk.pop2());
		
	}
}

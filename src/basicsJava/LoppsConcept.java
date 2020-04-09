package basicsJava;

public class LoppsConcept {

	public static void main(String[] args) {
     
		
		// to print 1 to 10
		//loops
		//1.while
		int i=1; //initialization
		
		while(i<=10){ //conditonal statment
			System.out.println(i); //logic
			i=i+1; //incremental
			
		}
		
		int k=1;
		while(k<=10){
			System.out.println("Selenium");
			k=k+1;
		}
		
		// testing 1
		// testing 2
		int o=1;
		while(o<=10){
			System.out.println("Testing "+ o);
			o=o+1;
		}
		
		//2. for loop
		for(int p=0; p<=10;p++ ){
			System.out.println("print the value "+p);
			
		}
		//even
		for(int a=2;a<=10;a=a+2){
			System.out.println(a);
			
		}
		
		//odd
		for(int b=1; b<=10;b=b+2){
			System.out.println(b);
		}
		
		for(int l=1;l<=100;l++){
			System.out.println(l);
			if(l%5==0){ //number which can divided by 5 and then reminder is 0
				System.out.println("Hey buddy!!");
			}
		}
		
		
		
	}

}

package java_practice;

public class pattern {
	public static void main(String args[]) {
		
		int n=5;
		for (int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("left triangle ");
		
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("left triangle ");
		
		System.out.println("squre ");
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("rectangle ");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+4;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("numbers pattern ");
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
		
		System.out.println("numbers pattern ");
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}	
		
		System.out.println("numbers pattern ");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(" ");	
			}
			for(int j=i+1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("numbers pattern ");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

		System.out.println("numbers pattern ");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println("pyramid pattern ");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
		
		
		System.out.println("flag pattern ");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+10;j++) {
				System.out.print("\033[33m& ");
			}
			System.out.println();
		}
		System.out.println("*         \033[94m* *");
		System.out.println("*        * * *");
		System.out.println("*          *");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+10;j++) {
				System.out.print("\033[92m$\033[0m ");
			}
			System.out.println();
		}
		for(int j=1;j<=n+1;j++) {
			System.out.println("* ");
		}
		
		
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(val!=5) {
					System.out.print(val);
				}
				else {
					System.out.print(" ");
				}
				val=val+1;
			}
			
			System.out.println(" ");	
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}			
			}
			System.out.println("");
			for(int j=1;j<=i;j++) {
				if(j==i) {
					
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		
		System.out.println("rectangle pattern");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+2;j++) {
				
					if(i==1 || i==n) {
						System.out.print("* ");
					}
					else {
						if(j==n ) {
							System.out.print("* ");
						}
						else {
	
						}
					}
			}

			
			System.out.println();
		}
		
		System.out.println("pat");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n) {
					System.out.print("* ");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("pat");
		for(int i=1;i<=n;i++) {
			for(int k=i;k<=n;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
		
		
		

		
		
	}

}

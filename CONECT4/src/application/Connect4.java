package application;

public class Connect4 {
		static int[][] grid = new int[6][6];
		static boolean redyellow = false;
		static void load() {
			for(int i = 0 ; i < 6 ; i++) {
				for(int c = 0; c < 6; c++) {
					grid[i][c] = 0;
				}
			}
		
		}
		static void print() {
			for(int i = 0 ; i < 6 ; i++) {
				for(int c = 0; c < 6; c++) {
					System.out.print(grid[i][c]);
							
				}
				System.out.println();
			}
		
		}
		static boolean turn() {
			if (redyellow == false) {
				
				redyellow =true;
				System.out.println(redyellow);
				return redyellow;
			}
			else if (redyellow == true) {
				
				redyellow =false;
				System.out.println(redyellow);
				return redyellow;
			}
			
			return redyellow;
			
			
		}
		
		
		static void playgame(int posx, int posy, int ry) {
			if(ry == 1) { // yellow
			grid[posy][posx] = 1; 
			
			}		
			else { //red
				grid[posy][posx] =2;
			}
				
		
		}
		static int rules() {
			
			//-----------//
			for(int i = 0 ; i < 6 ; i++) {
				for(int c = 0; c < 3; c++) {
					//System.out.println(grid[i][c] + " " + grid[i][c + 1] + " " + grid[i][c + 2] + " " + grid[i][c + 3] + " " + grid[i][c + 4]  );
					if ((grid[i][c] == 1) && (grid[i][c + 1] == 1) && (grid[i][c + 2] == 1) && (grid[i][c + 3] == 1) ) {
						System.out.println("Winnner is Yellow!!!!");
						return 1;
					}
					
							
				}
				
			}
			for(int i = 0 ; i < 6 ; i++) {
				for(int c = 0; c < 3; c++) {
					if ((grid[i][c] == 2) && (grid[i][c + 1] == 2) && (grid[i][c + 2] == 2) && (grid[i][c + 3] == 2)) {
						System.out.println("Winnner is Red!!!!");
						return 0;
					}
					
							
				}
				
			}
			//||||||||||||||||||||//
			for(int c = 0; c < 6; c++) {
			for(int i = 0 ; i < 3 ; i++) {
				
					if ((grid[i][c] == 2) && (grid[i+ 1][c] == 2) && (grid[i +2][c] == 2) && (grid[i +3][c] == 2)) {
						System.out.println("Winnner is Red!!!!");
						return 0;
					}
					
							
				}
				
			}
			for(int c = 0; c < 6; c++) {
				for(int i = 0 ; i < 3 ; i++) {
					
						if ((grid[i][c] == 1) && (grid[i+ 1][c] == 1) && (grid[i +2][c] == 1) && (grid[i +3][c] == 1)) {
							System.out.println("Winnner is Yellow!!!!");
							return 1;
						}
						
								
					}
					
				}
			//   //////////////////////////  //
			
			for(int i = 0 ; i < 3 ; i++) {
				for(int c = 0; c < 3; c++) {
					//System.out.println(grid[i][c] + " " + grid[i][c + 1] + " " + grid[i][c + 2] + " " + grid[i][c + 3] + " " + grid[i][c + 4]  );
					if ((grid[i][c] == 1) && (grid[i + 1][c + 1] == 1) && (grid[i +2][c + 2] == 1) && (grid[i +3][c + 3] == 1) ) {
						System.out.println("Winnner is Yellow!!!!");
						return 1;
					}
					
							
				}
				
			}
			for(int i = 0 ; i < 3 ; i++) {
				for(int c = 0; c < 3; c++) {
					//System.out.println(grid[i][c] + " " + grid[i][c + 1] + " " + grid[i][c + 2] + " " + grid[i][c + 3] + " " + grid[i][c + 4]  );
					if ((grid[i][c] == 2) && (grid[i + 1][c + 1] == 2) && (grid[i +2][c + 2] == 2) && (grid[i +3][c + 3] == 2) ) {
						System.out.println("Winnner is Red!!!!");
						return 0;
					}
					
							
				}
				
			}
			//     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\ //
			
			
			
			
			
			
			
			
	
			for(int i = 0 ; i < 3 ; i++) {
				for(int c = 5; c > 2; c--) {
					//System.out.println(grid[i][c] + " " + grid[i][c + 1] + " " + grid[i][c + 2] + " " + grid[i][c + 3] + " " + grid[i][c + 4]  );
					if ((grid[i][c] == 1) && (grid[i + 1][c - 1] == 1) && (grid[i +2][c - 2] == 1) && (grid[i +3][c - 3] == 1) ) {
						System.out.println("Winnner is Yellow!!!!");
						return 1;
					}
					
							
				}
				
			}
			for(int i = 0 ; i < 3 ; i++) {
				for(int c = 5; c > 2; c--) {
					//System.out.println(grid[i][c] + " " + grid[i][c + 1] + " " + grid[i][c + 2] + " " + grid[i][c + 3] + " " + grid[i][c + 4]  );
					if ((grid[i][c] == 2) && (grid[i + 1][c - 1] == 2) && (grid[i +2][c - 2] == 2) && (grid[i +3][c - 3] == 2) ) {
						System.out.println("Winnner is Red!!!!");
						return 0;
					}
					
							
				}
				
			}
			
		
		
		return 7;
	
		}
		
		
		
		
		
		
		
		
	
}

package day11_nestedForLoop;

public class ReadCellValue {
	public static void main(String[] args) {
		
		int rowCount = 6;
		int columnCount = 7;
		
//		for (int row  = 1 ; row <= rowCount ; row++) {
//			System.out.println("Row #"+row);
//			for (int column = 1 ; column<= columnCount ; column++) {
//				System.out.print("Column #"+column +"  ");
//			}
//			System.out.println();
//	
//		}
		
//		for (int row  = 1 ; row <= rowCount ; row++) {
//			//System.out.println("Row #"+row);
//			for (int column = 1 ; column<= columnCount ; column++) {
//				
//				System.out.print("cell("+row+","+column+") ");
//			}
//			System.out.println();
//	
//		}
		
		
		
		for (int row  = 1 ; row <= rowCount ; row++) {
			//System.out.println("Row #"+row);
			for (int column = 1 ; column<= columnCount ; column++) {
				
				System.out.print("cell("+row+","+column+") ");
				
//				if (cell(row,column).getValue() == "BitCoin") {
//					System.out.println("get24 Volumns");
					
//				cell(row,6).getValue()
//				}
			}
			System.out.println();
	
		}
		
		

		//cell(1,1) cell(1,2), cell(1,7)
		
		//		
//		for (int column = 1 ; column<= columnCount ; column++) {
//			System.out.print("Column #"+column +"  ");
//		}
		
		
		
		
	}
}


public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Line separator: " + System.getProperty("line.separator")
		            .replace("\r", "\\r")//replace `\r` literal with `\` and `r`
		            .replace("\n", "\\n"));
			
			
			String grandTotal = String.format("Grand Total: $%,.2f", 122.0);
			System.out.println(grandTotal);
			
			System.out.printf("Total is: $%,.2f%n", 10.0);
			System.out.printf("Total: %10.2f: ", 50.0);
			System.out.printf("%4d", 11);
			System.out.printf("%-20.10s\n", 10);
			System.out.printf("%-20.10s\n", 10);
		}

	}



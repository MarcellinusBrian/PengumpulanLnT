package MainMenu;

import java.util.Scanner;

abstract class jeniskendaraan{
	public abstract void mobil();
	public abstract void motor();
}

class mobil extends jeniskendaraan{
	@Override
	public void mobil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}
}

public class Menu {
	

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				System.out.print("Input Type [car | motorcycle]: ");
				int kendaraan = scan.nextInt();
				
			
				int car = 0;
				int motorcycle = 0;
				if(kendaraan==car) {
					System.out.print("Input brand: \n");
					System.out.print("Input name: ");
					System.out.print("Input license: ");
					System.out.print("Input top speed: ");
					System.out.print("Input gas capacity: ");
					System.out.print("Input wheel: ");
					System.out.print("Input type [SUV | Supercar | Minivan]: ");
					System.out.print("Input entertainment system amount: ");
				
				}else if(kendaraan==motorcycle) {
					System.out.print("Input brand: ");
					System.out.print("Input name: ");
					System.out.print("Input license: ");
					System.out.print("Input top speed: ");
					System.out.print("Input gas capacity: ");
					System.out.print("Input wheel: ");
					System.out.print("Input type [Automatic | Manual]: ");
					System.out.print("Input helm amount: ");
					
				}
			}
			
		}


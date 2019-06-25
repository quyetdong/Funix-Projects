import java.util.Scanner;

public class BikePlateNum{
	public static void main(String[] args) {
		bike_plate_num();
	}
	
	public static void bike_plate_num() {
		Scanner sc = new Scanner(System.in);
		
		int plate = 0;
		System.out.println("Enter a plate number:");
		try {
			plate = sc.nextInt();
			//System.out.printf("Enter a plate number: %d\n", plate);
		} 
		catch(Exception e) {
			System.out.println("Not a properly plate number.");
			System.exit(0);
		}
		sc.close();
		
		System.out.println("This is plate number of:");
		switch(plate) {
			case 11:
				System.out.println("Cao Bang.");
				break;
			case 12:
				System.out.println("Lang Sơn.");
				break;
			case 13:
			case 98:
				System.out.println("Bac Giang.");
				break;
			case 14:
				System.out.println("Quang Ninh.");
				break;
			case 15:
			case 16:
				System.out.println("Hai Phong.");
				break;
			case 17:
				System.out.println("Thai Binh.");
				break;
			case 18:
				System.out.println("Nam Dinh.");
				break;
			case 19:
				System.out.println("Phu Tho.");
				break;		
			case 20:
				System.out.println("Thai Nguyen.");
				break;
			case 21:
				System.out.println("Yen Bai.");
				break;
			case 22:
				System.out.println("Tuyen Quang.");
				break;
			case 23:
				System.out.println("Ha Giang.");
				break;
			case 24:
				System.out.println("Lao Cai.");
				break;
			case 25:
				System.out.println("Lai Chau.");
				break;
			case 26:
				System.out.println("Son La.");
				break;
			case 27:
				System.out.println("Dien Bien.");
				break;
			case 28:
				System.out.println("Hoa Binh.");
				break;
			case 29:
			case 30:	
			case 31:
			case 32:
			case 33:
				System.out.println("Ha Noi.");
				break;
			case 34:
				System.out.println("Hai Duong.");
				break;
			case 35:
				System.out.println("Ninh Binh.");
				break;	
			case 36:
				System.out.println("Thanh Hoa.");
				break;	
			case 37:
				System.out.println("Nghe An.");
				break;
			case 38:
				System.out.println("Ha Tinh.");
				break;	
			case 43:
				System.out.println("Da Nang.");
				break;	
			case 47:
				System.out.println("Dak Lak.");
				break;	
			case 48:
				System.out.println("Dak Nong.");
				break; 
			case 49:
				System.out.println("Lam Dong.");
				break;	
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
				System.out.println("Tp. Ho Chi Minh.");
				break;	
			case 60:
				System.out.println("Dong Nai.");
				break;	
			case 61:
				System.out.println("Binh Duong.");
				break;	
			case 62:
				System.out.println("Long An.");
				break;	
			case 63:
				System.out.println("Tien Giang.");
				break;	
			case 64:
				System.out.println("Vinh Long.");
				break;		
			case 65:
				System.out.println("Can Tho.");
				break;	
			case 66:
				System.out.println("Dong Thap.");
				break;	 
			case 67:
				System.out.println("An Giang.");
				break;		
			case 68:
				System.out.println("Kien Giang.");
				break;		
			case 69:
				System.out.println("Ca Mau.");
				break;		
			case 70:
				System.out.println("Tay Ninh.");
				break;		
			case 71:
				System.out.println("Ben Tre.");
				break;	
			case 72:
				System.out.println("Ba Ria Vung Tau.");
				break;		
			case 73:
				System.out.println("Quang Binh.");
				break;		
			case 74:
				System.out.println("Quang Tri.");
				break;		
			case 75:
				System.out.println("Hue.");
				break;	
			case 76:
				System.out.println("Quang Ngai.");
				break;		
			case 77:
				System.out.println("Binh Dinh.");
				break;		
			case 78:
				System.out.println("Phu Yen.");
				break;		
			case 79:
				System.out.println("Khanh Hoa.");
				break;		
			case 81:
				System.out.println("Gia Lai.");
				break;		
			case 82:
				System.out.println("Kon Tum.");
				break;		
			case 83:
				System.out.println("Soc Trang.");
				break;		
			case 84:
				System.out.println("Tra Vinh.");
				break;		
			case 85:
				System.out.println("Ninh Thuan.");
				break;		
			case 86:
				System.out.println("Binh Thuan.");
				break;		
			case 88:
				System.out.println("Vinh Phuc.");
				break;		
			case 89:
				System.out.println("Hung Yen.");
				break;		
			case 90:
				System.out.println("Ha Nam.");
				break;		
			case 92:
				System.out.println("Quang Nam.");
				break;		
			case 93:
				System.out.println("Binh Phuoc.");
				break;		
			case 94:
				System.out.println("Bac Lieu.");
				break;		
			case 95:
				System.out.println("Hau Giang.");
				break;		
			case 97:
				System.out.println("Bac Kan.");
				break;		
			case 99:
				System.out.println("Bac Ninh.");
				break;
			default:
				System.out.println("Not a plate number for Vietnamese provinces.");	
		}
	}
}
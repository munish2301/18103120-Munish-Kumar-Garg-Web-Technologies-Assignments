import java.util.*;
import java.lang.*;
public class ans2{
	public static void main(String[] args) {
		int startingVar=-1;
		byte byteConversion=(byte)startingVar;             		//-1
		char charConversion=(char)byteConversion;			//'\uFFFF'
		int intConversion=(int)charConversion;				//65535
		System.out.println("After byte conversion:   "+byteConversion);
		System.out.println("After char conversion:   "+charConversion);
		System.out.println("After again int conversion:   "+intConversion);		
	}
}
// int is of 32 bits, byte is of 8 bits and char is of 16 bits.
// As -1 comes in between the range of both int and byte, so byteConversion variable has no problem with -1, so -1 remains as it is. 
// But char ranges from \u0000 to \uFFFF, so -1 become out of range. So we have to add 2^16 = 65536 in this number to lead this number into the range.
// -1 + 65536 = 65535
// So charConversion took the value (char) 65535.
// 65535 is in between the range of int. So, intConversion took the same value i.e. 65535.

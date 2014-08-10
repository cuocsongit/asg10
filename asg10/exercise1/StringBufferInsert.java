package asg10.exercise1;

// Fig. 29.14: StringBufferInsert.java
// StringBuffer methods insert, delete and deleteCharAt.

public class StringBufferInsert {
	public static void main( String args[] ) {
		Object objectRef = "hello";
		String string = "goodbye";
		char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'K';
		int integerValue = 7;
		long longValue = 10000000;
		float floatValue = 2.5f; // f suffix indicates that 2.5 is a float
		double doubleValue = 33.333;

		StringBuffer buffer = new StringBuffer();

		buffer.insert( 0, objectRef );
		buffer.insert( 0, " " ); // each of these contains two spaces
		buffer.insert( 0, string );
		buffer.insert( 0, " " );
		buffer.insert( 0, charArray );
		buffer.insert( 0, " " );
		buffer.insert( 0, charArray, 3, 3 );
		buffer.insert( 0, " " );
		buffer.insert( 0, booleanValue );
		buffer.insert( 0, " " );
		buffer.insert( 0, characterValue );
		buffer.insert( 0, " " );
		buffer.insert( 0, integerValue );
		buffer.insert( 0, " " );
		buffer.insert( 0, longValue );
		buffer.insert( 0, " " );
		buffer.insert( 0, floatValue );
		buffer.insert( 0, " " );
		buffer.insert( 0, doubleValue );
		buffer.insert(1,"$%^#%^&");
		
		System.out.printf("buffer after inserts:\n%s\n\n", buffer.toString() );

		
		
		//tìm và xóa hết tất cả các kí tự không phải là chữ cái hoặc chữ số ra khỏi buffer.
		String e = buffer.toString();
		System.out.printf("buffer after deletes:\n%s\n", buffer.toString() );
		e = e.replaceAll("[^a-zA-Z0-9]", "");
		buffer = new StringBuffer(e);
		System.out.printf("buffer after deletes:\n%s\n", buffer.toString() );
		
		//reverse buffer
		buffer = buffer.reverse();
		System.out.printf("buffer after reverse: \n%s\n", buffer.toString());
		
	} // end main
} // end class StringBufferInsert

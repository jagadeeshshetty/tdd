## what are checked and unchecked exceptions in JAVA?

In Java, exceptions can be divided into two categories:

- checked
- unchecked

<img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/04/exception-hierarchy-in-java.jpg"  width="35%" height="35%" align="right">

**Checked Exceptions**:

- Checked exceptions are those exceptions that are checked by the Java compiler at **compile time**.
- Checked exceptions are subclasses of Exception, except for RuntimeException and its subclasses.
- Examples of checked exceptions include _IOException_, _SQLException_, etc.
- The programmer must handle these exceptions in the code or declare that they are being thrown using a throws clause.

**Unchecked Exceptions:**

- Unchecked exceptions are those exceptions that are not checked by the Java compiler at compile
  time.
- Unchecked exceptions are subclasses of RuntimeException.
- Examples of unchecked exceptions include _NullPointerException_, _IllegalArgumentException_, _ArithmeticException_,
  etc.
- These exceptions do not need to be handled or declared in the code and are usually the result of programming bugs.

Different types

| Checked Exceptions            | Unchecked Exceptions                     |
|-------------------------------|------------------------------------------|
| java.io.FileNotFoundException | java.lang.NullPointerException           |
| java.io.IOException           | java.lang.IllegalArgumentException       |
| java.sql.SQLException         | java.lang.ArithmeticException            |
| java.text.ParseException      | java.lang.ArrayIndexOutOfBoundsException |

Example usage:

csharp
Copy code
public class UncheckedExceptionExample {
public static void main(String args[]) {
int num[] = {1, 2, 3, 4};
System.out.println(num[5]);
}
}

Jagadeesh C
how many checked and uncheck exceptions are present?
It's not possible to specify a fixed number of checked and unchecked exceptions in Java as both can be added or removed
with each version of the Java Standard Library.

The Java Standard Library provides a number of standard exceptions, which can be checked or unchecked, and developers
can also create their own custom exceptions as well.

So, the number of checked and unchecked exceptions in Java can change with each new version of the language or with the
introduction of new libraries or custom exceptions created by developers.

Jagadeesh C
list checked and uncheck exceptions
Here is a list of some commonly used checked and unchecked exceptions in Java:

Checked Exceptions:

java.io.FileNotFoundException
java.io.IOException
java.sql.SQLException
java.text.ParseException
java.lang.ClassNotFoundException
Unchecked Exceptions:

java.lang.NullPointerException
java.lang.IllegalArgumentException
java.lang.ArithmeticException
java.lang.ArrayIndexOutOfBoundsException
java.lang.NumberFormatException
Note: This list is not exhaustive and there can be many more checked and unchecked exceptions in Java.

Jagadeesh C
provide examples for Checked Exceptions:

java.io.FileNotFoundException
java.io.IOException
java.sql.SQLException
java.text.ParseException
java.lang.ClassNotFoundException
Here are some examples of how the checked exceptions listed can be thrown in Java:

java.io.FileNotFoundException:
java
Copy code
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionExample {
public static void main(String args[]) {
try {
FileInputStream file = new FileInputStream("file.txt");
file.close();
} catch (FileNotFoundException e) {
System.out.println("File not found");
} catch (IOException e) {
System.out.println("IO Exception");
}
}
}
java.io.IOException:
java
Copy code
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExceptionExample {
public static void main(String args[]) {
try {
FileInputStream file = new FileInputStream("file.txt");
file.close();
} catch (FileNotFoundException e) {
System.out.println("File not found");
} catch (IOException e) {
System.out.println("IO Exception");
}
}
}
java.sql.SQLException:
java
Copy code
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
public static void main(String args[]) {
try {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
System.out.println("Connected");
} catch (SQLException e) {
System.out.println("SQL Exception");
}
}
}
java.text.ParseException:
java
Copy code
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionExample {
public static void main(String args[]) {
try {
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date date = dateFormat.parse("2023-02-08");
System.out.println(date);
} catch (ParseException e) {
System.out.println("Parse Exception");
}
}
}
java.lang.ClassNotFoundException:
csharp
Copy code
public class ClassNotFoundExceptionExample {
public static void main(String args[]) {
try {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver found");
} catch (ClassNotFoundException e) {
System.out.println("Class Not Found Exception");
}
}
}

Jagadeesh C
provide examples for Unchecked Exceptions:

java.lang.NullPointerException
java.lang.IllegalArgumentException
java.lang.ArithmeticException
java.lang.ArrayIndexOutOfBoundsException
java.lang.NumberFormatException

These are examples of unchecked exceptions in Java:

java.lang.NullPointerException: This occurs when a program tries to access an object reference that is null. For
example:
rust
Copy code
String str = null;
System.out.println(str.length());
java.lang.IllegalArgumentException: This occurs when a method is passed an illegal or inappropriate argument. For
example:
typescript
Copy code
public static void main(String[] args) {
int x = -1;
if(x < 0) {
throw new IllegalArgumentException("x should be positive");
}
}
java.lang.ArithmeticException: This occurs when an exceptional arithmetic condition has occurred, such as divide by
zero. For example:
go
Copy code
int x = 5, y = 0;
System.out.println(x / y);
java.lang.ArrayIndexOutOfBoundsException: This occurs when a program tries to access an array index that is out of
bounds. For example:
go
Copy code
int[] arr = new int[5];
System.out.println(arr[10]);
java.lang.NumberFormatException: This occurs when a program tries to convert an invalid string representation of a
number into a numerical value. For example:
python
Copy code
String str = "abc";
int x = Integer.parseInt(str);
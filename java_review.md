Java Review
===========

#### Every java program must have at least one class.

```java
public class helloworld {
	public static void main(String[] args){
		System.out.println("welcome to java");
	}
}
```

#### Primitive data types:

  - char
  - byte
  - short
  - int
  - long
  - float
  - double
  - long

#### Covered booleans, operations, conditionals, etc...

#### Ternary operations

(boolean) ? expression1 : expression2

if boolean 1 else 2

ex: 

```java
y = (x>0) ? 1 : -1
```
x = 1 -> y = 1
x = 0 -> y = -1

#### Operator Precedence

  - (exp)
  - var++
  - +,- unary
  - (type) Casting
  - ! Not
  - *, /, % 
  - +,- binary
  - relational
  - equality
  - ^ exclusive or
  - && conditional and
  - || conditional or

#### right associativity 

```java
b = 1;
a = b += c = 5;
//6, 6, 5
```
#### All classes in java.lang are implicitly imported in a java program

Math: *pow sqrt max min abs random*

#### Covered char, string classes and methods

Brush up on all classes and relevant methods through chapter 9

ex of string method:

```java
"Welcome to Java".startWith("We");
// returns true
```

Substrings - similar to slicing:

```java
message = "welcome to java";
message.substring(0, 11); // up to not including index 11
message.substring(11); // index 11 to end of string 
```

Formatting (printf):
```java
System.out.printf(format, items);
// %d %f %s etc.

System.out.printf("asdf is %d, and qwer is %.2f", 25, 6.55);
//float with auto width, 2 decimal places
```
right justification by default, (-) prefixed any format specifier to left justify *%-8d*

#### ye olde scanner

```java
Scanner console = new Scanner(System.in);
String input = console.nextln();
//get entire string terminated by \n
```


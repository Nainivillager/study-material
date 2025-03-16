# Java Queries

1. Explain "public static void main(String args[]){ }"
   - public - make it visible to jvm
   - static - accesible to jvm without object creation
   - void - return type which indicate it retuns nothing
   - main - method name

String args[] - args is an array of strings -- using it we can recieve command line arguments that is sent from cmd

Parameters are in the method signature that are ready to collect the data.
Arguments are the actual data that is being sent as input to the method.
Whenever the jvm wants to pass the control of execution to the main method at the same time it can also send some data to the java program and how do we collect that data that is where the string args[] comes into the picture  OR
whatever data that is being to be sent from the jvm during the program execution that data can be collected by the main method using the parameter args

args[] are used to the collect the data sent by the jvm during the execution of the program.

Command Line Arguments refers to the data that is being sent from the command line to the main method during execution of the program.

scanner is a class in java so in order to use that class we need to create an object of the scanner class

How do we make use of an class - by creating its object
how do we perfomr any operation on that object - by using method

byte - 1 byte - 8 bits - [-2^n-1 to (2^n-1) - 1](-128 to +124) = 256
short - 2 byte - 16 bits - [-2^16-1 to (2^15) - 1] = 65536
int - 4 byte - 32 bits -[-2^31 to 2^31 -1] = 4294967296
long - 8 byte - 64 bits

int a = 45 decimal(base-10)
int a = 045 octal(base-8)
int a = 0x45 hexadecimal(base-16)

using functions we can achiece modularity and code reusability

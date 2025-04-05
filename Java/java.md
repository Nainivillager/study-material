# Java Queries

1. Explain "public static void main(String args[]){ }"
   - public - make it visible to jvm
   - static - accesible to jvm without object creation
   - void - return type which indicate it retuns nothing
   - main - method name

String args[] - args is an array of strings -- using it we can recieve command line arguments that is sent from cmd

**Parameters** are in the method signature that are ready to collect the data.
**Arguments** are the actual data that is being sent as input to the method.
Whenever the jvm wants to pass the control of execution to the main method at the same time it can also send some data to the java program and how do we collect that data that is where the string args[] comes into the picture  OR
whatever data that is being to be sent from the jvm during the program execution that data can be collected by the main method using the parameter args

**args[]** are used to the collect the data sent by the jvm during the execution of the program.

**Command Line Arguments** refers to the data that is being sent from the command line to the main method during execution of the program.

**Scanner** is a class in java so in order to use that class we need to create an object of the scanner class

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


**Keywords**: Keywords are reserved words in Java that have a predefined meaning in the language. They are part of the syntax and cannot be used for any other purpose.

**Identifiers**: Identifiers are names given to various program elements such as variables, methods, classes, and objects. They are user-defined and can be chosen by the programmer

public class Example { // 'public' and 'class' are keywords, 'Example' is an identifier
    public static void main(String[] args) { // 'public', 'static', and 'void' are keywords, 'main' is an identifier
        int number = 10; // 'int' is a keyword, 'number' is an identifier
        System.out.println(number); // 'System' and 'out' are identifiers, 'println' is a method identifier
    }
}

**Literals**: Literals in Java are constant values that appear directly in the program and can be assigned to variables. They represent fixed values and are used to express specific data types such as boolean, numeric, character, or string data

2. How can you access the no. of rows and columns in an 2d array
Ans.  A 2d array is basically an array of arrays.
    int[][] arr = new int[4][3];
    int m = arr.length; // no. of rows 
    int n = arr[0].length; // no. of cols
     
    int[][] b = {{1,2,3},{4,5,6}};
    // access the array values using foreach loop
    for(int[] ele: b){
        for(int x: ele){
            System.out.println(x+" ");
        }
    }

3. What is the difference bw shallow and deep copy'
Ans. Key differences
Independence: Changes in the copied object affect the original object in shallow copy, but not in deep copy.
Memory Allocation: Shallow copy does not allocate new memory for nested objects, while deep copy does.
Performance: Shallow copy is faster and less memory-intensive, whereas deep copy is slower and more memory-intensive.
example: 
    public class ShallowCopyExample{
        private int[] SCarr;

        public ShallowCopyExample(int[] values){
            SCarr = values;
        }
        public void showData(){
            System.out.println(Array.toString(SCarr));
        }
        public static void main(string[] args){
        int[] arr = {2,3,4};
        ShallowCopyExample obj = new ShallowcopyExample(arr);
        obj.showData(); //{2,3,4}
        arr[0] = 5;
        obj.showData(); //5,3,4
        }
    }

    public class DeepCopyExample{
        private int[] DCarr;
        public DeepCopyExample(int[] values){
            <!-- DCarr = new DCarr(values.length)
            for(int i=0;i<DCarr.length;i++){
                DCarr[i] = values[i]; -->
            // int[] DCarr = Arrays.copyOf(values,values.length);
            }
        }
        public void showData(){
            System.out.println(Array.toString(DCarr));
        }
        public static main(String[] args){
            int[] arr = {8,9,10};
            DeepCopyExample obj = new DeepcopyExample(arr);
            obj.showData(); //{8,9,10}
            arr[0] = 11; 
            obj.showData(); //{8,9,10}
        }
    }
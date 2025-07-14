public class note {
public static void main(String[] args){
     // premitive datatypes
        // datatypes > integral numbers
      //  byte a = 127;
      //  short max = 32767;
      //  short min = -32768;
      //  int imax = 2147483647;
      //  int imin = -2147483648;
      //  long lmax = 9223372036854775807l;
      //  long lmin = -9223372036854775808l;
      //   // datatypes > decimal numbers(7 significant digits)
// | Feature                | `float`                                      | `double`                                                        |
// | ---------------------- | -------------------------------------------- | --------------------------------------------------------------- |
// | **Size**               | 32 bits (4 bytes)                            | 64 bits (8 bytes)                                               |
// | **Precision**          | \~7 decimal digits                           | \~15–16 decimal digits                                          |
// | **Default type?**      | ❌ (add `f` or `F` suffix)                    | ✅ Yes                                                           |
// | **Suffix**             | `f` or `F`                                   | No suffix needed                                                |
// | **Example**            | `float x = 3.14f;`                           | `double x = 3.14;`                                              |
// | **Use case**           | When memory is critical (e.g. games, mobile) | When precision is more important (e.g. scientific calculations) |
// | **Max value**          | `~3.4028235E38`                              | `~1.7976931348623157E308`                                       |
// | **Min positive value** | `~1.4E-45`                                   | `~4.9E-324`                                                     |

     // float = 4 bytes
    //    float fplmax = 3.4028235E38f;  // Largest positive float - If you go beyond this, you get infinity in float.
    //    float fnlmin = -3.4028235E38f; // Largest negative float - So it’s the minimum (most negative) number a float can store.
    //    float fpsmax = 1.4E-45f; // Almost zero (positive) - Smallest positive float
    //    float fnsmin = -1.4E-45f; // Almost zero (negative) - Smallest negative float
    //  // double = 8 bytes
        // double dplmax = 1.7976931348623157E308;   // Largest positive double
        // double dnlmin = -1.7976931348623157E308;  // Largest negative double
        // double dpsmax = 4.9E-324;                 // Smallest positive double
        // double dnsmin = -4.9E-324;                // Smallest negative double
       
    // datatypes > boolean values(size =  1 bit)

    // boolean isAdult = false;
    // isAdult = true;
    
    // datatypes > characters

        // char minChar = 0;        // Smallest char value (Unicode 0)
        // char maxChar = 65535;    // Largest char value (Unicode 65535)
        // char letterA = 'A';      // Typical character
        // char unicodeChar = '\u0905';  // Hindi 'अ' using Unicode

        // System.out.println("Min char (as int): " + (int) minChar);
        // System.out.println("Max char (as int): " + (int) maxChar);
        // System.out.println("Char A: " + letterA);
        // System.out.println("Unicode char '\\u0905': " + unicodeChar);
    
     /*
         * =======================
         *   Type Conversion Notes
         * =======================
         *
         * 1. Widening Conversion (Implicit / Safe)
         * ----------------------------------------
         * - Smaller → larger data type (automatic)
         * - No data loss
         * - Examples:
         *     byte    → short   (1 → 2 bytes)
         *     short   → int     (2 → 4 bytes)
         *     int     → long    (4 → 8 bytes)
         *     long    → float   (8 → 4 bytes, but float has wider range)
         *     float   → double  (4 → 8 bytes)
         */

        // System.out.println("Widening conversion Example:");
        // System.out.println("----------------------------");

        // byte byteValue = 10;                    // 1 byte
        // short shortValue = byteValue;           // 2 bytes
        // int intValue = shortValue;              // 4 bytes
        // long longValue = intValue;              // 8 bytes
        // float floatValue = longValue;           // 4 bytes (but wider range than long)
        // double doubleValue = floatValue;        // 8 bytes

        // System.out.println("byte:   " + byteValue);
        // System.out.println("short:  " + shortValue);
        // System.out.println("int:    " + intValue);
        // System.out.println("long:   " + longValue);
        // System.out.println("float:  " + floatValue);
        // System.out.println("double: " + doubleValue);

        /*
         * 2. Narrowing Conversion (Explicit / Risky)
         * ------------------------------------------
         * - Larger → smaller data type (requires casting)
         * - Possible data loss:
         *     • Truncation of decimals
         *     • Overflow
         * - Examples:
         *     double → float
         *     float  → long
         *     long   → int
         */

        // System.out.println("\nNarrowing conversion Example:");
        // System.out.println("------------------------------");

        // double doubleValue2 = 123.456;
        // float floatValue2 = (float) doubleValue2;
        // long longValue2 = (long) floatValue2;
        // int intValue2 = (int) longValue2;

        // System.out.println("double: " + doubleValue2);
        // System.out.println("float:  " + floatValue2);
        // System.out.println("long:   " + longValue2);
        // System.out.println("int:    " + intValue2);

        /*
         * Summary:
         * Widening  = Safe, automatic
         * Narrowing = Risky, requires cast
         */
    
    // premitive datatypes over*********
    // string(one of the datatype)
      // int a = 18;
      //   String isAdult =  a > 18 ? "drive" : "cant";

    // int rakesh = 18;
    //  boolean isAdult = false;

    //  if(rakesh > 18 || rakesh == 18){
    //    isAdult = false;
    //    if (isAdult == true) {
    //     System.out.println("you can drive");
    //    }
    //    else{
    //     System.out.println("your not adult now");
    //    }
    //  }
  // loops***
  // for(int i = 0; i<10; i++){
  //   System.out.println("hello mahek");
  // }
  // int i = 0;
  // while (i < 100) {
  //   System.out.println("hello mahek");
  //   i++;
  // }
  // int i = 0;
  // do{
  //   System.out.println("hey mahu");
  //   i++;
  // }
  // while(i < 10);
  // New Datatype:  Array
  // int[] arr = {1,2,3,4,5};
  
  // for (int i : arr) {
  //   System.out.println(i);
  // }
   // String[] arr = {"ar", "mahu", "hummi"};
  
  // for (String i : arr) {
  //   System.out.println(i);
  // }
 //OOPS***********
 // Encapsulation
// public class Car {
//    private int speed;
//     private String color;

//     public Car(String color){
//         this.color = color;
//     }
//      public void Speed(int speed){
//         if(speed < 0){
//             System.out.println("impossible lmao");
//         }else{
//         this.speed = speed;
//         System.out.println("driving at" +" " + speed);
//         }
//      }
//     void drive(){
//         System.out.println("Driving.....");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Car car = new Car("Green");
//         car.Speed(-1);
//         car.Speed(120);
//         car.drive();
//     }
// }

}
    
}


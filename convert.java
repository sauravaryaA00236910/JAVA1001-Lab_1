// Name - Saurav Arya
// Student ID - A00236910
/*
Program Description - This program aims to convert value from one unit of
measurement to another. The user will be asked to input a value and a preferred
unit in the console to get the desired conversion.
 The coversions available are as follows:
 1. km <-> mi
 2. cm <-> in
 3. kg <-> g
 4. g <-> oz
 5. C <-> F
 6. L <-> cups
 */


import java.util.Scanner;

public class convert{
  public static void main(String[] args){
    // taking value input from the user
    System.out.println("Enter a value to convert: ");
    Scanner keyb = new Scanner(System.in);

    // Storing the input value into a float variable
    float value = keyb.nextFloat();

    // taking unit value input and storing in a string variable
    System.out.println("Enter your preferred unit from the following conversion options (e.g. km): ");
    System.out.println("1. km <-> mi \n2. cm <-> in \n3. kg <-> g \n4. g <-> oz \n5. C <-> F \n6. L <-> cups" );
    String unit = keyb.next();

    /* if (){} and else if(){} statements as conditions to covert the entered
    value as per the unit desired by the user*/
    if (unit.equals("km")){
      System.out.println(value + unit + " is equals to " + (value*.62) + "mi" );
    }
    else if(unit.equals("mi")){
      System.out.println(value + unit + " is equals to " + (value*1.61)+"km" );
    }
    else if(unit.equals("cm")){
      System.out.println(value + unit + " is equals to " + (value*.39)+"in" );
    }
    else if(unit.equals("in")){
      System.out.println(value + unit + " is equals to " + (value*2.54)+"cm" );
    }
    else if(unit.equals("kg")){
      System.out.println(value + unit + " is equals to " + (value*2.2)+"lb" );
    }
    else if(unit.equals("lb")){
      System.out.println(value + unit + " is equals to " + (value*.45)+"kg" );
    }
    else if(unit.equals("g")){
      System.out.println(value + unit + " is equals to " + (value*0.04)+"oz" );
    }
    else if(unit.equals("oz")){
      System.out.println(value + unit + " is equals to " + (value*28.35)+"g" );
    }
    else if(unit.equals("C")){
      System.out.println(value + unit + " is equals to " + ((value*(9.0/5.0))+32)+"F" );
    }
    else if(unit.equals("F")){
      System.out.println(value + unit + " is equals to " + ((value - 32)*(5.0/9.0))+"C" );
    }
    else if (unit.equals("L")){
      System.out.println(value + unit + " is equals to " + (value*4.17)+"cups" );
    }
    else if(unit.equals("cups")){
      System.out.println(value + unit + " is equals to " + (value*.24)+"L" );
    }
    else{
      System.out.println("Please select from the following units");
      System.out.println("1. km <-> mi \n2. cm <-> in \n3. kg <-> g \n4. g <-> oz \n5. C <-> F \n6. L <-> cups" );
    }
  }
}

 /*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */
class Main
{
  public static void main(String arg[])   
    {
      double f,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit"); //asks user to type of conversion
      int ch=sc.nextInt();
        switch(ch) //based on input, determines output
          {
            case 1:  System.out.println("Enter  Fahrenheit temperature");
                          f=sc.nextDouble();
                  c=(f-32)*5/9; //conversion from fahrenheit to celsius
                  System.out.println("Celsius temperature is = "+c);
                  break;
            case 2:  System.out.println("Enter  Celsius temperature");
                          c=sc.nextDouble();
                  f=((9*c)/5)+32; //conversion from celsius to fahrenheit
                  System.out.println("Fahrenheit temperature is = "+f);
                  break;
           default:  System.out.println("please choose valid choice");
           }  
        } 
}
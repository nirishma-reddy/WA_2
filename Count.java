/**
 *Java program to count valid Numbers
 *num=7773=>count=4
 */
class Count
 {
  public static void main(String a[])
  {
try{
   int count=0,num=5643;
   while(num!=0){
   //num=num/10
   num /=10;
   ++count;
   }
}
  System.out.println("Number of digits:"+count);
  }
}
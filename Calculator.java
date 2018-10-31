Calculator
{
   int add(int x, int y)
   {
       int res = x + y;
       return res;
   }
   
   int subtract(int x, int y)
   {
       int res = x - y;
       return res;
   }
   
   int multiply(int x, int y)
   {
        int res = x * y;
        return res;
   }
   
  public static void main(String[] args)
  {
     Calculator c = new Calculator();
     c.add(5,5);
     c.subtract(10,5);
     c.multiply(5,5);
  }
}

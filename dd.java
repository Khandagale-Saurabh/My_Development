class sai extends  Thread
{

 public void th1()
 {
   for(int i=0;i<=10;i++)
    {
      System.out.println(i+" "+Thread.currentThread());
    }
 }
 synchronized public void th()
 {
   for(int i=0;i<=10;i++)
    {
      System.out.println(i+" "+Thread.currentThread());
    }
 }

 public void run()
 {
   th();
   th1();
 }

  public static void main(String aa[])
  {
   sai s1=new sai();
     s1.start();
      for(int i=100;i<=120;i++)
	   {
	     //System.out.println(i+"Main ");
       }
  }
}

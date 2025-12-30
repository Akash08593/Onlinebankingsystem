import java.util.Scanner;
class OnlineBankingsystem
  {
    static String name;
    static double balance=0;
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int choice;
      System.out.println("Online Banking System");
      System.out.println("Enter Account holder name");
      name=sc.nextLine();
      System.out.println("Enter Balance");
      balance=sc.nextDouble();
      do{
        System.out.println("MENU");
       System.out.println("1.Check Balance");
       System.out.println("2.Deposit");
       System.out.println("3.Withdrawal");
       System.out.println("4.Exit");
      switch(choice)
        case 1:
            System.out.println("Initial Balance:"+balance);
            
            break;
          case 2:
            System.out.println("Enter amount to deposit");
            double deposit=sc.nextDouble();
            balance+=deposit;
            System.out.println("Amount deposited successfully");
            break;
          case 3:
            System.out.println("Enter amount to withdrawal:");
            double withdrawal=sc.nextDouble();
            balance-=withdrwal;
            System.out.println("Amount withdrawn succcessfully");
            break;
          case 4:
            System.out.println("All operation completed successfully");
            break;
          default:
            System.out.println("Invalid choice");
            break;}
            while(choice!=4);
         sc.close();
    }}
            
        
        
      

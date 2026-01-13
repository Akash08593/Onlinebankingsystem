import java.util.Scanner;
class Onlinebankingsystem
  {
    static String name;
    static double balance=0;
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int choice;

      System.out.println("Online Banking System");
      System.out.print("Enter Account holder name:");
      name=sc.nextLine();
      System.out.print("Enter Balance:");
      balance=sc.nextDouble();
      do{
        System.out.println("MENU");
       System.out.println("1.Check Balance");
       System.out.println("2.Deposit");
       System.out.println("3.Withdrawal");
       System.out.println("4.Exit");
       System.out.print("Enter your choice:");
       choice=sc.nextInt();
      switch(choice){
        case 1:
            
    System.out.println("\n--- CHECK BALANCE ---");
    System.out.println("Current Balance: " + balance);
    System.out.println("---------------------\n");
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
            balance-=withdrawal;
            System.out.println("Amount withdrawn succcessfully");
            break;
          case 4:
            System.out.println("All operation completed successfully");
            break;
          default:
            System.out.println("Invalid choice");
            break;}
          
        }  while(choice!=4);
            sc.close();
         
    }}
            
        
        
      

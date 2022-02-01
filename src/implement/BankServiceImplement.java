package implement;

import java.util.Scanner;

import Entity.Bank;
import constans.Constantes;
import service.BankService;

public class BankServiceImplement implements BankService{
	
	 Scanner input = new Scanner(System.in);
	//Method with menu functionality
	    
	    //---Variable x no descriptiva -> bankService , op no descriptiva 
	    // Traspaso de objeto innecesario 
	   
	    
//	    public void Menu(Bank  x){
//	        int op;
//	        createAccount(x);
//	        do{
//	            System.out.println("Options:");
//	            System.out.println("1: Income Money. 2: Withdraw Money. 3: Fast Withdraw. "
//	                    + "4: Show account. 5: Exit");
//	            op = input.nextInt();
//	            switch(op){
//	                case 1:
//	                    incomeMoney(x);
//	                    break;
//	                case 2:
//	                    withdrawMoney(x);
//	                    break;
//	                case 3:
//	                    fastWithdraw(x);
//	                    break;
//	                case 4:
//	                    System.out.println(x.toString());
//	                    break;
//	                case 5:
//	                    break;
//	                default:
//	                    System.out.println("Incorrect option. Try again.");
//	            }
//	        }while(op != 5);
//	    }
	    
	 @Override
	    public void Menu(){
	    	Bank bankService = new Bank(); 
	    	bankService =createAccount();
	        int option;
	       
	        do{
	            System.out.println("Options:");
	            System.out.println( "1: Income Money. 2: Withdraw Money. 3: Fast Withdraw."
	            		+"4: Show account. 5: Exit");
	            option = input.nextInt();
	            switch(option){
	                case 1:
	                    bankService.setActualBalance(
	                    		incomeMoney
	                    		(bankService.getActualBalance()));
	                    break;
	                case 2:
	                	 bankService.setActualBalance(
	                	withdrawMoney
	                    (bankService.getActualBalance()));
	                    break;
	                case 3:
	                	 bankService.setActualBalance(
	                			 fastWithdraw
	                			 (bankService.getActualBalance()));
	                    break;
	                    //Ejemplo de mal metodo -- explicar
	                case 4:
	                    System.out.println(bankService.toString());
	                    break;
	                case 5:
	                    break;
	                default:
	                    System.out.println("Incorrect option. Try again.");
	            }
	        }while(option != 5);
	    }
	//Create the account using the information provided by the user
	    
	 //  --- Metodo void 
	//  --- Objeto completo no necesario 
	//  ---Variable x no descriptiva 
//	    public void createAccount(Bank x){
//	    	
//	        System.out.print("Give your Bill Number: ");
//	        x.setNumBill(input.nextInt());
//	        System.out.print("Give your DNI: ");
//	        x.setDni(input.nextLong());
//	        System.out.print("Current balance in your account: ");
//	        x.setActualBalance(input.nextInt());
//	    }
	 @Override
	 public  Bank createAccount(){
	    	Bank bankService = new Bank(); 
	        System.out.print("Give your Bill Number: ");
	        bankService.setNumBill(input.nextInt());
	        System.out.print("Give your DNI: ");
	        bankService.setDni(input.nextLong());
	        System.out.print(Constantes.CURRENT_BALANCE);
	        bankService.setActualBalance(input.nextInt());
	        return bankService;
            
	    }
	//--- Metodo void 
	//--- Objeto completo no necesario 
	// Variables a - x no descriptivas
//	    public void incomeMoney(Bank x){
//	        System.out.print("Amount of money to enter the account: ");
//	        int a = input.nextInt();
//	        x.setActualBalance(x.getActualBalance()+a);
//	        System.out.println("New Current Balance: "+x.getActualBalance());
//	    }
	 
	//Method to enter money to the account
	 @Override
	    public int incomeMoney(int actualBalance){
	    	Bank bankService = new Bank(); 
	    	bankService.setActualBalance(actualBalance);
	    	
	        System.out.print("Amount of money to enter the account: ");
	        int amount = input.nextInt();
	        bankService.setActualBalance(bankService.getActualBalance()+amount);
	        System.out.println(Constantes.NEW_BALANCE+bankService.getActualBalance());
	        return bankService.getActualBalance();
	    }

	    //
	    //
	    
//	    public void withdrawMoney(Bank x){
//	        System.out.print("Amount of money to withdraw from the account: ");
//	        int a = input.nextInt();
//	        if (a > x.getActualBalance()){
//	            System.out.println("New Current Balance: 0");
//	            System.out.println("You can extract a total of:"+x.getActualBalance());
//	            x.setActualBalance(x.getActualBalance()-a);
//	            System.out.println("Now you have a debt of: "+(-(x.getActualBalance())));
//	        }else{
//	            x.setActualBalance(x.getActualBalance()-a);
//	            System.out.println("New Current Balance: "+x.getActualBalance());
//	        }
//	    }
	    
	  //Method to withdraw money from the account
	 @Override
	    public int withdrawMoney(int actualBalance){
	    	Bank bankService = new Bank (); 
	    	bankService.setActualBalance(actualBalance);
	    	
	    
	        System.out.print(Constantes.MONEY_AMOUNT);
	        int amount = input.nextInt();
	        if (amount > actualBalance){
	            System.out.println(Constantes.NEW_BALANCE + "0");
	            System.out.println("You can extract a total of:"+bankService.getActualBalance());
	            bankService.setActualBalance(bankService.getActualBalance()-amount);
	            System.out.println("Now you have a debt of: "+(-(bankService.getActualBalance())));
	        }else{
	        	bankService.setActualBalance(bankService.getActualBalance()-amount);
	            System.out.println(Constantes.NEW_BALANCE +bankService.getActualBalance());
	            
	        }
	        return bankService.getActualBalance();
	    }
	//Fast money withdrawal method (up to 20% of your balance)
	 @Override
	    public int fastWithdraw(int actualBalance){
	    	Bank bankService = new Bank (); 
	    	bankService.setActualBalance(actualBalance);
	        System.out.println("Quick extraction, you can extract: "+bankService.getActualBalance()*20/100);
	        System.out.print(Constantes.MONEY_AMOUNT);
	        int amount= input.nextInt();
	        if ( amount <= bankService.getActualBalance()*20 / 100){
	        	bankService.setActualBalance(bankService.getActualBalance()-amount);
	            System.out.println(Constantes.NEW_BALANCE +bankService.getActualBalance());
	            
	        }else{
	            System.out.println("You can only extract 20% of the total.");
	            
	        }
	        return bankService.getActualBalance();
	    }
// ejemplo de sobre carga

	@Override
	public int fastWithdraw() {
		// TODO Auto-generated method stub
		return 0;
	}

}

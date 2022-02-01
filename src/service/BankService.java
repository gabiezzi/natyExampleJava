/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;


import java.util.Scanner;

import Entity.Bank;
import constans.Constantes;


public interface BankService {
	 public void Menu();
	 public  Bank createAccount();
	 public int incomeMoney(int actualBalance);
	 public int withdrawMoney(int actualBalance);
	 public int fastWithdraw(int actualBalance);
	public int fastWithdraw();
	 
   
}

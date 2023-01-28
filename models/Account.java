package models;
import java.util.*;
public class Account {
    private static int accId;
    protected static Date accountCreated;
    private static int countAccounts = 0;
    public static float minimumBalance=0.0f;
    public Account()
    {
        countAccounts+=1;
        this.accId=countAccounts;
        this.accountCreated = new Date();
    }
    static void display(Account a)
    {
        System.out.println("Account id: "+accId);
        System.out.println("Creation Date: "+accountCreated);
    }
}

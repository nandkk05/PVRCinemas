package pvrcinemas;
import java.util.Scanner;

interface pvr
{
    int kabirsingh_gold_price = 135;
    int kabirsingh_silver_price= 170;
    int kabirsingh_platinum_price= 195;
    int baaghi_gold_price =125;
    int baaghi_silver_price=160;
    int baaghi_platinum_price=185;
    int super30_gold_price = 150;
    int super30_silver_price= 175;
    int super30_platinum_price= 200;
    int dhadak_gold_price=125;
    int dhadak_silver_price= 150;
    int dhadak_platinum_price=175;
    
    interface India
    {
        interface gold
        {
            void kabirsingh();
            void super30();
            void baaghi();
            void dhadak();
        }
    }
}

class movie extends chd
        {
        Scanner p= new Scanner(System.in);
        int co;
        String movieString;
        
        int select(){
        System.out.println("Welcome to PVR Cinema \nPlease select the movie");    
            System.out.println("");
            System.out.println("1. Dhadak ");
            System.out.println("2. Super 30 ");
            System.out.println("3. Kabir Singh");
            System.out.println("4. Baaghi");
            System.out.println("Enter your selection here - ");
        co=p.nextInt();
        switch (co) { 
        case 1: 
            movieString = "Dhadak"; 
            dhadak();
            break; 
        case 2: 
            movieString = "Super 30"; 
            super30();
            break; 
        case 3: 
            movieString = "Kabir Singh";
            kabirsingh();
            break; 
        case 4: 
            movieString = "Baaghi"; 
            baaghi();
            break; 
        default: 
            movieString = "Invalid Selection"; 
            break; 
        } 
        System.out.println("Your selected movie is "+movieString); 
        return 0;
    }
}
            
class chd implements pvr.India.gold,pvr
{
    Scanner t= new Scanner(System.in);
    int count, balance;
    @Override
    public void kabirsingh() 
    {
        System.out.println("Which category seats do you want? \n1. Gold \n2. Silver \n3. Platinum");
        Scanner j= new Scanner(System.in);
        int i;
        i=j.nextInt();
        {
            if (i==1)
            {
                System.out.println("How many gold tickets do you want? One ticket price is "+kabirsingh_gold_price);
                count = t.nextInt();
                balance = kabirsingh_gold_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else if (i==2)
            {
                System.out.println("How many silver tickets do you want? One ticket price is "+kabirsingh_silver_price);
                count = t.nextInt();
                balance = kabirsingh_silver_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else if (i==3)
            {
                System.out.println("How many platinum tickets do you want? One ticket price is "+kabirsingh_platinum_price);
                count = t.nextInt();
                balance = kabirsingh_platinum_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else
            {
                System.out.println("Invalid Selection");
            }
        }
       
    }

    @Override
    public void super30() {
        System.out.println("Which category seats do you want? \n1. Gold \n2. Silver \n3. Platinum");
        System.out.println("Enter your choice here - ");
        Scanner j= new Scanner(System.in);
        int i;
        i=j.nextInt();
        {
            if (i==0)
            {
                System.out.println("You have no purchase yet");
            }
           else if (i==1)
            {
                System.out.println("How many gold tickets do you want? One ticket price is "+super30_gold_price);
                count = t.nextInt();
                balance = super30_gold_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else if (i==2)
            {
                System.out.println("How many silver tickets do you want? One ticket price is "+super30_silver_price);
                count = t.nextInt();
                balance = super30_silver_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else if (i==3)
            {
                System.out.println("How many platinum tickets do you want? One ticket price is "+super30_platinum_price);
                count = t.nextInt();
                balance = super30_platinum_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else
            {
                System.out.println("Invalid Selection");
            }
        }
    }

    @Override
    public void baaghi() {
        System.out.println("Which category seats do you want? \n1. Gold \n2. Silver \n3. Platinum");
        Scanner j= new Scanner(System.in);
        int i;
        i=j.nextInt();
        {
            if (i==1)
            {
                System.out.println("How many gold tickets do you want? One ticket price is "+baaghi_gold_price);
                count = t.nextInt();
                balance = baaghi_gold_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else if (i==2)
            {
                System.out.println("How many silver tickets do you want? One ticket price is "+baaghi_silver_price);
                count = t.nextInt();
                balance = baaghi_silver_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else if (i==3)
            {
                System.out.println("How many platinum tickets do you want? One ticket price is "+baaghi_platinum_price);
                count = t.nextInt();
                balance = baaghi_platinum_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else{
                    System.out.println("Invalid Selection");
                    }
        }
    }


    @Override
    public void dhadak() {
        System.out.println("Which category seats do you want? \n1. Gold \n2. Silver \n3. Platinum");
        Scanner j= new Scanner(System.in);
        int i;
        i=j.nextInt();
        {
            if (i==1)
            {
                System.out.println("How many gold tickets do you want? One ticket price is "+dhadak_gold_price);
                count = t.nextInt();
                balance = dhadak_gold_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else if (i==2)
            {
                System.out.println("How many silver tickets do you want? One ticket price is "+dhadak_silver_price);
                count = t.nextInt();
                balance = dhadak_silver_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else if (i==3)
            {
                System.out.println("How many platinum tickets do you want? One ticket price is "+dhadak_platinum_price);
                count = t.nextInt();
                balance = dhadak_platinum_price*count;
                System.out.println("Total price is "+balance);
                System.out.println("Thanks for this purchase, Come back Again");
            }
            else
            {
                    System.out.println("Invalid Selection");
                    }
        }
}
}

public class PVRCinemas {
    public static void main(String[] args) {
        movie m=new movie();
        m.select();
    }
}
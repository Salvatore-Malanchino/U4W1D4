package I_LOOP;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //-------------------CONDIZIOALI-------------------//
       /* int x=20,y=10,z=43;
       //IF/ELSE
        if (!(x>z)) System.out.print("x è minore di y");
        else System.out.print("x è maggiore di y");
//TERNARIO
        String r = x > y ? "x è più grande di y" : "x è più piccolo di y";
        System.out.print(r);

        int w = x>y?(x>z?x:z): (y>z?y:z);
        System.out.print(w);*/

//        //----------------SWITCH CASE----------------------//
//        String favouriteDish= "Pesce";
//        switch (favouriteDish){
//            case"Pasta":{System.out.print("Piatto preferito Pasta");
//            break;}
//            case "Kebab":{System.out.print("Piatto preferito Kebab");
//            break;}
//            default:{
//                System.out.print("Nessuno di questi");
//            }
//
//
// SWTICH CASE + SCANNNER
//        Scanner myScanner = new Scanner((System.in));
//        System.out.print("Dammi X");
//        int x= myScanner.nextInt();
//
//        System.out.print("Dammi Y");
//        int y= myScanner.nextInt();
//        int z = x>y ? x: y;
//        switch (z) {
//            case 10:{ System.out.print("z è 10");
//            break;}
//            case 100:{ System.out.print("z è 100");
//            break;}
//            case 1000:{ System.out.print("z è 10000");
//            break;}
//            default:{System.out.print("z non è nessuno di questi");
//            break;}
//
//            }
//            myScanner.close();

        //--------------------LOOPS------------------------//

        Scanner myScanner = new Scanner((System.in));
       System.out.print("Dammi X");
     int x= myScanner.nextInt();

//        System.out.print("Dammi Y");
//       int y= myScanner.nextInt();
//       int z = x>y ? x: y;
//
//       while (x <= x +6){
//           System.out.print(y);
//           y+=3;

        //CON DO
//        do{
//            System.out.print(x = x + 1);
//        }while (x < 10);5 volt

        //-------------FOR--------------//
        for (int i = 0; i <= 10; i++){
//            if (i==2) continue; // salta  il 2 che non verrà stampato
            if (i==5) break;// si ferma a 4 e ristampa 5 volte da 0 a 4
            System.out.print(i);
        }
        }

    }


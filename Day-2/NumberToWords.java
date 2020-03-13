import java.util.Scanner;

class NumberToWords {

    static void text ( int n ) {

        switch ( n ) {

            case        1 : System.out.print("One ");       break;
            case        2 : System.out.print("Two ");       break;
            case        3 : System.out.print("Three ");     break;
            case        4 : System.out.print("Four ");      break;
            case        5 : System.out.print("Five ");      break;
            case        6 : System.out.print("Six ");       break;
            case        7 : System.out.print("Seven ");     break;
            case        8 : System.out.print("Eight ");     break;
            case        9 : System.out.print("Nine ");      break;
            case       10 : System.out.print("Ten ");       break;
            case       11 : System.out.print("Eleven ");    break;
            case       12 : System.out.print("Twelve ");    break;
            case       13 : System.out.print("Thirteen ");  break;
            case       14 : System.out.print("Fourteen ");  break;
            case       15 : System.out.print("Fifteen ");   break;
            case       16 : System.out.print("Sixteen ");   break;
            case       17 : System.out.print("Seventeen "); break;
            case       18 : System.out.print("Eighteen ");  break;
            case       19 : System.out.print("Ninteen ");   break;
            case       20 : System.out.print("Twenty ");    break;
            case       30 : System.out.print("Thirty ");    break;
            case       40 : System.out.print("Fourty ");    break;
            case       50 : System.out.print("Fifty ");     break;
            case       60 : System.out.print("Sixty ");     break;
            case       70 : System.out.print("Seventy ");   break;
            case       80 : System.out.print("Eighty ");    break;
            case       90 : System.out.print("Ninty ");     break;
            case      100 : System.out.print("Hundred ");   break;
            case     1000 : System.out.print("Thousand ");  break;
            case   100000 : System.out.print("Lakh ");      break;
            case 10000000 : System.out.print("Crore ");     break;

        }

    }

    public static void main (String[] args) {

        Scanner scan = new Scanner( System.in );
        System.out.print("Enter your salary :   ");
        int salary = scan.nextInt();
        byte term;

        if ( salary == 0) {
            System.out.println("Zero");
        }

        if ( salary >= 10000000 ) {

            term = (byte) (salary / 10000000);
            if (term <= 20) { text(term); } else {
                text ( term/10 * 10 );
                text ( term % 10 );
            }
            text( 10000000 );
            if ( term > 1 ) { System.out.print("\bs, "); } else { System.out.print(", "); }
            salary %= 10000000;
        }

        if ( salary >= 100000 ) {

            term = (byte) (salary / 100000);
            if (term <= 20) { text(term); } else {
                text ( term/10 * 10 );
                text ( term % 10 );
            }
            text( 100000 );
            if ( term > 1 ) { System.out.print("\bs, "); } else { System.out.print(", "); }
            salary %= 100000;
        }

        if ( salary >= 1000 ) {

            term = (byte) (salary / 1000);
            if (term <= 20) { text(term); } else {
                text ( term/10 * 10 );
                text ( term % 10 );
            }
            text( 1000 );
            salary %= 1000;
        }

        if ( salary >= 100 ) {

            term = (byte) (salary / 100);
            if (term <= 20) { text(term); } else {
                text ( term/10 * 10 );
                text ( term % 10 );
            }
            text( 100 );
            salary %= 100;
        }

        if ( salary >= 1 ) {  

            term = (byte) salary;
            if (term <= 20) { text(term); } else {
                text ( term/10 * 10 );
                text ( term % 10 );
            } 
            
        }


    }

}
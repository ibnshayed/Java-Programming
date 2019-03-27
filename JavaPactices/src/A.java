import java.util.*;
import java.lang.*;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        short bcount = 0;
        short lcount = 0;
        short kcount = 0;
        short n;
        short apcount = 0;

        for(int i = 1; i<= t; i++){
            n = in.nextShort();
            in.nextLine();

            for(int j = 1; j<=n; j++){
                String s = in.next();
                String sub = s.substring(0,3);
                if(sub.equalsIgnoreCase("bed"))
                    bcount += 1;

                else if(sub.equalsIgnoreCase("kit"))
                    kcount += 1;
                else if(sub.equalsIgnoreCase("liv"));
                lcount += 1;
            }


            while(bcount >= 2 && kcount >= 1 && lcount >= 1){
                apcount += 1;
                bcount -= 2;
                kcount -= 1;
                lcount -= 1;
            }

            System.out.println(apcount);
        }
    }
}

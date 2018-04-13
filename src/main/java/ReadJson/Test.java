package ReadJson;

import java.math.BigInteger;

public class Test {
    public static String find(String line){
        int flag1 = 0;
        int flag2 = 0;
        BigInteger n = new BigInteger(line);
        BigInteger n1 = n.add(new BigInteger("1"));
        BigInteger n2 = n.add(new BigInteger("-1"));

        BigInteger sum = new BigInteger("1");

        if (n.equals(BigInteger.ZERO)||n.equals(BigInteger.ONE)){
            return "Bad";
        }
        while(n1.compareTo(sum)>=0){
            if (sum.equals(n1)){
                flag2 = 1;
            }
            sum = sum.shiftLeft(1);;
        }

        if ((!sum.equals(BigInteger.ONE))&&(!sum.equals(new BigInteger("2"))))
            sum = sum.divide(new BigInteger("4"));
        else
            sum = new BigInteger("1");

        while(n2.compareTo(sum)>=0){
            if (sum.equals(n2)){
                flag2 = 1;
            }
            sum = sum.shiftLeft(1);;
        }

        if (flag1==1&&flag2==1){
            return "Very Good";
        }

        if (flag1!=1&&flag2==1){
            return "Good";
        }

        if (flag1==1&&flag2!=1){
            return "Bad";
        }

        return "Normal";

    }
}

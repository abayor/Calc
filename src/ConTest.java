/**
 * Created by cube on 12/21/2016.
 */
public class ConTest {
    public static void main(String[] args) {
        int value1 = 3;
        int value2 = 4;
        int value3 =6;
       int result;
        result = addValues(value1, value2);
        System.out.println("The sum is " + result);

        result = addValues(value1, value2,value3);
        System.out.println("The sum is " + result);
    }


    private static int addValues(int I1, int I2)
        {
            return I1 + I2;
        }
    private static int addValues(int I1, int I2, int I3)
    {
        return I1 + I2+ I3;
    }
    }


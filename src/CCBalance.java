public class CCBalance
{
    static void main()
    {
        double balance = 5000; // inital
        final double RATE = 0.17;


        //balance = balance + interest // interest = balance * RATE

        balance = balance + balance * RATE;  // Month one

        IO.println("The balance after one month is " + balance);

        balance = balance + balance * RATE;  // Month two
        IO.println("The balance after two months is " + balance);


    }
}

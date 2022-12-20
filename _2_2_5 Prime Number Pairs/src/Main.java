import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        final int userInput = 53;
        List<Integer> primeTime = calcPrimesUpTo(userInput);
        System.out.println(primeTime);
    }
    static List<Integer> calcPrimesUpTo(final int input)
    {
        List<Integer> listOfNumbers = new ArrayList<>(); //Populate with all values in range
        List<Integer> listOfPrimes = new ArrayList<>();
        String twin = "Twin:" + " ", cousin = "Cousin:" + " ", sexy = "sexy:" + " ";
        int divisorCounter = 0; //When this counter is > 2 the number is not a prime number
        int listOfPrimesCounter = 0;
        int prime = 0;

        for (int i = 1; i <= input; i++)
        {
            listOfNumbers.add(i);
        }

        for (int i = 1; i < input; i++)
        {
            for (int j = 0; j < input; j++)
            {
                if(listOfNumbers.get(i)%listOfNumbers.get(j) == 0)
                {
                    divisorCounter++; //For every number that is a factor of listOfNumbers.get(i) increment this value
                    prime = listOfNumbers.get(j);
                }
            }
            if(divisorCounter == 2)//A number is prime when only divisible by one and itself, or two factors
            {
                listOfPrimes.add(listOfPrimesCounter, prime);
                listOfPrimesCounter++;
            }
            prime = 0;//Reset for next loop
            divisorCounter = 0;
        }
        //Prime Pairs addition
        for (int i = 0; i < listOfPrimes.size() ; i++) {
            for (int j = 1; j < listOfPrimes.size(); j++) {
                if(listOfPrimes.get(j) - listOfPrimes.get(i) == 2) {
                    twin += listOfPrimes.get(i) + "=" + listOfPrimes.get(j) + " ";
                }
                if(listOfPrimes.get(j) - listOfPrimes.get(i) == 4)
                {
                    cousin += listOfPrimes.get(i) + "=" + listOfPrimes.get(j) + " ";
                }
                if(listOfPrimes.get(j) - listOfPrimes.get(i) == 6)
                {
                    sexy += listOfPrimes.get(i) + "=" + listOfPrimes.get(j) + " ";
                }
            }
        }
        System.out.println(twin);
        System.out.println(cousin);
        System.out.println(sexy);

        return listOfPrimes;
    }
}
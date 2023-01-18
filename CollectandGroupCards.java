import java.util.*;
class Card
{
    String symbol;
    int number;
    public Card(String symbol, int number)
    {
        this.symbol = symbol;
        this.number = number;
    }
    public String getSymbol()
    {
        return symbol;
    }
    public int getNumber()
    {
        return number;
    }
}
public class CollectandGroupCards
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();
        Map<String, List<Card>> map = new TreeMap<>();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter card " + (i + 1) + ":");
            String symbol = sc.next();
            int number = sc.nextInt();
            Card card = new Card(symbol, number);
            if (map.containsKey(symbol))
            {
                map.get(symbol).add(card);
            }
            else
            {
                List<Card> list = new ArrayList<>();
                list.add(card);
                map.put(symbol, list);
            }
        }
        System.out.println("Distinct Symbols are :");
        for (String symbol : map.keySet())
        {
            System.out.print(symbol + " ");
        }
        System.out.println();
        for (String symbol : map.keySet())
        {
            System.out.println("Cards in " + symbol + " Symbol");
            int sum = 0;
            for (Card card : map.get(symbol))
            {
                System.out.print(card.getSymbol() + card.getNumber() + " ");
                sum += card.getNumber();
            }
            System.out.println();
            System.out.println("Number of cards : " + map.get(symbol).size());
            System.out.println("Sum of Numbers : " + sum);
        }
    }
}
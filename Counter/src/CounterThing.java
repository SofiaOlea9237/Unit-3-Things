import org.w3c.dom.css.Counter;

public class CounterThing
{
    public static void main(String[] args)
    {
        Counter tally = new Counter();
        tally.click();
        tally.click();
        int result = tally.getValue();
        System.out.println("Tally result= "+result);
    }
}

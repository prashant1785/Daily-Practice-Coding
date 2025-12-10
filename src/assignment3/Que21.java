package assignment3;
/*21. Create a base class Instrument with a method play().
Create subclasses Guitar and Piano that override play().
Write a program to demonstrate upcasting and downcasting with these objects.*/

class Instrument
{
    public void play()
    {
        System.out.println("Instrument is playing.");
    }
}
class Guitar extends Instrument
{
    @Override
    public void play()
    {
        System.out.println("Guitar is playing.");
    }
    public void tuneStrings()
    {
        System.out.println("Tuning guitar.");
    }
}
class Piano extends Instrument
{
    @Override
    public void play()
    {
        System.out.println("Piano is playing.");
    }
    public void tuneKeys()
    {
        System.out.println("Tuning piano.");
    }
}
public class Que21
{
    public static void main(String[] args)
    {
                //upcasting
        Instrument myGuitar = new Guitar();
        Instrument myPiano = new Piano();

        myGuitar.play();
        myPiano.play();

                //downcasting
        if (myGuitar instanceof Guitar)
        {
            Guitar guitar = (Guitar) myGuitar;
            guitar.tuneStrings();
        }
        if (myPiano instanceof Piano)
        {
            Piano piano = (Piano) myPiano;
            piano.tuneKeys();
        }
    }
}

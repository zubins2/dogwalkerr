import java.util.Scanner;

public class DogWalkCompany
{
    //making the schedule array; 24 to 24 hours a day
    private int[] schedule;

    public DogWalkCompany()
    {
        schedule = new int[24];
    }

    //printing the schedule via concatenating the hour to the value in the int array schedule
    public String toString()
    {
        String s = "";
        for (int i = 0; i < schedule.length; i++)
            s += i + " " + schedule[i] + "\n";
        return s;
    }

    //adding a method that allows a user to input both dogs to be walked and the hour
    public int addDogs()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What hour?");
        int hour = s.nextInt();
        System.out.println("How many dogs?");
        int dogs = s.nextInt();
        schedule[hour] = dogs;
        return hour;
    }

    //returns the hour on the schedule, therefore the number of dogs to be walked.
    public int numAvailableDogs(int hour)
    {
        return schedule[hour];
    }

    public void updateDogs(int hour, int numberDogsWalked)
    {
        schedule[hour] -= numberDogsWalked;
    }

}
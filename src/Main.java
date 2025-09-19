public class Main {
    public static void main(String[] args)
    {
        DogWalkCompany c = new DogWalkCompany();
        System.out.println(c);

        //with the int hour defined the addDogs method runs
        int hour = c.addDogs();
        System.out.println(c);

        //now there is a dogwalker for company c who can walk 4 dogs
        DogWalker w = new DogWalker(4, c);

        //we give them some dogs to walk
        System.out.println(w.walkDogs(hour)+ " dogs walked.");
        System.out.println(c.numAvailableDogs(hour) + " dogs remaining.");

        //allow to add 4 hours at once to the schedule
        for (int i = 7; i < 11; i++)
        {
            c.addDogs();
        }
        //print the schedule
        System.out.println(c);

        //make a dogWalker that can run the chart
        w = new DogWalker(3, c);
        //report how much money this walker made
        System.out.println("$" + w.dogWalkShift(7, 10) + ".00 earned.");
    }
}

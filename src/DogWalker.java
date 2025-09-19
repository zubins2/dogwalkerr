public class DogWalker {

    //maximum dogs the given dog walker CAN walk per ora
    private int maxDogs;
    //the company the given dog walker works for
    private DogWalkCompany company;

    //making the method for adding a dog walker
    //max dogs is max can walk, comp stores the company
    public DogWalker(int max, DogWalkCompany comp)
    {
        maxDogs = max;
        company = comp;
    }

    //the method for a dog walker WALKING the dogs
    //if the dogs to be walked is > maxDogs, rep maxDogs, else rep dogs to be walked
    public int walkDogs(int hour)
    {
            int dogs = company.numAvailableDogs(hour);
            if (dogs < maxDogs)
            {
                company.updateDogs(hour, dogs);
                return dogs;
            }
            else {
                company.updateDogs(hour, maxDogs);
                return maxDogs;
            }
    }

    //we make a walker who will work in a shift, and define the shift beginning and end
    public int dogWalkShift(int startHour, int endHour) {
        int pay = 0;
        while(startHour <= endHour) {
            //make the walker walk the dogs
            int dogs = walkDogs(startHour);
            //for each dog walked, add 5 dabloons to the pay
            pay += dogs * 5;
            //check if the walker is eligible for bonus pay
            if (dogs == maxDogs || startHour >= 9 && startHour <= 17)
            {
                pay += 3;
            }
            //be certain the loop does not go infinitely
            startHour++;
        } return pay;
    }
}

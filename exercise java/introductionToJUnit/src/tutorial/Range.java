package tutorial;

public class Range {

    //fields:
    private final long lowerBound;
    private final long upperBound;

    //contructor:
    public Range(long lowerBound, long upperBound) {

        //allow for an exception:
        if(lowerBound>upperBound){
            throw new IllegalArgumentException("lowerBound is bigger than upperBound!");
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    //methods:
    public boolean isInRange(long number) {

        return number >= lowerBound && number <= upperBound;
    }

}

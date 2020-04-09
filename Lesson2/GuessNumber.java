public class GuessNumber {
    private int compNumber = (int) (Math.random()*101);

    public int getCompNumber() {
        return compNumber;
    }

    void setCompNumber(int compNumber) {
        this.compNumber = compNumber;
    }
}
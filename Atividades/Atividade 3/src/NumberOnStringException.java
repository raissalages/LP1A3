public class NumberOnStringException extends Exception{
    private int triggerNumber;

    public NumberOnStringException(String message, int triggerNumber) {
        super(message);
        this.triggerNumber = triggerNumber;
    }

    public int getTriggerNumber() {
        return triggerNumber;
    }
}

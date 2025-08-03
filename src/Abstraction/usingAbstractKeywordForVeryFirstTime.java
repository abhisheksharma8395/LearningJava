package Abstraction;

public class usingAbstractKeywordForVeryFirstTime {
    public static void main(String[] args) {
        tvRemoteFunctions tv = new tvRemote();
        tv.televisionOn();
        tv.televisionOff();
    }
}
abstract class tvRemoteFunctions{
    abstract void televisionOn();
    abstract void televisionOff();
}

class tvRemote extends tvRemoteFunctions{
    public void televisionOn() {
        System.out.println("TeleVision is On");
    }

    public void televisionOff() {
        System.out.println("TeleVision is Off");
    }
}


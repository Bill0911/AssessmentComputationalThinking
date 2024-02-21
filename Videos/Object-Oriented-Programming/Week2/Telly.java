public class Telly{
    private String brand;
    private String model;
    private int currentVolume;
    private int currentChannel;
    private String childLockPin;

    public Telly(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.currentVolume = 0;
        this.currentChannel = 1;
        this.childLockPin = null;
    }

    public void channelUp() {
        this.currentChannel += 1;
    }

    public void channelDown() {
        this.currentChannel -= 1;
    }

    public void volumeUp() {
        this.currentVolume += 1;
    }

    public void volumeDown() {
        this.currentVolume -= 1;
    }

    public void setChannel(int channel) {
        this.currentChannel = channel;
    }

    public void setChildLock(String pinCode) {
        this.childLockPin = pinCode;
    }

    public void removeChildLock() {
        this.childLockPin = null;
    }

    public boolean isChildLockActive() {
        return this.childLockPin != null;
    }

    @Override
    public String toString() {
        return "Telly{" + "brand: " + brand + ", model: " + model + "}";
    }

    public static void main(String[] args) {
        Telly telly1 = new Telly("Samsung", "Smart");
		telly1.setChildLock("1234");
        System.out.println(telly1);
        System.out.println("Is the childLock active ?: " + telly1.isChildLockActive());
    }
}

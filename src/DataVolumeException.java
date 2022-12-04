public class DataVolumeException extends Exception{
    private int currentVolume;

    public DataVolumeException(int currentVolume) {
        super();
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}

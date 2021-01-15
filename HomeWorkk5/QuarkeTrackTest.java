package HomeWorkk5;
import java.util.Objects;
import java.util.stream.IntStream;

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}

class QuarkeTrack{
    private int total;
    public int getTotal() {
        return total;
    }

    public QuarkeTrack(int[] lines){
        this.total = IntStream.of(lines).sum();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        QuarkeTrack track = (QuarkeTrack) obj;
        return this.total == track.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(total);
    }
}

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
public class Tone {
    public static void main(String[] args) throws LineUnavailableException {
        final AudioFormat af =
            new AudioFormat(Note.SAMPLE_RATE, 8, 1, true, true);
        SourceDataLine line = AudioSystem.getSourceDataLine(af);
        line.open(af, Note.SAMPLE_RATE);
        line.start();
        System.out.printf("99 bottles of beer on the wall, ");
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.G3, 150);
        play(line, Note.REST, 20);
        play(line, Note.G3, 150);
        play(line, Note.REST, 20);
        play(line, Note.G3, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 300);
        play(line, Note.REST, 200);
        System.out.printf("99 bottles of beer\n");
        play(line, Note.D4, 150);
        play(line, Note.REST, 20);
        play(line, Note.D4, 150);
        play(line, Note.REST, 20);
        play(line, Note.D4, 150);
        play(line, Note.REST, 20);
        play(line, Note.A4, 150);
        play(line, Note.REST, 20);
        play(line, Note.A4, 150);
        play(line, Note.REST, 20);
        play(line, Note.A4, 150);
        play(line, Note.REST, 20);
        play(line, Note.D4, 600);
        play(line, Note.REST, 350);
        System.out.printf("Take one down, ");
        play(line, Note.B4, 75);
        play(line, Note.REST, 20);
        play(line, Note.B4, 205);
        play(line, Note.REST, 20);
        play(line, Note.B4, 200);
        play(line, Note.REST, 20);
        play(line, Note.B4, 300);
        play(line, Note.REST, 200);
        System.out.printf("pass it around,\n");
        play(line, Note.B4, 150);
        play(line, Note.REST, 20);
        play(line, Note.B4, 150);
        play(line, Note.REST, 20);
        play(line, Note.B4, 150);
        play(line, Note.REST, 20);
        play(line, Note.B4, 300);
        play(line, Note.REST, 250);
        System.out.printf("98 bottles of beer on the wall\n");
        play(line, Note.G3, 150);
        play(line, Note.REST, 20);
        play(line, Note.G3, 150);
        play(line, Note.REST, 20);
        play(line, Note.REST, 20);
        play(line, Note.A4, 150);
        play(line, Note.REST, 20);
        play(line, Note.A4, 150);
        play(line, Note.REST, 20);
        play(line, Note.B4, 150);
        play(line, Note.REST, 20);
        play(line, Note.B4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 150);
        play(line, Note.REST, 20);
        play(line, Note.C4, 300);
        play(line, Note.REST, 20);
        play(line, Note.C3, 150);
        line.drain();
        line.close();
    }

    private static void play(SourceDataLine line, Note note, int ms) {
        ms = Math.min(ms, Note.SECONDS * 1000);
        int length = Note.SAMPLE_RATE * ms / 1000;
        int count = line.write(note.data(), 0, length);
    }
}

enum Note {

    REST, A3, A3$, B3, C3, C3$, D3, D3$, E3, F3, F3$, G3, G3$, A4, A4$, B4, C4, C4$, D4, D4$, E4, F4, F4$, G4, G4$, A5;
    public static final int SAMPLE_RATE = 16 * 1024; // ~16KHz
    public static final int SECONDS = 2;
    private byte[] sin = new byte[SECONDS * SAMPLE_RATE];

    Note() {
        int n = this.ordinal();
        if (n > 0) {
            double exp = ((double) n - 1) / 12d;
            double f = 440d * Math.pow(2d, exp);
            for (int i = 0; i < sin.length; i++) {
                double period = (double)SAMPLE_RATE / f;
                double angle = 2.0 * Math.PI * i / period;
                sin[i] = (byte)(Math.sin(angle) * 127f);
            }
        }
    }

    public byte[] data() {
        return sin;
    }
}
package com.hamburgcodingschool.design.patterns.e4.prototype;

public class Note implements Cloneable {

    public static final int SAMPLE_RATE = 16 * 1024; // ~16KHz

    private int length;
    private byte[] sin;

    public Note(Pitch pitch, int length) {
        this.length = length;
        sin = new byte[2 * SAMPLE_RATE];
        int n = pitch.ordinal();
        if (n > 0) {
            double exp = ((double) n - 1) / 12d;
            double f = 440d * Math.pow(2d, exp);
            for (int i = 0; i < sin.length; i++) {
                double period = (double) SAMPLE_RATE / f;
                double angle = 2.0 * Math.PI * i / period;
                sin[i] = (byte) (Math.sin(angle) * 127f);
            }
        }
    }

    public byte[] data() {
        return sin;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public Note clone() {
        Note clone = null;
        try {
            clone = (Note) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

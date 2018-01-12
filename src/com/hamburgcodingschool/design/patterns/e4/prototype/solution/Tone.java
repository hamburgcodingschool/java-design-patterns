package com.hamburgcodingschool.design.patterns.e4.prototype.solution;

import com.hamburgcodingschool.design.patterns.e4.prototype.Note;
import com.hamburgcodingschool.design.patterns.e4.prototype.Pitch;
import com.hamburgcodingschool.design.patterns.e4.prototype.solution.NoteCustomizer;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.util.ArrayList;
import java.util.List;

public class Tone {

    public static void main(String[] args) throws LineUnavailableException {
        NoteCustomizer noteCustomizer = new NoteCustomizer();
        List<Note> notes = new ArrayList<>();
        notes.add(noteCustomizer.createNote(Pitch.A4, 200));
        notes.add(noteCustomizer.createNote(Pitch.A4, 200));
        notes.add(noteCustomizer.createNote(Pitch.B4, 400));
        notes.add(noteCustomizer.createNote(Pitch.A4, 400));
        notes.add(noteCustomizer.createNote(Pitch.D4, 400));
        notes.add(noteCustomizer.createNote(Pitch.C4$, 800));

        AudioFormat audioFormat = new AudioFormat(Note.SAMPLE_RATE, 8, 1, true, true);
        SourceDataLine line = AudioSystem.getSourceDataLine(audioFormat);
        line.open(audioFormat, Note.SAMPLE_RATE);
        line.start();
        for (Note n : notes) {
            play(line, n, n.getLength());
            play(line, noteCustomizer.createNote(Pitch.REST, 10), 10);
        }
        line.drain();
        line.close();
    }

    private static void play(SourceDataLine line, Note note, int ms) {
        ms = Math.min(ms, 2 * 1000);
        int length = Note.SAMPLE_RATE * ms / 1000;
        line.write(note.data(), 0, length);
    }
}

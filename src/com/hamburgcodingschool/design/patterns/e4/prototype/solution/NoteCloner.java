package com.hamburgcodingschool.design.patterns.e4.prototype.solution;

import com.hamburgcodingschool.design.patterns.e4.prototype.Note;
import com.hamburgcodingschool.design.patterns.e4.prototype.Pitch;

import java.util.HashMap;
import java.util.Map;

public class NoteCloner {

    private static final Note REST = new Note(Pitch.REST, 200);
    private static final Note A4 = new Note(Pitch.A4, 200);
    private static final Note A4$ = new Note(Pitch.A4$, 200);
    private static final Note B4 = new Note(Pitch.B4, 200);
    private static final Note C4 = new Note(Pitch.C4, 200);
    private static final Note C4$ = new Note(Pitch.C4$, 200);
    private static final Note D4 = new Note(Pitch.D4, 200);
    private static final Note D4$ = new Note(Pitch.D4$, 200);
    private static final Note E4 = new Note(Pitch.E4, 200);
    private static final Note F4 = new Note(Pitch.F4, 200);
    private static final Note F4$ = new Note(Pitch.F4$, 200);
    private static final Note G4 = new Note(Pitch.G4, 200);
    private static final Note G4$ = new Note(Pitch.G4$, 200);
    private static final Note A5 = new Note(Pitch.A5, 200);

    private static final Map<Pitch, Note> NOTE_MAP = new HashMap<Pitch, Note>() {{
        put(Pitch.REST, REST);
        put(Pitch.A4, A4);
        put(Pitch.A4$, A4$);
        put(Pitch.B4, B4);
        put(Pitch.C4, C4);
        put(Pitch.C4$, C4$);
        put(Pitch.D4, D4);
        put(Pitch.D4$, D4$);
        put(Pitch.E4, E4);
        put(Pitch.F4, F4);
        put(Pitch.F4$, F4$);
        put(Pitch.G4, G4);
        put(Pitch.G4$, G4$);
        put(Pitch.A5, A5);
    }};

    public static Note getClonedNote(Pitch pitch) {
        return NOTE_MAP.get(pitch).clone();
    }
}

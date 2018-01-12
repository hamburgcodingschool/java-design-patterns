package com.hamburgcodingschool.design.patterns.e4.prototype.solution;

import com.hamburgcodingschool.design.patterns.e4.prototype.Note;
import com.hamburgcodingschool.design.patterns.e4.prototype.Pitch;

public class NoteCustomizer {

    public Note createNote(Pitch pitch, int length) {
        Note note = NoteCloner.getClonedNote(pitch);
        note.setLength(length);
        return note;
    }

}

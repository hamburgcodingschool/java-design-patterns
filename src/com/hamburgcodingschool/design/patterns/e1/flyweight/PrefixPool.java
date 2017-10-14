package com.hamburgcodingschool.design.patterns.e1.flyweight;

public class PrefixPool {

    private static final String CHECKBOX_EMPTY = "[ ]";
    private static final String CHECKBOX_DONE = "[x]";
    private static final String INDENT_0 = "";
    private static final String INDENT_1 = "\t";
    private static final String INDENT_2 = "\t\t";
    private static final String INDENT_3 = "\t\t\t";
    private static final String INDENT_4 = "\t\t\t\t";
    private static final String INDENT_5 = "\t\t\t\t\t";
    private static final String INDENT_6 = "\t\t\t\t\t\t";
    private static final String INDENT_7 = "\t\t\t\t\t\t\t";
    private static final String INDENT_8 = "\t\t\t\t\t\t\t\t";
    private static final String INDENT_9 = "\t\t\t\t\t\t\t\t\t";
    private static final String INDENT_10 = "\t\t\t\t\t\t\t\t\t\t";
    private static final String[] INDENTS = { INDENT_0, INDENT_1, INDENT_2, INDENT_3, INDENT_4, INDENT_5, INDENT_6,
            INDENT_6, INDENT_7, INDENT_8, INDENT_9, INDENT_10};

    public static String getCheckBox(boolean done) {
        return done ? CHECKBOX_DONE : CHECKBOX_EMPTY;
    }

    public static String getIndent(int indentations) {
        if (indentations < 0) {
            return INDENT_0;
        }
        if (indentations <= 10) {
            return INDENTS[indentations];
        }
        return new String(new char[indentations]).replace("\0", INDENT_1);
    }
}

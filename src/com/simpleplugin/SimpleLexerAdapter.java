package com.simpleplugin;

/**
 * Created by Brandon Elam Barker on 12/22/2014.
 */
import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class SimpleLexerAdapter extends FlexAdapter {
    public SimpleLexerAdapter() {
        super(new SimpleLexer((Reader) null));
    }
}
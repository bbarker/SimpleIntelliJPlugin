package com.simpleplugin;

/**
 * Created by Brandon Elam Barker on 12/22/2014.
 */
import com.intellij.lang.Language;

public class SimpleLanguage extends Language {
    public static final SimpleLanguage INSTANCE = new SimpleLanguage();

    private SimpleLanguage() {
        super("Simple");
    }
}

package com.simpleplugin.psi;

/**
 * Created by Brandon Elam Barker on 12/22/2014.
 */


import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.simpleplugin.SimpleFileType;
import com.simpleplugin.SimpleLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SimpleFile extends PsiFileBase {
    public SimpleFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SimpleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SimpleFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
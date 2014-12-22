package test.com.simpleplugin; 

import com.intellij.psi.tree.IElementType;
import com.simpleplugin.SimpleLexer;
import com.simpleplugin.SimpleLexerAdapter;
import com.simpleplugin.SimpleTypes;
import com.simpleplugin.psi.SimpleElementType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* SimpleLexerAdapter Tester. 
* 
* @author <Authors name> 
* @since <pre>Dec 22, 2014</pre> 
* @version 1.0 
*/ 
public class SimpleLexerAdapterTest {

SimpleLexerAdapter myLexerAdapter = null;
String myPropertiesString = "# You are reading the \".properties\" entry.\n" +
        "! The exclamation mark can also mark text as comments.\n" +
        "website = http://en.wikipedia.org/\n" +
        "language = English\n" +
        "# The backslash below tells the application to continue reading\n" +
        "# the value onto the next line.\n" +
        "message = Welcome to \\\n" +
        "          Wikipedia!\n" +
        "# Add spaces to the key\n" +
        "key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
        "# Unicode\n" +
        "tab : \\u0009";

@Before
public void before() throws Exception {
    myLexerAdapter = new SimpleLexerAdapter();
}


@After
public void after() throws Exception { 
}


@Test
public void testStart() throws Exception {
    myLexerAdapter.start(myPropertiesString, 0, 0, SimpleLexer.YYINITIAL);

}

@Test
public void testAdvance() throws Exception {
    myLexerAdapter.start(myPropertiesString);

    IElementType token;
    String tokenStr;
    token = myLexerAdapter.getTokenType();
    Assert.assertEquals(token, SimpleTypes.COMMENT);
    tokenStr = token.toString(); //null
    System.out.println(tokenStr);
    //
    myLexerAdapter.advance();
    token = myLexerAdapter.getTokenType();
    Assert.assertEquals(token, SimpleTypes.CRLF);
    tokenStr = token.toString();
    System.out.println(tokenStr);

}

}


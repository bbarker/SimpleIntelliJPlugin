package test.com.simpleplugin; 

import com.intellij.psi.tree.IElementType;
import com.simpleplugin.SimpleLexer;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* SimpleLexer Tester. 
* 
* @author <Authors name> 
* @since <pre>Dec 22, 2014</pre> 
* @version 1.0 
*/ 
public class SimpleLexerTest {

   private java.io.Reader myReader;
   private SimpleLexer myLexer;
   

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getTokenStart() 
* 
*/ 
@Test
public void testGetTokenStart() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getTokenEnd() 
* 
*/ 
@Test
public void testGetTokenEnd() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: reset(CharSequence buffer, int start, int end, int initialState) 
* 
*/ 
@Test
public void testReset() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: yystate() 
* 
*/ 
@Test
public void testYystate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: yybegin(int newState) 
* 
*/ 
@Test
public void testYybegin() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: yytext() 
* 
*/ 
@Test
public void testYytext() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: yycharat(int pos) 
* 
*/ 
@Test
public void testYycharat() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: yylength() 
* 
*/ 
@Test
public void testYylength() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: yypushback(int number) 
* 
*/ 
@Test
public void testYypushback() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: advance() 
* 
*/ 
@Test
public void testAdvance() throws Exception {
   // Apparently, IntelliJ does not use this interface
   // ... which MAY be why it appears to be broken.
   IElementType token;
   int i = 0;
   myReader = new java.io.StringReader("# You are reading the \".properties\" entry.\n" +
           "! The exclamation mark can also mark text as comments.\n" +
           "website = http://en.wikipedia.org/");
   myLexer = new SimpleLexer(myReader);
   System.out.println(myLexer.yylength());
   token = myLexer.advance();
   /*
   while ((token = myLexer.advance()) != ATSTypes.EOF) {
      i = i + 1;
      System.out.print(i);
      System.out.print(": ");
      System.out.println(token.toString());
      break;
   }
   */
   System.out.println(myLexer.yylength());
   System.out.println(token.toString());

   // Temp test:
   char[] mycbuf = new char[100];
   myReader.read(mycbuf,0,99);
   System.out.println(mycbuf);

} 


/** 
* 
* Method: zzUnpackAction() 
* 
*/ 
@Test
public void testZzUnpackAction() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackAction"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzUnpackAction(String packed, int offset, int [] result) 
* 
*/ 
@Test
public void testZzUnpackActionForPackedOffsetResult() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackAction", String.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzUnpackRowMap() 
* 
*/ 
@Test
public void testZzUnpackRowMap() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackRowMap"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzUnpackRowMap(String packed, int offset, int [] result) 
* 
*/ 
@Test
public void testZzUnpackRowMapForPackedOffsetResult() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackRowMap", String.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzUnpackTrans() 
* 
*/ 
@Test
public void testZzUnpackTrans() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackTrans"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzUnpackTrans(String packed, int offset, int [] result) 
* 
*/ 
@Test
public void testZzUnpackTransForPackedOffsetResult() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackTrans", String.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzUnpackAttribute() 
* 
*/ 
@Test
public void testZzUnpackAttribute() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackAttribute"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzUnpackAttribute(String packed, int offset, int [] result) 
* 
*/ 
@Test
public void testZzUnpackAttributeForPackedOffsetResult() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackAttribute", String.class, int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzUnpackCMap(String packed) 
* 
*/ 
@Test
public void testZzUnpackCMap() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzUnpackCMap", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzRefill() 
* 
*/ 
@Test
public void testZzRefill() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzRefill"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzScanError(int errorCode) 
* 
*/ 
@Test
public void testZzScanError() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzScanError", int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: zzDoEOF() 
* 
*/ 
@Test
public void testZzDoEOF() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SimpleLexer.getClass().getMethod("zzDoEOF"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 

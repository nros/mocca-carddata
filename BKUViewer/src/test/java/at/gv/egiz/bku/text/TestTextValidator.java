/*
* Copyright 2008 Federal Chancellery Austria and
* Graz University of Technology
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package at.gv.egiz.bku.text;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Ignore;
import org.junit.Test;

import at.gv.egiz.bku.viewer.ValidationException;
import at.gv.egiz.bku.viewer.Validator;
import at.gv.egiz.bku.viewer.ValidatorFactory;

public class TestTextValidator {

  public static byte[] generateText(String encoding) throws UnsupportedEncodingException {
    
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    PrintWriter writer = new PrintWriter(new OutputStreamWriter(bos, encoding));

    writer.write("C0 Controls and Basic Latin  0x0009-0x000A");
    writer.write("\n");
    for (char c = '\t'; c <= '\n'; c++) {
      writer.write(c);
    }
    writer.write("\n");
    writer.write("C0 Controls and Basic Latin  0x000C-0x000D");
    writer.write("\n");
    for (char c = '\f'; c <= '\r'; c++) {
      writer.write(c);
    }
    writer.write("\n");
    writer.write("C0 Controls and Basic Latin  0x0020-0x007E");
    writer.write("\n");
    for (char c = '\u0020'; c <= '\u007E'; c++) {
      writer.write(c);
    }
    writer.write("\n");
    writer.write("C1 Controls and Latin-1 Supplement  0x00A1-0x00FF");
    writer.write("\n");
    for (char c = '\u00A1'; c <= '\u00FF'; c++) {
      writer.write(c);
    }
    writer.write("\n");
    writer.write("Latin Extended-A  0x0100-0x017F");
    writer.write("\n");
    for (char c = '\u0100'; c <= '\u017F'; c++) {
      writer.write(c);
    }
    writer.write("\n");
    writer.write("Spacing Modifier Letters  0x02C7");
    writer.write("\n");
    writer.write("\u02C7");
    writer.write("\n");
    writer.write("Spacing Modifier Letters  0x02D8");
    writer.write("\n");
    writer.write("\u02D8");
    writer.write("\n");
    writer.write("Spacing Modifier Letters  0x02D9");
    writer.write("\n");
    writer.write("\u02D9");
    writer.write("\n");
    writer.write("Spacing Modifier Letters  0x02DB");
    writer.write("\n");
    writer.write("\u02DB");
    writer.write("\n");
    writer.write("Spacing Modifier Letters  0x02DD");
    writer.write("\n");
    writer.write("\u02DD");
    writer.write("\n");
    writer.write("General Punctuation   0x2015");
    writer.write("\n");
    writer.write("\u2015");
    writer.write("\n");
    writer.write("Currency Symbols 0x20AC");
    writer.write("\n");
    writer.write("\u20AC");
    writer.flush();
  
    return bos.toByteArray();
    
  }
  
  public void testTextValidation(String encoding) throws ValidationException, UnsupportedEncodingException {
    
    Validator validator = ValidatorFactory.newValidator("text/plain");
    
    assertNotNull(validator);

    InputStream is = new ByteArrayInputStream(generateText(encoding));
    
    assertNotNull(is);
    
    validator.validate(is, encoding);
    
  }

  @Test
  public void testUTF8() throws ValidationException, UnsupportedEncodingException {
    testTextValidation("UTF-8");
  }

  @Test
  public void testISO8859_1() throws ValidationException, UnsupportedEncodingException {
    testTextValidation("ISO-8859-1");
  }

  @Test
  public void testISO8859_2() throws ValidationException, UnsupportedEncodingException {
    testTextValidation("ISO-8859-2");
  }

  @Test
  public void testISO8859_3() throws ValidationException, UnsupportedEncodingException {
    testTextValidation("ISO-8859-3");
  }

  @Test
  public void testISO8859_9() throws ValidationException, UnsupportedEncodingException {
    testTextValidation("ISO-8859-9");
  }

  @Ignore
  @Test
  public void testISO8859_10() throws ValidationException, UnsupportedEncodingException {
    testTextValidation("ISO-8859-10");
  }

  @Test
  public void testISO8859_15() throws ValidationException, UnsupportedEncodingException {
    testTextValidation("ISO-8859-15");
  }
  
}

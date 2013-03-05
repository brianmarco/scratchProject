package brianmarco.scratchProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import brianmarco.scratchProject.App;

public class AppTest {
	
	@Test
	public void testDoReverseWords() {
		String result = App.doReverseWords(new String[] {"Hello", "There"});
		assertEquals("olleH erehT", result);
	}
	
	@Test
	public void testDoReverseWordsNullInput() {
		String result = App.doReverseWords(null);
		assertEquals(null, result);
	}
	
	@Test
	public void testDoReverseWordsEmptyInput() {
		String result = App.doReverseWords(new String[] {});
		assertEquals(null, result);
	}
}

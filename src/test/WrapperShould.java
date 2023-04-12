import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import wordWrap.Wrapper;
import wordWrap.ExceptionWrapper;

import static org.junit.jupiter.api.Assertions.assertThrows;

/*
"",2 -> exception
"Happy", -2 -> exception
"Happy", 10 -> "happy"
"Happy", 3 -> "hap\npy"
"The happiness",10 -> "the\nhappiness"
 */


class WrapperShould {

    @Test
    void return_an_exception_if_no_texts_exist() {
        var errorMessage = "format or extension error";
        ExceptionWrapper capturedExcepcion = assertThrows(ExceptionWrapper.class, () ->
                Wrapper.Wrap("",2));
        Assertions.assertEquals(errorMessage, capturedExcepcion.getMessage());
    }

    @Test
    void return_an_exception_if_the_column_number_is_negative() {
        var errorMessage = "format or extension error";
        ExceptionWrapper capturedExcepcion = assertThrows(ExceptionWrapper.class, () ->
                Wrapper.Wrap("happy",-2));
        Assertions.assertEquals(errorMessage, capturedExcepcion.getMessage());
    }

    @Test
    void returns_the_text_if_the_column_number_is_greater_than_the_length_of_the_text () throws ExceptionWrapper {
        String text = "Happy";
        int columnNumber = 4;
        String resultText = Wrapper.Wrap(text,columnNumber);
        Assertions.assertEquals("Happy",resultText);

    }
}

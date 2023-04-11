import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import wordWrap.Wrapper;

import static org.junit.jupiter.api.Assertions.assertThrows;

/*
"",2 -> ""
"happy", -2 -> "" exception
"happy", 10 -> "happy"
"happy", 3 -> "hap\npy"
"the happiness",10 -> "the\nhappiness"
 */


class WrapperShould {

    @Test
    void return_an_exception_if_no_texts_exist (){
        var errorMessage = "error: there must be at least one word";
        exceptionWrapper capturedExcepcion = assertThrows(exceptionWrapper.class, () ->
                Wrapper.wrap("",2));
        Assertions.assertEquals(errorMessage,capturedExcepcion.getMessage());
    }

}
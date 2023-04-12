package wordWrap;


public class Wrapper {
    public static String Wrap(String text, int columnNumber) throws ExceptionWrapper {

        if ((text.equals("")) || (columnNumber <= 0)) {
            var errorMessage = "format or extension error";
            throw new ExceptionWrapper(errorMessage);
        }
        if (text.length() >= columnNumber) {

        }
        return text;
    }
}


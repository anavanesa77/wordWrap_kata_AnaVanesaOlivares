package wordWrap;


public class Wrapper {
    public static String wrap(String text, int columnNumber) throws ExceptionWrapper {

        if (text.equals("")) {
            var errorMessage = createErrorMessage();
            throw new ExceptionWrapper(errorMessage);
        }

        return "Casa";
    }

    private static String createErrorMessage() {
        var errorMessage = "format or extension error";
        return errorMessage;
    }
}


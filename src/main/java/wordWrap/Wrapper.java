package wordWrap;


public class Wrapper {
    public static String Wrap(String text, int columnNumber) throws ExceptionWrapper {
        createErrorMessage(text, columnNumber);
        String textWithoutSpaces = text.trim();
        if (textWithoutSpaces.length() > columnNumber) {
            String firstLine = textWithoutSpaces.substring(0, columnNumber) + "\n";
            String secondLine = textWithoutSpaces.substring(columnNumber);
            return firstLine + secondLine;
        }
        return text;
    }

    private static String createErrorMessage(String text, int columnNumber) throws ExceptionWrapper {
        if ((text.equals("")) || (columnNumber <= 0)) {
            var errorMessage = "format or extension error";
            throw new ExceptionWrapper(errorMessage);
        }
        return text;
    }

}




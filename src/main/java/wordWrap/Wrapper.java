package wordWrap;


public class Wrapper {
    public static String wrap(String text, int columnNumber) throws ExceptionWrapper {

        try {
            if (text.equals("")) {
                throw new ExceptionWrapper(0);
            }
        } catch (ExceptionWrapper ex) {
            System.out.println(ex.getMessage());
        }
        return text;
    }
}

public class InputHandler {

    public boolean isValid(String input, Calculator calculator) {

        int SysChis = switch (calculator.getSystem()) {
            case 1 -> 2;
            case 2 -> 8;
            case 4 -> 16;
            default -> 10;
        };

        try {
            Integer.parseInt(input, SysChis);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

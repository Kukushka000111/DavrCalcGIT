public class HexSys extends Calculator {

    @Override
    public long parse(String input) {
        return Long.parseLong(input);
    }

    @Override
    public String format(int number) {
        return Integer.toString(number);
    }

    @Override
    public int getSystem() {
        return 4;
    }
}

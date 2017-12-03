public class Day1 {
    public static void main(String[] captcha) {
        int sum = 0;
        int[] values = new int[captcha[0].length()];
        System.out.println(values.length);
        int n = 0;
        for (char number : captcha[0].toCharArray()) {
            values[n] = Integer.valueOf(number) - 48;
            n++;
        }

        for (int i = 0; i < values.length - 2; i++) {
            if (values[i] == values[i + 1]) {
                System.out.println("Two similar at index: " + i + " value: " + values[i]);
                sum += values[i];
                System.out.println("Current sum: " + sum);
            }
        }

        if (values[values.length - 1] == values[0]) {
            System.out.println("Last equals first: " + values[0]);
            sum+= values[0];
        }

        System.out.println("Result: " + sum);

    }
}

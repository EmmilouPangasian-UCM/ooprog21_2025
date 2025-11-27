public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder nameString = new StringBuilder("Barbara");
        StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");

        System.out.println("(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());

        nameString.setLength(20);
        addressString.setLength(20);

        String cleanName = nameString.toString().replace("\0", " ");
        String cleanAddress = addressString.toString().replace("\0", " ");

        System.out.println("(Length set to 20 for StringBuilder 1) The name is \"" + cleanName + "\" end");
        System.out.println("(Length set to 20 for StringBuilder 2) The address is \"" + cleanAddress + "\"");
    }
}
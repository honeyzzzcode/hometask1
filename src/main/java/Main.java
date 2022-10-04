public class Main {
    public static void main(String[] args) {
Invoice table = new Invoice("123", "table", 4,-100);
System.out.println(table.GetInvoiceAmount(table.Quantity, table.Price));
    }
}

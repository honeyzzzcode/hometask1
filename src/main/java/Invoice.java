public class Invoice {

    String Number;
    String Description;
    int Quantity;
    int Price;
    public Invoice(String number, String description, int quantity, int price) {
        Number = number;
        Description = description;
        Quantity = quantity;
        Price = price;
        if (Quantity<0 ){
            setQuantity(0);
        }if (Price<0 ){
            setPrice(0);
        }
    }

public int GetInvoiceAmount (int quantity, int price){

int result = quantity * price;

        return result;
}
    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }



}

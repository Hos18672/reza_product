
public class Product {

    private String name = "Coca Cola2";
    private float price = 10;

    public Product(String name, float price)
    {
        setName(name);
        setPrice(price)

    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
    
    
    public void setPrice(float price)
    {
        this.price=price;
    }

    public float getPrice()
    {
        return price;
    }

}

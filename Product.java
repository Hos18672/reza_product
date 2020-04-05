
public class Product {
    private String name = "Coca Cola2";
    private onStock: boolean = true;
   private float price = 10;
    public Product(String name)
    {
        setName(name);
	setOnStock(true);

    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setsetOnStock(boolean onStock)
   {
	this.onStock=onStock;
   }
    public String getName()
    {
        return name;
    }
    public boolean getOnStock()
   {
      return onStock;
   }
}

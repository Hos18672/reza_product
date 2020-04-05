
public class Product {

    private String name = "Coca Cola2";
    private float price =10;
    private int id;
    

    public Product(String name, float price ,int id)
    {
        setName(name);
        setPrice(price);
        setId(id);

    }

    public void setName(String name)
    {
        this.name=name;
    }
   public void setPrice(price);
   {
      this.price= price;
   }
      
    public void  setId(id);
    {
        this.id= id;
    }
    
    
    
    public String getName()
    {
      return name;
    }
      public float getPrice()
    {
      return price;
    }
     public int getId()
    {
      return id;
    }
    
    
    
}

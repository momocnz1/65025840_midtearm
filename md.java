public class md{
    public static void main(String[] args) {
        Product p = new Product("chair", 500.0);
        Electronics e = new Electronics("Television", 20000.0, "Samsung", "Neo QLED");
        Smartphone s = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "IOS");
        Book b = new Book("OOP Programming", 250.0, "John Doe", 300);
        p.Showproduct();
        e.Showeletronics();
        s.Showsmartphone();
        b.Showbook();
    }
}
class Product{
    public String name;
    public double price;
    Product(String name,double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;           
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void Showproduct(){
        System.out.println("Product Name : " + this.name);        
        System.out.println("Product Price : " + this.price);            
    }
}
class Electronics extends Product{
    public String brand;
    public String model;
    Electronics(String name,double price,String brand,String model){
        super(name, price);
        this.brand = brand;
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;        
    }
    public void setModel(String model){
        this.model = model;
    }
    public void Showeletronics(){
        System.out.println("Product Name : " + this.name);        
        System.out.println("Product Price : " + this.price);         
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);      
    }
}        
class Smartphone extends Electronics{
    public String ops;
    Smartphone(String name,double price,String brand,String model,String ops){
        super(name, price, brand, model);
        this.ops = ops;
    }
    public String getOps(){
        return ops;            
    }
    public void setops(String ops){
        this.ops = ops;
    }
    public void Showsmartphone(){
        System.out.println("Product Name : " + this.name);        
        System.out.println("Product Price : " + this.price);         
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);  
        System.out.println("Operating System : " + this.ops);            

    }
}

class Book extends Product{
    public String author;
    public int pages;
    Book(String name,double price,String author,int pages){
        super(name, price);
        this.author = author;
        this.pages = pages;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPages(){
        return pages;          
    }
    public void setPrice(int pages){
        this.pages = pages;
    }   
    public void Showbook(){
    System.out.println("Product Name : " + this.name);        
    System.out.println("Product Price : " + this.price);
    System.out.println("Author : " + this.author);
    System.out.println("Nuber of Pages : " + this.pages);            
    }   
}


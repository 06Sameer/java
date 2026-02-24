class Laptop{
    String name;
    String RAM;
    int price;
    public Laptop(String name,String RAM, int price){
        this.name = name;
        this.RAM = RAM;
        this.price = price;
    }
    void details(){
        System.out.println(name+" "+RAM+" "+price);
    }


}

 class main9{
    public static void main(String[] args){
       Laptop L1 = new Laptop("LENOVO","512GB",80000);

       L1.details();
    }
}
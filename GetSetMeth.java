class gSmethod{
     private int id;
    private String name;
    public String getName(){
        return name;
   }
   public void setName(String n){
    this.name=n;
   }
   public int getId(){
    return id;
   }
   public void setId(int i){
    this.id=i;
   }
}
public class GetSetMeth{
    public static void main(String[] args){
        gSmethod obj=new gSmethod();
        obj.setId(1);
        obj.setName("John");
        System.out.println("ID: "+obj.getId());
        System.out.println("Name: "+obj.getName());
    }
    
}

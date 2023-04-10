import java.beans.*;
class mybean{
    private String name;
    public mybean(){
        name="hari";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class MyBeanInfo extends SimpleBeanInfo{
    public PropertyDescriptor[] getPropertyDescriptors(){
        try{
            PropertyDescriptor prop=new PropertyDescriptor("name",mybean.class);
            prop.setDisplayName("Name");
            return new PropertyDescriptor[] {prop};
        }
        catch(Exception e){
            return null;
        }
    }
}
public class mybeans {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo in=Introspector.getBeanInfo(mybean.class);
        PropertyDescriptor[] pr=in.getPropertyDescriptors();
        for(PropertyDescriptor p:pr){
            System.out.println(p.getDisplayName());
        }
    }
    
}

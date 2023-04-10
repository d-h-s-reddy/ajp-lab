import java.beans.*;
class mybeanvalues{
    private String[] values=new String[10];
    public void setValue(int index,String value){
        values[index]=value;
    }
    public String getValue(int index){
        return values[index];
    }
    public void setValues(String[] values){
        this.values=values;
    }
    public String[] getValues(){
        return values;
    }
}
class beancl extends SimpleBeanInfo{
      public PropertyDescriptor[] getPropertyDescriptors(){
        try{
            PropertyDescriptor values=new IndexedPropertyDescriptor("values",mybeanvalues.class,"getValues","setValues",null,null);
            return new PropertyDescriptor[] {values};
        }
        catch(Exception e){
            return null;
        }
      }
}
public class mybean1 {
    public static void main(String[] args) {
        mybeanvalues b=new mybeanvalues();
        b.setValue(1,"hari");
        b.setValue(2,"sankar");
        System.out.println(b.getValue(1));
        System.out.println(b.getValue(2));
    }
}

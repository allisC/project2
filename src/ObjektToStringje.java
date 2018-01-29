
public class ObjektToStringje {
    
    private String name1 = "nevem";
    public static int sorszam = 0;
    
    
    

    public ObjektToStringje(String name1) {
        super();
        this.name1 = name1+2;
        sorszam++;
    }




    public String toString(){
        
        //getClass().getName() + '@' + Integer.toHexString(hashCode())

        return getName() + '@' +sorszam+"kk";
    }
    
   

  
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }




    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name1;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name1 = name;
    }
}

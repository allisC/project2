import static java.lang.Math.*;  //static metódusokat importál, nem az osztályt.


public class HelloCsilla {
  
    static int NUMBER = 200;
    private static int counter = 0;


    public static void main(String[] args) {
        System.out.print("Hi! ");
        System.err.println("Hu!");
        
        String s="Ez itt egy mondat.";
        String[] sArray=s.split(" ");
        for (String a: sArray)
            System.out.println(a);
        
        s=s.replace(" ", "_");
        System.out.println(s);
        
        StringBuffer sb =new StringBuffer("elso");
        sb.append(" masodik");
        sb.reverse();
        System.out.println(sb);

        sb.append(" harmadik").append(" negyedik").append(" harmadik").append(" negyedik");
        sb.setCharAt(0, 'E');
        System.out.println(sb);
        sb.delete(1, 4);
        System.out.println(sb);
        
        String s3="abcdefgh abcdefgh ";
      //??  s3.replaceAll([abc], "h");
        System.out.println(s3);
        
        
        System.out.println(inc1(NUMBER));
        System.out.println(NUMBER);       

        System.out.println(inc2(NUMBER)); 
        System.out.println(NUMBER);       

        System.out.println(inc2(NUMBER));  
        System.out.println(NUMBER);    
        
        szamol();
        System.out.println(getCounter());
        
        ObjektToStringje oS = new ObjektToStringje("elso");
        System.out.println(oS);

    }
 static int inc1(int i) {
     i++;
     return i;
 }
 
 static Integer inc2(Integer i) {
     i++;
     return i;
 }
 
 public static void szamol() {
     counter++;
 }
 
 public static int getCounter() {
     return counter;
 }
 

}


import java.util.ArrayList;
public class varvid {
  //  public static void main (String args[]) {
    int id;
    static ArrayList<String> varvide_list;
    static{
        varvide_list = new ArrayList<String>();
        varvide_list.add("punane");
        varvide_list.add("oranz");
        varvide_list.add("kollane");
        varvide_list.add("heleroheline");
        varvide_list.add("roheline");
        //System.out.println(varvide_list);
    }

    public varvid (String text) {
        //varvide_list = new ArrayList<String>();
        id = varvide_list.indexOf(text);
    }
    
    public int varvideId() {
        return id;
    }
    
    public varvid segaVarvid (varvid varv) {
        System.out.println(id+" "+varv.id);
        String varvi_nimi = varvide_list.get((id + varv.id) / 2);
        return new varvid(varvi_nimi);
    }
    public String toString(){
        return varvide_list.get(id);
    }
}
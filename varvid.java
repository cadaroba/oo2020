public class varvid{
    static String[] varvide_list = new String[] {"punane", "oranž", "kollane", "heleroheline", "roheline"};
    int id;
    
    public varvid (String text) {
        id = varvide_list.indexOf(text);//leiab id
    }
    
    public int varvideId() {
        return id;
    }
    
    public varvid segaVarvid (varvid varv) {
        String id2 = varvide_list[(id + varv.id) / 2];
        return new varvid(id2);
    }
}
public class varvid{
    static string[] varvid = new string[] {"punane", "oranž", "kollane", "heleroheline", "roheline"};
    int id;
    
    public Varv (String text) {
        id = varvid.find_id(text);
    }
    
    public int varvideId() {
        return id;
    }
    
    public segaVarvid (Varv varv) {
        id = varvid[(varv1.id + varv2.id) / 2];
    }
}
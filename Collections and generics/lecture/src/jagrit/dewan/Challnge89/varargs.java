package jagrit.dewan.Challnge89;

class varargs {
    public static void main(String[] args) {
        System.out.println(Concatenate("Jagrit","Dewan", "Java","Developer"));
    }
    public static String Concatenate(String...strs){
    StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
            
        }
        return sb.toString();
    }
}

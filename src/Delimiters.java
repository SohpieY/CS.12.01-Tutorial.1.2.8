import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open; closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] token) {
        ArrayList<String> newDelimiter = new ArrayList<>();
        for(String tokens : token){
            //check if the array.contains "<q>" || "</q>" || ")" || "("
            if(tokens.equals(openDel) || tokens.equals(closeDel)){
                newDelimiter.add(tokens);
            }

        }

        return newDelimiter;
    }

        // To be implemented.

    public boolean isBalanced(ArrayList<String> delimiters) {
        int count = 0;
        for(String check : delimiters){
            if(check.equals(openDel)){
                count++;
            }else if(check.equals(closeDel)){
                count--;
            }

            if(count < 0){
                return false;
            }
        }

        return count == 0;

    }

    public String getOpenDel(){
        return openDel;
    }

    public String getCloseDel(){
        return closeDel;
    }

    public void setOpenDel(String x){
        openDel = x;
    }

    public void setCloseDel(String y){
        closeDel = y;
    }
}
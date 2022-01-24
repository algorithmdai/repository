package Demo;

public class ScoreException extends Exception {
    public ScoreException(){}
    public ScoreException(String message){
        super(message);
    }
}


public class teacher {
    public void checkScore(int score) throws ScoreException{
        if(score<0||score>100){
            throw new ScoreException("分数不在正常区间内");
        }else{
            System.out.println(score);
        }
    }
}


    public static void main(String[] args){
        teacher t=new teacher();
        try {
            t.checkScore(1010);
        }catch(ScoreException s){
            s.printStackTrace();
        }
}
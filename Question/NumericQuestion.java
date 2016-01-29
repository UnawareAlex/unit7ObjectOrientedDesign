
public class NumericQuestion extends Question
{
    private double answer;
    
    //this is an example of overloading 
    //(the setanswer method that takejs a String is being overloaded)
    public void setAnswer(double correctResponse)
    {
        this.answer = correctResponse;
    }
    
    //this is an example of method overriding
    //(the checkAnswer method in the question class is being overriden)
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }
}

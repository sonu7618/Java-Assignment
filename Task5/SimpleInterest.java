/* Write a Java program to create a class called “Simple Interest” with a data fields principle, time Add commentMore actions
and rate, using setter getter method and print the values.*/


public class SimpleInterest {
    private double principal;
    private double time;
    private double rate;

    // setter
    public void setPrincipal(double principal){
        this.principal = principal;
    }
    public void setTime(double time){
        this.time = time;
    }
    public void setRate(double rate){
        this.rate = rate;
    }

    // getter
    public double getPrincipal(){
        return principal;
    }
    public double getTime(){
        return time;
    }
    public double getRate(){
        return rate;
    }

    public void printValues(){
        System.out.println("Principle: " + getPrincipal());
        System.out.println("Time: " + getTime());
        System.out.println("Rate: " + getRate()+"%");
    }
}

class SimpleInterestimp{
    public static void main(String[] args) {
        SimpleInterest SI = new SimpleInterest();
        SI.setPrincipal(100000);
        SI.setTime(5);
        SI.setRate(10);

        SI.printValues();
    }
}

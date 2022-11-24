import Models.students;

public class Main {
    public static void main(String[] args) {

        students asim= new students("Shreyash",18,468.00);
        students Maruti = new students("Roger",16,478.00);
        students Hari = new students("Kyle",17,387.00);
        students Ram = new students("Ram",20,486.00);

        String out = "The name of student is "+asim.getName()+" of age "+asim.getAge()+" the obtained marks is "+asim.getObtained_marks()+"The obtained percentage is"+ asim.getPercentage() ;
        System.out.println("The obtained percentage is "+asim.getPercentage());
//        if (asim.getVote()){
//            System.out.println("You are eligible to vote");
//        }
//        else {
//            System.out.println("you are not eligible to vote ");
//        }

        System.out.println(Ram.getAgee());

    }

}
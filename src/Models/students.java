package Models;



public class students {

    String name;

    int age;

    Double obtained_marks;
    private boolean vote;

    public void start() {
        System.out.println("Started");
    }
    public void stop() {
        System.out.println("Stopped");
    }

    public students(String name, int age, Double obtained_marks) {
        this.name = name;
        age = age;
        this.obtained_marks = obtained_marks;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {    age = age;    }


    public Double getObtained_marks() { return obtained_marks;  }
    public void setObtained_marks(Double obtained_marks) {
        this.obtained_marks = obtained_marks;
    }


    public int getPercentage() {
        int percentage = (int) (this.obtained_marks /5);

        return percentage;

    }

//    public boolean getVote(){
//        if (this.getAge()>18){
//            boolean vote = true;
//        }
//        else {
//            boolean vote =false;
//        }
//        return vote;
//    }

    public String getAgee() {
        String eligible = this.name + " is Good to vote(18+)";
        String non_eligible = this.name + " is not eligible to vote(-18)";

        if ((this.age) >= 18) {
            return eligible;
        } else {
            return non_eligible;
        }

    }

}

//
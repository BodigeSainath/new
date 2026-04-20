public class Student {
    int StID;
    String SName;
    String DoB;
    int Age;
    int DID;
    String DName;
    Student(){
        System.out.println("Default constructor");
    }
    Student(int StID,String SName,String DoB,int Age){
        this.StID=StID;
        this.SName=SName;
        this.DoB=DoB;
        this.Age=Age;
    }
    public void GetDetails(){
        System.out.println("Name: "+SName + "\nStID: "+StID + "\nDoB: "+DoB+ "\nAge: "+Age);
    }
    public void setDept(int DID,String DName){
        this.DID=DID;
        this.DName=DName;
    }
    public void getDept(){
        System.out.println("DID: "+DID+"\nDName: "+DName+"\n");
    }
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student(1,"SaiVignesh","01-09-2000",26);
        Student s2=new Student(2,"ChetanVarma","12-05-2001",25);
        s1.GetDetails();
        s1.setDept(3,"CSE");
        s1.getDept();
        s2.GetDetails();
        s2.setDept(5,"ECE");
        s2.getDept();
    }
}

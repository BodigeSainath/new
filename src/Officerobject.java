public class Officerobject {
    public  static void main (String [] args) {

        officer[] of1 = getofficerdetials();

        for (int i = 0; i < of1.length; i++) {
            System.out.println(of1[0].firstName);
            System.out.println(of1[1].lastName);

            if(of1[1].age <=25){
                System.out.println("junior officer");
            }
            else{
                System.out.println("senior officer");
            }
        }
    }
    public static officer[] getofficerdetials() {
        officer of = new officer();
       of.firstName = "john";
       of.lastName = "owl";
       of.age = 25;
       of.id = 1;
       of.salary = 6500;
       officer off = new officer();
       off.firstName = "smith";
       off.lastName = "owl";
       off.age  = 30;
       off.id = 2;
       off.salary = 6800;

       officer[] of2 = new officer[2];
       of2[0] = of;
       of2[1] = off;
       return of2;


    }

}

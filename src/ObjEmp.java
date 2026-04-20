public class ObjEmp {
    public static  void main (String [] args) {

        BrahmiEmploye[] e1 = getBrahmiEmploye();
        for (int i = 0; i < e1.length; i++) {
            System.out.println(e1[0].fullNames);
            System.out.println(e1[0].age);
        }
    }

    public static BrahmiEmploye[] getBrahmiEmploye() {

        BrahmiEmploye[] e2 = new BrahmiEmploye [2];
        BrahmiEmploye emp1=new BrahmiEmploye();
        emp1.fullNames = "haley";
        emp1.age = 26;

        BrahmiEmploye emp2=new BrahmiEmploye();
        emp2.fullNames = "chandu";
        emp2.age = 28;

        e2[0]= emp1;
        e2[1] = emp2;

        return e2;





    }


    }



package collections;

public class SubSectorLookUp {
    int SubSectorID;
    String SubSectorName;
    SectorLookup Sec;
    SubSectorLookUp(){

    }
    SubSectorLookUp(int id, String name,SectorLookup s){
        this.Sec=s;
        this.SubSectorID=id;
        this.SubSectorName=name;

    }
}

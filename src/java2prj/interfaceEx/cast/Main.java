package java2prj.interfaceEx.cast;

public class Main {
    public static void main(String[] args) {
      
        Unit unit1 = new Archer();
        Unit unit2 = new Warrior();
        Unit unit3 = new Thief();

        Archer archer = (Archer) unit1;
        Warrior warrior = (Warrior) unit2;
        Thief thief = (Thief) unit3;


        unit1.attack();
        unit2.attack();
        unit3.attack();

        archer.attack();
        warrior.attack();
        thief.attack();
    }
}
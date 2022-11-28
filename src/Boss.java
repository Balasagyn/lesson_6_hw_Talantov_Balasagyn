public class Boss extends GameEntity {
    private   Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private int numberofarrows;

    public int getNumberofarrows() {
        return numberofarrows;
    }

    public void setNumberofarrows(int numberofarrows) {
        this.numberofarrows = numberofarrows;
    }

    private int machinegun;


    public int getMachineGun() {
        return machinegun;
    }

    public void setMachineGun(int machineGun) {
        this.machinegun = machineGun;
    }

    public String printInfo(){
        return  getDamage()  +": "+ getHealth() +": "+ getNumberofarrows() + ":" + getMachineGun();
    }
}

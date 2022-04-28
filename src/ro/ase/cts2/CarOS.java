package ro.ase.cts2;

public class CarOS implements SistemOperare{
    public String lastUpdate;


    @Override
    public void update() {

    }
    public void printLastUpdate()
    {
        System.out.println(this.lastUpdate);
    }

}

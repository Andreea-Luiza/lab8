package ro.ase.cts2;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer {
    public String updatePackage;
    public List<SistemOperare> listObservers=new ArrayList<>();

    public void addOS(SistemOperare s)
    {
        this.listObservers.add(s);
    }

    public void deleteOS(SistemOperare s)
    {
        this.listObservers.remove(s);
    }

    public void pushUpdates()
    {

    }
}

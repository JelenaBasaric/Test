package dummy;

/**
 *
 * @author Jelena Basaric
 */
public class Dummy {
   private int idPaket=1;
    private int len=16;
    private int id;
    private int delay;

    public Dummy(int id, int delay) {
        this.id = id;
        this.delay = delay;
    }

    public Dummy() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getIdPaket() {
        return idPaket;
    }

    public int getLen() {
        return len;
    }

    public int getId() {
        return id;
    }

    public int getDelay() {
        return delay;
    }
    

    
   

   
    
    
    
    
    
}

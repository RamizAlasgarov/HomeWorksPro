package _2024_05_03summury.rollingStock;

public class Lokomotiv {
    private int id;

    public Lokomotiv(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void getFirstVagon(PodvijnoySostav podvijnoySostav){
        System.out.printf(" lokomotiv %d otcepil vagon % d%n ",this.id,podvijnoySostav.otcepitPerviyVagon().getId());
    }

    public void getLastVagon(PodvijnoySostav podvijnoySostav){
        System.out.printf(" lokomotiv %d otcepil vagon %d%n ",this.id,podvijnoySostav.otcepitPosledniyVagon().getId());
    }
}

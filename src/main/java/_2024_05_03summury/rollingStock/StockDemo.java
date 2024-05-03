package _2024_05_03summury.rollingStock;

/**
 * С помощью Deque реализуйте ситуацию:
 * на путях станции стоит состав из вагонов (без локомотива).
 * Станционным локомотивам нужно разобрать состав.
 * Один локомотив может брать один вагон с одной стороны состава,
 * а другой локомотив – с другой стороны состава.
 * У каждого вагона должен быть уникальный номер.
 */
public class StockDemo {
    public static void main(String[] args) {
        Vagon vagon = new Vagon(10);
        Vagon vagon1 = new Vagon(20);
        Vagon vagon2 = new Vagon(30);
        Vagon vagon3 = new Vagon(40);
        Vagon vagon4 = new Vagon(50);

        PodvijnoySostav podvijnoySostav = new PodvijnoySostav();
        podvijnoySostav.addLastVagon(vagon);
        podvijnoySostav.addLastVagon(vagon1);
        podvijnoySostav.addLastVagon(vagon2);
        podvijnoySostav.addLastVagon(vagon3);
        podvijnoySostav.addLastVagon(vagon4);

        Lokomotiv lokomotiv = new Lokomotiv(10);
        Lokomotiv lokomotiv1 = new Lokomotiv(20);

        while (!podvijnoySostav.isEmpty()){
            lokomotiv.getFirstVagon(podvijnoySostav);
            if(podvijnoySostav.isEmpty()){
                break;
            }
            lokomotiv1.getLastVagon(podvijnoySostav);
        }

    }
}

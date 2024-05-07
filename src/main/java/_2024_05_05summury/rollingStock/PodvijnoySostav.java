package _2024_05_05summury.rollingStock;

import java.util.ArrayDeque;
import java.util.Deque;

public class PodvijnoySostav {
    private Deque<Vagon> vagons;

    public PodvijnoySostav() {
        this.vagons = new ArrayDeque<>();
    }

    public void addFirstVagon(Vagon vagon) {
        vagons.addFirst(vagon);
    }

    public void addLastVagon(Vagon vagon) {
        vagons.addLast(vagon);
    }

    public Vagon otcepitPerviyVagon() {
        return vagons.removeFirst();
    }

    public Vagon otcepitPosledniyVagon() {
        return vagons.removeLast();
    }

    @Override
    public String toString() {
        return "PodvijnoySostav{" +
                "vagons=" + vagons +
                '}';
    }
    public boolean isEmpty(){
       return vagons.isEmpty();
    }
}

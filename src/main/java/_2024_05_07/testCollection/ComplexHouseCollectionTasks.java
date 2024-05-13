package _2024_05_07.testCollection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComplexHouseCollectionTasks {

    // Задание 1: Вернуть список коробок, которые пролезут в дверной проем по высоте во всех домах (List)
    public static List<Box> getBoxesThatFitThroughDoorways(List<House> houses) {
        Doorway doorway = new Doorway();
        List<Box> fittingBoxes = new ArrayList<>();

        // Просто пытался сделать через стримы но не до конца получилось
        //List<Stream<Double>> boxes = houses.stream().map(l->l.flats.stream().flatMap(r->r.roomList.stream().flatMap(b->b.boxes.stream().map(d->d.height)))).collect(Collectors.toList());;
        for (House house : houses) {
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    for (Box box : room.boxes) {
                        if(box == null){
                            throw new BoxNotFoundException(ErrorMessage.BOX_NOT_FOUND);
                        }
                        if(box.height < doorway.height){
                            fittingBoxes.add(box);
                        }
                    }
                }
            }
        }
        return fittingBoxes;
    }


    // Задание 2: Вернуть количество квартир, в которых хотя бы одна комната не содержит коробок (List)
    public static int countFlatsWithEmptyRooms(List<House> houses) throws RoomNotFoundException {
        int count = 0;
        for (House house : houses) {
            if(house.flats == null){
                throw new FlatNotFoundException(ErrorMessage.FLAT_NOT_FOUND);
            }
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    if(room == null){
                        throw new RoomNotFoundException(ErrorMessage.ROOM_NOT_FOUND);
                    }
                    if(room.boxes == null){
                        throw new BoxNotFoundException(ErrorMessage.BOX_NOT_FOUND);
                    }
                    if(room.boxes.isEmpty()){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Задание 3: Вернуть среднюю высоту дверных проемов всех комнат во всех домах (List)
    public static double getAverageDoorwayHeight(List<House> houses) {
        double totalHeight = 0;
        int count = 0;
        for (House house : houses) {
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    totalHeight+=room.height;
                    count++;
                }
            }
        }

        return count > 0 ? totalHeight / count : 0;
    }

    // Задание 4: Определить, есть ли дом, где каждая квартира имеет хотя бы одну зеленую комнату (List)
    public static boolean isThereAHouseWithAllFlatsHavingAGreenRoom(List<House> houses) {
        for (House house : houses) {
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    if(Objects.equals(room.color,"green")){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Задание 5: Вернуть карту, где ключи — это номера этажей, а значения — списки всех коробок на этом этаже (List, Map)
    public static Map<Integer, List<Box>> getBoxesPerFloor(List<House> houses) {
        Map<Integer, List<Box>> boxesByFloor = new HashMap<>();
        for (House house : houses) {
            for (Flat flat : house.flats) {
                for (Room room : flat.roomList) {
                    boxesByFloor.put(flat.floor,room.boxes);
                }

            }
        }
        return boxesByFloor;
    }

    public static void main(String[] args) throws RoomNotFoundException {
        List<House> houses = HouseGenerator.generateHouses(777);

        System.out.println("Коробки, подходящие по высоте для дверных проемов: " + getBoxesThatFitThroughDoorways(houses).size());
        System.out.println("Квартиры с хотя бы одной пустой комнатой: " + countFlatsWithEmptyRooms(houses));
        System.out.println("Средняя высота дверных проемов: " + getAverageDoorwayHeight(houses));
        System.out.println("Дом с квартирами, в каждой из которых есть зеленая комната: " + isThereAHouseWithAllFlatsHavingAGreenRoom(houses));
        System.out.println("Коробки по этажам: " + getBoxesPerFloor(houses));
    }
}

class BoxNotFoundException extends RuntimeException{
    public BoxNotFoundException(String message) {
        super(message);
    }
}

class FlatNotFoundException extends RuntimeException{
    public FlatNotFoundException(String message) {
        super(message);
    }
}
class RoomNotFoundException extends Exception{
    public RoomNotFoundException(String message) {
        super(message);
    }
}
class ErrorMessage{
    public static final String BOX_NOT_FOUND = "BOX_NOT_FOUND";
    public static final String FLAT_NOT_FOUND = "FLAT_NOT_FOUND";
    public static final String ROOM_NOT_FOUND = "ROOM_NOT_FOUND";
}


import java.util.HashMap;

public class Itinerary {
    
    public static String findItinerary(HashMap<String,String> maps) {
        HashMap<String,String> revMap = new HashMap<>();

        for(String key: maps.keySet()){
            revMap.put(maps.get(key),key);
        }
        for(String key: maps.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> maps = new HashMap<>();
        maps.put("Chennai","Bengaluru");
        maps.put("Mumbai","Delhi");
        maps.put("Goa","Chennai");
        maps.put("Delhi","Goa");
        // System.out.println(findItinerary(maps));
        String start = findItinerary(maps);
        System.out.print(start);
        for(String key: maps.keySet()){
            System.out.print("->"+maps.get(start));
            start = maps.get(start);
        }
    }
}

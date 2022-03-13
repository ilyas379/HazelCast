//import com.hazelcast.client.HazelcastClient;
//import com.hazelcast.client.config.ClientConfig;
//import com.hazelcast.collection.IQueue;
//import com.hazelcast.core.HazelcastInstance;
//import com.hazelcast.map.IMap;
//
//import java.text.SimpleDateFormat;
//import java.util.Map;
//
//public class Client {
//    public static void main(String[] args) {
//        ClientConfig clientConfig = new ClientConfig();
//
//        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
//
//        IMap<Integer, String> map = client.getMap("myMap");
//        map.put(1, "Vasya");
//        map.put(2, "Petya");
//        map.put(3, "Kolya");
//
//        System.out.println("Map size: " + map.size());
//        String name = map.remove(2);
//        System.out.println("Map size: " + map.size());
//
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(map.getEntryView(1).getCreationTime()));
//
//        IQueue<String> queue = client.getQueue("myQueue");
//        queue.add(name);
//        System.out.println("Queue size: " + queue.size());
//        name = queue.poll();
//        System.out.println("Queue size: " + queue.size() + ", name: " + name);
//
//
//    }
//}

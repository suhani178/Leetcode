import java.util.*;

class SnapshotArray {

    private TreeMap<Integer, Integer>[] map;
    private int snapId = 0;

    public SnapshotArray(int length) {

        map = new TreeMap[length];

        for (int i = 0; i < length; i++) {
            map[i] = new TreeMap<>();

            // initially every value is 0 at snap 0
            map[i].put(0, 0);
        }
    }

    public void set(int index, int val) {

        map[index].put(snapId, val);
    }

    public int snap() {

        return snapId++;
    }

    public int get(int index, int snap_id) {

        return map[index].floorEntry(snap_id).getValue();
    }
}
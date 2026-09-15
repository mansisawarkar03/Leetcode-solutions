class RandomizedSet {

    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {

        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);

        // Get last element
        int last = list.get(list.size() - 1);

        // Put last element at val's position
        list.set(index, last);

        // Update last element's index
        map.put(last, index);

        // Remove last element
        list.remove(list.size() - 1);

        // Remove val from map
        map.remove(val);

        return true;
    }

    public int getRandom() {

        int index = (int)(Math.random() * list.size());

        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
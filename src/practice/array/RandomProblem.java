package practice.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

class RandomizedSet {
    ArrayList<Integer> nums;
    HashMap<Integer, Integer> locs;
    java.util.Random rand = new java.util.Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        nums = new ArrayList<Integer>();
        locs = new HashMap<Integer, Integer>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean contain = locs.containsKey(val);
        if ( contain ) return false;
        locs.put( val, nums.size());
        nums.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean contain = locs.containsKey(val);
        if ( ! contain ) return false;
        int loc = locs.get(val);
        if (loc < nums.size() - 1 ) { // not the last one than swap the last one with this val
            int lastone = nums.get(nums.size() - 1 );
            nums.set( loc , lastone );
            locs.put(lastone, loc);
        }
        locs.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return nums.get( rand.nextInt(nums.size()) );
    }

    @Override
    public String toString() {
        return "RandomizedSet{" +
                "nums=" + nums +
                ", locs=" + locs +
                ", rand=" + rand +
                '}';
    }
}

public class RandomProblem {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet);

        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet);

        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet);

        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet);

        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet);

        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet);

        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet);
    }
}

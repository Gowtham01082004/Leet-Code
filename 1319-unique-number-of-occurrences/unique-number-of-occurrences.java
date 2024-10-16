

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        return helper(list);
    }

    public boolean helper(ArrayList<Integer> ls) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < ls.size(); i++) {
            if (set.contains(ls.get(i))) {
                return false;
            }
            set.add(ls.get(i));
        }
        return true;
    }
}

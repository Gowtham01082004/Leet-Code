class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            map.put(stone, map.getOrDefault(stone, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            count += map.getOrDefault(jewel, 0);
        }

        return count;
    }
}
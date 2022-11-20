class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int output=0;
        Arrays.sort(people);
        int max = people.length - 1;
        int min = 0;
        for (int i = 0; i < people.length; i++) {
            if (max < min) {
                return output;
            } //if
            if ((people[max] + people[min]) > limit) {
                max--;
            } else {
                max--;
                min++;
            } //if
            output++;
        } //for
        return output;
    } //numRescueBoats
} // Solution

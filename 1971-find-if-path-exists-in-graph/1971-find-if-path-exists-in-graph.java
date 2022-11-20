class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        
        HashMap <Integer, List<Integer>> lookup = new HashMap <> ();
        Queue <Integer> q = new LinkedList<> ();
        HashSet <Integer> seen = new HashSet <> ();
        
        for (int [] edge : edges) {
            if (!lookup.containsKey(edge[0])) lookup.put(edge[0], new ArrayList <Integer> ());
            if (!lookup.containsKey(edge[1])) lookup.put(edge[1], new ArrayList <Integer> ());
            lookup.get(edge[0]).add(edge[1]);
            lookup.get(edge[1]).add(edge[0]);
        } //for
        
        q.offer(source);
        seen.add(source);
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            seen.add(curr);
            for (int next : lookup.get(curr)) {
                if (next == destination) return true;
                else if (!seen.contains(next))q.offer(next);
            } //for
        } //while
        
        return false;
    } //validPath
} //Solution

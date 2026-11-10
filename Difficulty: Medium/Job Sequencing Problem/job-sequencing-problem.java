class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < profit.length; i++) {
            jobs.add(new int[]{deadline[i], profit[i]});
        }

        Collections.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        });

        int currentSlot = jobs.get(jobs.size() - 1)[0];
        int ptr = jobs.size() - 1;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[1], a[1]);
            }
        });

        int jobsDone = 0;
        int totalProfit = 0;
        while (ptr >= 0 && currentSlot >= 1) {

            if (jobs.get(ptr)[0] >= currentSlot) {
                maxHeap.offer(jobs.get(ptr));
                ptr--;
            } else {
                if (!maxHeap.isEmpty()) {
                    int[] bestJob = maxHeap.poll();
                    jobsDone++;
                    totalProfit += bestJob[1];
                }
                currentSlot--;
            }
        }

        while (currentSlot >= 1) {

            if (!maxHeap.isEmpty()) {
                int[] bestJob = maxHeap.poll();
                jobsDone++;
                totalProfit += bestJob[1];
            }
            currentSlot--;
        }
        return new ArrayList<>(Arrays.asList(jobsDone, totalProfit));
    }
}
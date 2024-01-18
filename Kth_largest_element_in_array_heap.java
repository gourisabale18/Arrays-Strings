//Time Complexity
//n log(k) ->n times * time to insert k elements
class Solution {
    public int findKthLargest(int[] nums, int k) {

        //create min heap of k elements
        //follows natural ordering asc
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            //fill k elements into min heap initially
            if(pq.size()<k)
            {
                pq.add(nums[i]);
            }
            else
            {
                if(pq.peek()<nums[i])
                {
                    pq.poll();//remove top element
                    pq.add(nums[i]);//insert new element and heapify
                }
            }
            
        }
        return pq.peek();
    }
}
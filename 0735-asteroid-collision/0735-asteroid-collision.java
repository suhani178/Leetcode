class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int size : asteroids){
            boolean collide = false;
            while(!stack.isEmpty() && stack.peek() > 0 && size < 0){
                if(Math.abs(size) > stack.peek()){
                    stack.pop();
                    continue;
                }
                if(Math.abs(size) == stack.peek()){
                    stack.pop();
                }
                collide = true;
                break;

            }
            if(!collide){
                stack.push(size);
            }
        }
        int[] finalAsteroids = new int[stack.size()];
        for(int i = finalAsteroids.length-1; i>=0; --i){
            finalAsteroids[i] = stack.pop();
        }
        return finalAsteroids;
    }
}
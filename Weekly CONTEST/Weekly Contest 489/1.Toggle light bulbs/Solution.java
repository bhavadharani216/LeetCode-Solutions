class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean [] light= new boolean[101];

        for(int bulb: bulbs){
            light[bulb]=!light[bulb];
        }
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<=100;i++){
            if (light[i]) {
                result.add(i);
            }
        }
        return result;
        
    }
}
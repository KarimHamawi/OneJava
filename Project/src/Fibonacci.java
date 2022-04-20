public class Fibonacci {
    private int[] array = new int[999];
    public Fibonacci() {}
    public int[] generate() {
    int current = 1;
    int prev = 1;
    int prevprev = 0;
    for(int i = 0; i < 999; i++) { 
    array[i] = current;
    current = prev + prevprev; 
    prevprev = prev; 
    prev = current; 
    }
    return array;
    }
}
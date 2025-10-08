class ForTest {
public static void main(String args[]) {
/*int x;
for(x = 0; x<10; x = x+1)
System.out.println("This is x: " + x);*/
    int x, y;
/*y = 20;
// the target of this loop is a block
for(x = 0; x<10; x++) {
System.out.println("This is x: " + x);
System.out.println("This is y: " + y);
y = y - 2;*/

// here, n is declared inside of the for loop
for(int n=10; n>0; n--)
System.out.println("tick " + n);
}
}

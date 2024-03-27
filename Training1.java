public class Training1 {

public static void main(String[] args)
{
	int input1 = 1;
	int input2 = 2;
Training1 add1 = new Training1();
int aes = add1.add(input1,input2);
int sefe= add1.sub(input1,input2);
int xyz = add1.mul(input1,input2,input1);
	System.out.println(aes);
	System.out.println(sefe);
	System.out.println(xyz);
}

public int add(int v , int x)
{
	int output = v+x;
	return output;
}
public int sub(int r, int c)
{
	int output2 = r-c;
	return output2;
}

public int mul (int q,int b,int c){
	return q*b*c;
}

}
